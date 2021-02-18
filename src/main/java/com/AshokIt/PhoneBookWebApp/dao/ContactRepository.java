package com.AshokIt.PhoneBookWebApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AshokIt.PhoneBookWebApp.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
