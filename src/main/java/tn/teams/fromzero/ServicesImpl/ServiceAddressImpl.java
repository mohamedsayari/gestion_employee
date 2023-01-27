package tn.teams.fromzero.ServicesImpl;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tn.teams.fromzero.dto.AddressDTO;
import tn.teams.fromzero.entities.Address;
import tn.teams.fromzero.repositories.AddressRepository;
import tn.teams.fromzero.services.ServiceAddress;
import tn.teams.fromzero.validations.ObjectsValidator;




@Service
@RequiredArgsConstructor
public class ServiceAddressImpl   implements ServiceAddress {
	
	private final  AddressRepository addressRepository ;

	private final   ObjectsValidator<AddressDTO> objectsValidator;
	
	@Override
	public AddressDTO save(AddressDTO dto) {
		
		
		 objectsValidator.validate(dto);
	        Address address = AddressDTO.toEntity(dto);

	        Address savedAddress= addressRepository.save(address);
	        return AddressDTO.fromEntity(savedAddress);

	}

	@Override
	public void delete(Long id) {
		Address  address = addressRepository.findById(id).orElseThrow(()->new EntityNotFoundException(id+" not found"));
		addressRepository.deleteById(id);
		
	}

	@Override
	public AddressDTO findById(Long id) {
        return addressRepository.findById(id).map(AddressDTO::fromEntity)
                .orElseThrow(() -> new EntityNotFoundException("No Employee was found with the provided ID"));

	}

	@Override
	public List<AddressDTO> findAllAddresss() {
		 return addressRepository.findAll()
	                .stream()
	                .map(AddressDTO::fromEntity)
	                .collect(Collectors.toList());
	    }

}
