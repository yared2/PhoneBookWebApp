package com.AshokIt.PhoneBookWebApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Contact {
	
	@Id
	@GeneratedValue
	private int id;
	private String  firstName;
	private String  email;
	private String  phoneNumber;


}
