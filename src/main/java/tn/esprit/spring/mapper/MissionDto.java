package tn.esprit.spring.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MissionDto {

	@JsonProperty("id")
    private int id;

  
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("description")
    private String description;

    
}