package com.carcom.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carcom.entity.Contact;
import com.carcom.entity.Message;
import com.carcom.entity.User;
import com.carcom.service.ComService;

@RestController
@RequestMapping("/com")
public class ComController {
	
	@Autowired
	ComService comService;
	
	@RequestMapping("/addUser")
	public Map<String, Object> addUser(String userName, String carNumber){
		return comService.addUser(userName, carNumber);
	}
	
	@RequestMapping("/getContacts")
	public List<Contact> getContacts(int mainUserId){
		return comService.getContacts(mainUserId);
	}
	
	@RequestMapping("/addContact")
	public Map<String, Object> addContact(int mainUserId, String carNumber){
		return comService.addContact(mainUserId, carNumber);
	}
	
	@RequestMapping("/getMessages")
	public List<Message> getMessages(int mainUserId, int contactUserId){
		return comService.getMessages(mainUserId, contactUserId);
	}
	
	@RequestMapping("/getUser")
	public User getUser(int userId) {
		return comService.getUser(userId);
	}
	
	@RequestMapping("/setMessage")
	public void setMessage(Message message) {
		comService.setMessage(message);
	}
}
