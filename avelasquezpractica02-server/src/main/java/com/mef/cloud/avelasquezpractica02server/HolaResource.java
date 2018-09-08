package com.mef.cloud.avelasquezpractica02server;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/hola/server")
public class HolaResource {
	
	
	@GetMapping
	@RequestMapping ("/{id}")
	public String hola(@PathVariable("id") String id) {
	
		id = id+" Buen Día ";
		return "Hola "+id;
	}
}
