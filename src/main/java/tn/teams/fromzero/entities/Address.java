package tn.teams.fromzero.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {

	 @Id
	    @GeneratedValue (strategy = GenerationType.AUTO)
	    private Long id ;
	    private String street;
	    private String housnumber;
	    private String  zipcode;
	    
	    
	    @OneToOne
	    private Employee  employee ;

}
