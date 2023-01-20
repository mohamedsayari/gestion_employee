package tn.teams.fromzero.entities;
import lombok.*;

import java.util.List;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id ;

    @Column(name = "nom_prenom", nullable = false)
    private String fullName ;
    private Integer age ;

    @Column(unique = true)
    private String email ;
    /*  one to  one  **/
    @OneToOne(mappedBy = "employee")
    private Address  address ;
    
    /* many to one **/
    
  @ManyToOne ()
  @JoinColumn(name="fkdepartment")
  private Department  department;
  /*  many   to  many **/
  @ManyToMany
 
  @JoinTable 
  (name="Employee_Mission", 
		  joinColumns = @JoinColumn(name="Employee_Id"),
		  inverseJoinColumns = @JoinColumn(name="Mission_Id")
  )
  private List<Mission> mission;
}
