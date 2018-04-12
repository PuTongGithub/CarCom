package com.carcom.entity;

import java.util.Date;

public class Message {
	private int msgId;
	private int sendUserId;
	private int reciveUserId;
	private Date sendTime;
	private String content;
	private int status;
	
	public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }
    
    public int getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(int sendUserId) {
        this.sendUserId = sendUserId;
    }
    
    public int getReciveUserId() {
        return reciveUserId;
    }

    public void setReciveUserId(int reciveUserId) {
        this.reciveUserId = reciveUserId;
    }
    
    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
