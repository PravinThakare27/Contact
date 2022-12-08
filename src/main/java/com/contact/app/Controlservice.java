package com.contact.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Controlservice {
List<Contact> c=Arrays.asList(new Contact(1,"453949056","Pravin",11),new Contact(2,"46363496843","Sanjay",11),new Contact(3,"563463496849","Prathmesh",12));

public List<Contact> getcontactbyownerid(int id){
	return c.stream().filter(a->a.ownerid==id).toList();
}
public List<Contact> allcontact(){
	return c;
}
public Contact getcontactbyid(int id) {
	return(Contact) c.stream().filter(a->a.id==id);
}

}
