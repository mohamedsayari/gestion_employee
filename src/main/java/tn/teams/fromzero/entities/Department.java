package tn.teams.fromzero.entities;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Department {

	 @Id
	    @GeneratedValue (strategy = GenerationType.AUTO)
	    private Long id ;
	 /* one to  many **/
	 @OneToMany (mappedBy = "department")
	 private List<Employee> employees;
	 
}
