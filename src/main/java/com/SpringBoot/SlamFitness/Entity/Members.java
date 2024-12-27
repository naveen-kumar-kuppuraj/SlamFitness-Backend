package com.SpringBoot.SlamFitness.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Members {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 private String name;
 private String mobile;
 private String	email;
 private String message;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "Members [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", message=" + message
			+ "]";
}
	
	

}
