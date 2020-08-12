package com.pokeman.PokeApp.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baseStat",
    "effort"
})
public class Stat {
	
    @JsonProperty("baseStat")
	private Integer baseStat;
    @JsonProperty("effort")
	private Integer effort;

	public Integer getBaseStat() {
	return baseStat;
	}

	public void setBaseStat(Integer baseStat) {
	this.baseStat = baseStat;
	}

	public Integer getEffort() {
	return effort;
	}

	public void setEffort(Integer effort) {
	this.effort = effort;
	}
}
