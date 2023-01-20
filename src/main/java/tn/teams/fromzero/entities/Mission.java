package tn.teams.fromzero.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
public class Mission {

	 @Id
	    @GeneratedValue (strategy = GenerationType.AUTO)
	    private Long id ;
	    private String name ;
	    private String period ;
	    /* may  to many **/
	    
	    @ManyToMany( )
	    private List<Employee> employees;
	    

}
