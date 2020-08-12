package com.pokeman.PokeApp.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "slot"
})
public class Type {
	
    @JsonProperty("slot")
	private Integer slot;
	
	public Integer getSlot() {
	return slot;
	}

	public void setSlot(Integer slot) {
	this.slot = slot;
	}
}
