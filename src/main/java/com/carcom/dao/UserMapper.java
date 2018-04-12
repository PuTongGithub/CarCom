package com.carcom.dao;

import java.util.List;

import com.carcom.entity.User;

public interface UserMapper {
	public void insertSelective(User user);
	
	public List<User> selectUsers();
	
	public User selectByUserId(int userId);
	
	public List<User> searchUser(String key);
	
	public List<User> selectByCarNumber(String carNumber);
}
