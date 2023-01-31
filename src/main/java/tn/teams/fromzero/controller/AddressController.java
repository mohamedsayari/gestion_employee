package tn.teams.fromzero.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.teams.fromzero.dto.AddressDTO;
import tn.teams.fromzero.services.ServiceAddress;
import tn.teams.fromzero.services.ServiceEmployee;


@RestController 
@RequestMapping("Api/v1/address")
public class AddressController {
	
	private ServiceAddress serviceaddress ;

	@PostMapping("/save")
	public AddressDTO save( @RequestBody  AddressDTO dto) {
		return serviceaddress.save(dto);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(  @PathVariable  Long id) {
		serviceaddress.delete(id);
	}

    @GetMapping("/findbyid/{id}")
	public AddressDTO findById( @PathVariable Long id) {
		return serviceaddress.findById(id);
	}
    @GetMapping("/lister")
	public List<AddressDTO> findAllAddresss() {
		return serviceaddress.findAllAddresss();
	}
	 public AddressController ( ServiceAddress serviceAddress) {
		 super() ;
		this.serviceaddress = serviceAddress;
	}
}
    
	

}
