package tn.teams.fromzero.dto;




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
	  

}
