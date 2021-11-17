package tn.esprit.spring.mapper;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContratDto {

	@JsonProperty("reference")
    private int reference;

  
    @JsonProperty("typeContrat")
    private String typeContrat;

    @JsonProperty("salaire")
    private float salaire;

    @JsonProperty("dateDebut")
    private Date dateDebut;


    

    
    
}
