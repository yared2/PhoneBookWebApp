package com.AshokIt.PhoneBookWebApp.service.serviceImple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AshokIt.PhoneBookWebApp.dao.ContactRepository;
import com.AshokIt.PhoneBookWebApp.model.Contact;
import com.AshokIt.PhoneBookWebApp.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository cntctRepo;

	@Override
	public boolean addContact(Contact contact) {
		if (contact != null) {
			cntctRepo.save(contact);
			return true;
		}
		return false;
	}

	@Override
	public Contact deletContact(int id) {

		Optional<Contact> contactToDelt = cntctRepo.findById(id);
		if (contactToDelt.isPresent()) {
			Contact contact = contactToDelt.get();
			cntctRepo.deleteById(id);
			return contact;
		}
		return null;

	}

	@Override
	public void editContact(int id) {
	//	Optional<Contact> contactToDelt = cntctRepo.findById(id);

	}

	@Override
	public List<Contact> viewContact() {
	 List<Contact> contactList = cntctRepo.findAll();
		
		return contactList;
	}




}
