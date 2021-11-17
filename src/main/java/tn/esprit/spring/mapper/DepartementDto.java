package tn.esprit.spring.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartementDto {

	@JsonProperty("id")
    private int id;

  
    @JsonProperty("name")
    private String name;


	public int getId() {
		return id;
	}

    

}
