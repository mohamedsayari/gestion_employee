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
public class MissionDTO {
	  private Long id ;
	    private String name ;
	    private String period ;
	    
}
