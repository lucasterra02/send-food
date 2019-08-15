package com.terra.sendfood.resources;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.terra.sendfood.domain.services.DBService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	DBService dbService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Void> find() {
		
		try {
			dbService.instantiateTestDatabase();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
