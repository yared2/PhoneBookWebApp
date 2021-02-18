package com.AshokIt.PhoneBookWebApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AshokIt.PhoneBookWebApp.model.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
