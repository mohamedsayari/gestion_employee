package tn.teams.fromzero.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.teams.fromzero.entities.Address;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressDTO {
	  private Long id ;
       
	  private String street;
	    private String housnumber;
	    private String  zipcode;
	    
	    private EmployeeDTO  employeedto ;
	  
	    public static AddressDTO fromEntity(Address address){
	    	return AddressDTO.builder()
	 
	        		   .id(address.getId())
	                    .street(address.getStreet())
	                    .housnumber(address.getHousnumber())
	                    .zipcode(address.getZipcode())
	                    /* relation  one to  one **/
	                    .employeedto(EmployeeDTO.fromEntity(address.getEmployee()))
	                    .build();
	        
	    }

	    public static Address toEntity(AddressDTO dto){
	        return Address.builder()
	                .id(dto.getId())
	                .street(dto.getStreet())
	                .housnumber(dto.getHousnumber())
	                .zipcode(dto.getZipcode())
	                /* relation  one to  one **/
	                .employee(EmployeeDTO.toEntity(dto.getEmployeedto()))
	                .build();
	    }
}
