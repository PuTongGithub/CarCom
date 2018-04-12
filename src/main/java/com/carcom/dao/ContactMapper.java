package com.carcom.dao;

import java.util.List;

import com.carcom.entity.Contact;

public interface ContactMapper {
	public void insertSelective(Contact contact);
	
	public List<Contact> selectContacts();
	
	public Contact selectByContactId(int contactId);
	
	public List<Contact> selectByUserId(int userId);
}
