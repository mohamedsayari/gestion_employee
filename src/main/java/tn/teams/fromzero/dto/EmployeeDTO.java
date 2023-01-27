package tn.teams.fromzero.dto;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.teams.fromzero.entities.Employee;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class EmployeeDTO {

    private Long id ;

    @NotBlank
    @NotEmpty (message = "le fullName doit etre not empty")
    @Size(max = 50 , min = 4)
    private String fullName ;

    @Min(value = 20,message = "l'age doit etre sup a 20 ans")
    @Max(value = 62,message = "l'age doit etre inf a 62 ans")
    private Integer age ;

    @Email(message = "l'email doit etre dans la format adéquate")
    private String email ;
   
  
    private AddressDTO  addressdto ;
    
    public static EmployeeDTO fromEntity(Employee employee){
        return EmployeeDTO.builder()
                .id(employee.getId())
                .age(employee.getAge())
                .email(employee.getEmail())
                .fullName(employee.getFullName())
                .addressdto(AddressDTO.fromEntity(employee.getAddress()))
                .build();
    }
    public static Employee toEntity(EmployeeDTO dto){
        return Employee.builder()
                .id(dto.getId())
                .age(dto.getAge())
                .email(dto.getEmail())
                .fullName(dto.getFullName())
                .address(AddressDTO.toEntity(dto.getAddressdto()))
                .build();
    }
}
