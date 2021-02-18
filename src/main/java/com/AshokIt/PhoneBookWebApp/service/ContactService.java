package com.AshokIt.PhoneBookWebApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.AshokIt.PhoneBookWebApp.model.Contact;
@Service
public interface ContactService {
	public boolean addContact(Contact contact);
	public Contact deletContact(int id);
	public void editContact(int id);
	public List viewContact();

}
