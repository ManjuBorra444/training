package com.attra.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVesionofPerson() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVesionofPerson() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVesionofPersonRequestParam() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSecondVesionofPersonRequestParam() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person/Header", headers = "X-API-VERSION=1")
	public PersonV1 getFirstVesionofPersonHeader() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person/Header", headers = "X-API-VERSION=2")
	public PersonV2 getSecondVesionofPersonHeader() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-V1+json")
	public PersonV1 getFirstVesionofPersonAccept() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-V2+json")
	public PersonV2 getSecondVesionofPersonAccept() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
}
