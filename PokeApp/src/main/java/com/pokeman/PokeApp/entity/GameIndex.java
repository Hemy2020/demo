package com.pokeman.PokeApp.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gameIndex"
	})
public class GameIndex {

    @JsonProperty("gameIndex")
	private Integer gameIndex;

	public Integer getGameIndex() {
	return gameIndex;
	}

	public void setGameIndex(Integer gameIndex) {
	this.gameIndex = gameIndex;
	}
}
