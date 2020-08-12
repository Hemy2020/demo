package com.pokeman.PokeApp.controller;

import java.net.URI;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import com.pokeman.PokeApp.entity.Pokemon;

@RestController
@RequestMapping("/api")
public class PokemonRestController {

	//@Autowired
	//PokemanService pokemanService;

	private static final String POKEMON_API = "https://pokeapi.co/api/v2/pokemon?q={name}";

	@Autowired
	RestTemplate restTemplate;
	
	/*@GetMapping(path = "/{name}")
	public String getPokemanList(@PathVariable String name) {
		System.out.println("Inside to fetch pokemon details");
        RestTemplate rt = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters",headers);

		String res= rt.exchange(POKEMON_API, HttpMethod.GET, entity, String.class)
				.getBody();
		
		System.out.println("Response from PokeAPI::"+res);
		
		return res;
	}*/
	
	@GetMapping(path = "/{name}")
	public Pokemon getPokemanList(@PathVariable String name) {
		System.out.println("Inside to fetch pokemon details");
		URI url = new UriTemplate(POKEMON_API).expand(name);
        RestTemplate rt = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters",headers);

		Pokemon pokeman=invokeRestApi(url, Pokemon.class);
		System.out.println(pokeman.getSprites());
		System.out.println(pokeman.getType());
		System.out.println(pokeman.getStat());
		System.out.println(pokeman.getGameIndex());
		System.out.println(pokeman.getHeight());
		System.out.println(pokeman.getWeight());


		System.out.println("Response from PokeAPI::"+pokeman);
		
		return pokeman;
	}
	
	
	private <T> T invokeRestApi(URI url, Class<T> responseType) {
		RequestEntity<?> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
		ResponseEntity<T> exchange = this.restTemplate.exchange(request, responseType);
		return exchange.getBody();
	}
}
