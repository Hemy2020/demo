package com.pokeman.PokeApp.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stat",
    "gameIndex",
    "versions",
    "sprites",
    "type"
})

public class Pokemon {

    @JsonProperty("stat")
	private Stat stat;
    @JsonProperty("gameIndex")
	private GameIndex gameIndex;
    @JsonProperty("versions")
	private Versions versions;
    @JsonProperty("sprites")
	private Sprites sprites;
    @JsonProperty("type")
	private Type type;
    @JsonProperty("weight")
	private Type weight;
    @JsonProperty("height")
	private Double height;

	public Stat getStat() {
		return stat;
	}
	public void setStat(Stat stat) {
		this.stat = stat;
	}
	public GameIndex getGameIndex() {
		return gameIndex;
	}
	public void setGameIndex(GameIndex gameIndex) {
		this.gameIndex = gameIndex;
	}
	public Versions getVersions() {
		return versions;
	}
	public void setVersions(Versions versions) {
		this.versions = versions;
	}
	public Sprites getSprites() {
		return sprites;
	}
	public void setSprites(Sprites sprites) {
		this.sprites = sprites;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Type getWeight() {
		return weight;
	}
	public void setWeight(Type weight) {
		this.weight = weight;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
}