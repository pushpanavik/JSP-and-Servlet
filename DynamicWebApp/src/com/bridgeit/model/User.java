package com.bridgeit.model;

public class User {
private String firstname;
private String lastname;
private int mobilenumber;
private String emailId;
private int age;
private String password;
private String address;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(int mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public User() {
	super();
}
@Override
public String toString() {
	return "User [firstname=" + firstname + ", lastname=" + lastname + ", mobilenumber=" + mobilenumber + ", emailId="
			+ emailId + ", age=" + age + ", password=" + password + ", address=" + address + "]";
}



}
