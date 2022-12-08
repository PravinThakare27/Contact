package com.contact.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact")
public class ContactController {
@Autowired
Controlservice con;
	
	@GetMapping("/Owner/{id}")
	public List<Contact> getcontactbyownerid(int id){
		return con.getcontactbyownerid(id);
	}
	@GetMapping("/allcontact")
	public List<Contact> allContact(){
		return con.allcontact();
	}
	@GetMapping("/{id}")
	public Contact getcontactbyid(int id){
		return con.getcontactbyid(id);
	}
}
