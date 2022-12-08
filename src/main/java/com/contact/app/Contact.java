package com.contact.app;

public class Contact {
int id;
String number;
String username;
int ownerid;
public Contact(int id, String number, String username, int ownerid) {
	super();
	this.id = id;
	this.number = number;
	this.username = username;
	this.ownerid = ownerid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getOwnerid() {
	return ownerid;
}
public void setOwnerid(int ownerid) {
	this.ownerid = ownerid;
}

}
