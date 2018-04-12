package com.carcom.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carcom.dao.ContactMapper;
import com.carcom.dao.MessageMapper;
import com.carcom.dao.UserMapper;
import com.carcom.entity.Contact;
import com.carcom.entity.Message;
import com.carcom.entity.User;

@Service
public class ComService {

	@Autowired
	ContactMapper contactMapper;

	@Autowired
	MessageMapper messageMapper;

	@Autowired
	UserMapper userMapper;

	public Map<String, Object> addUser(String userName, String carNumber) {
		Map<String, Object> map = new HashMap<>();
		User user = new User();
		user.setCarNumber(carNumber);
		user.setUserName(userName);
		userMapper.insertSelective(user);
		List<User> users = userMapper.selectByCarNumber(carNumber);
		
		map.put("success", true);
		map.put("message", "设置成功！");
		map.put("userId", users.get(0).getUserId());
		return map;
	}

	public List<Contact> getContacts(int mainUserId) {
		return contactMapper.selectByUserId(mainUserId);
	}

	public Map<String, Object> addContact(int mainUserId, String carNumber) {
		Map<String, Object> map = new HashMap<>();
		List<User> users = userMapper.selectByCarNumber(carNumber);
		if (users.size() == 0) {
			map.put("success", false);
			map.put("message", "用户不存在！");
		} else {
			Contact contact = new Contact();
			contact.setMainUserId(mainUserId);
			contact.setContactUserId(users.get(0).getUserId());
			contactMapper.insertSelective(contact);
			contact.setMainUserId(contact.getContactUserId());
			contact.setContactUserId(mainUserId);
			contactMapper.insertSelective(contact);

			map.put("success", true);
			map.put("message", "添加成功！");
		}
		return map;
	}
	
	public List<Message> getMessages(int mainUserId, int contactUserId) {
		return messageMapper.searchMessageByTime(mainUserId, contactUserId);
	}
	
	public User getUser(int userId) {
		return userMapper.selectByUserId(userId);
	}
	
	public void setMessage(Message message) {
		messageMapper.insertSelective(message);
	}
}
