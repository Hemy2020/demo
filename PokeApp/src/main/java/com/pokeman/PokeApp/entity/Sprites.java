package com.pokeman.PokeApp.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "backDefault",
    "backFemale",
    "backShiny",
    "backShinyFemale",
    "frontDefault",
    "frontFemale",
    "frontShiny",
    "frontShinyFemale",
    "other",
    "versions"
	})

public class Sprites {

    @JsonProperty("backDefault")
    private String backDefault;
    @JsonProperty("backFemale")
    private Object backFemale;
    @JsonProperty("backShiny")
    private String backShiny;
    @JsonProperty("backShinyFemale")
    private Object backShinyFemale;
    @JsonProperty("frontDefault")
    private String frontDefault;
    @JsonProperty("frontFemale")
    private Object frontFemale;
    @JsonProperty("frontShiny")
    private String frontShiny;
    @JsonProperty("frontShinyFemale")
    private Object frontShinyFemale;


public String getBackDefault() {
return backDefault;
}

public void setBackDefault(String backDefault) {
this.backDefault = backDefault;
}

public Object getBackFemale() {
return backFemale;
}

public void setBackFemale(Object backFemale) {
this.backFemale = backFemale;
}

public String getBackShiny() {
return backShiny;
}

public void setBackShiny(String backShiny) {
this.backShiny = backShiny;
}

public Object getBackShinyFemale() {
return backShinyFemale;
}

public void setBackShinyFemale(Object backShinyFemale) {
this.backShinyFemale = backShinyFemale;
}

public String getFrontDefault() {
return frontDefault;
}

public void setFrontDefault(String frontDefault) {
this.frontDefault = frontDefault;
}

public Object getFrontFemale() {
return frontFemale;
}

public void setFrontFemale(Object frontFemale) {
this.frontFemale = frontFemale;
}

public String getFrontShiny() {
return frontShiny;
}

public void setFrontShiny(String frontShiny) {
this.frontShiny = frontShiny;
}

public Object getFrontShinyFemale() {
return frontShinyFemale;
}

public void setFrontShinyFemale(Object frontShinyFemale) {
this.frontShinyFemale = frontShinyFemale;
}

}
