package com.carcom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.carcom.entity.Message;

@Mapper
public interface MessageMapper {
	public void insertSelective(Message message);
	
	public List<Message> selectMessages();
	
	public Message selectByMsgId(int msgId);
	
	public List<Message> searchMessageByTime(int mainUserId, int contactUserId);
}
