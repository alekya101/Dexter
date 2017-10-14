package com.inheritance;

public class Person {
  String name;
  String DOB;
  int age;
  long phoneno;
  String role;
  String organization;
  String address;
  
  public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getOrganization() {
	return organization;
}
public void setOrganization(String organization) {
	this.organization = organization;
}

  public void salary()
  {
	  System.out.println("This is the current salary of a person");
  }
  public void printname()
  {
	  System.out.println("this is the name");
  }
}
