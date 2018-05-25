package com.bridgeit.model;

public class RegisterFormPojo {
private String First_Name;
private String Last_Name;
private String UserName;
private String Password;
private String Address;
private int Contact_No;
public RegisterFormPojo() {
	super();
}
public String getFirst_Name() {
	return First_Name;
}
public void setFirst_Name(String first_Name) {
	First_Name = first_Name;
}
public String getLast_Name() {
	return Last_Name;
}
public void setLast_Name(String last_Name) {
	Last_Name = last_Name;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getContact_No() {
	return Contact_No;
}
public void setContact_No(int contact_No) {
	Contact_No = contact_No;
}
@Override
public String toString() {
	return "RegisterFormPojo [First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", UserName=" + UserName
			+ ", Password=" + Password + ", Address=" + Address + ", Contact_No=" + Contact_No + "]";
}

}

