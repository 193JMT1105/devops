package tn.esprit.spring.mapper;



import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntrepriseDto {

	@JsonProperty("id")
    private int id;

  
    @JsonProperty("name")
    private String name;

    @JsonProperty("raisonSocial")
    private String raisonSocial;



}
