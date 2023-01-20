package tn.teams.fromzero.services;

import java.util.List;

import tn.teams.fromzero.dto.AddressDTO;



public interface ServiceAddress {
	
	AddressDTO save(AddressDTO dto);
    void delete(Long id);
    AddressDTO findById(Long id);
    List<AddressDTO> findAllAddresss();
   


}
