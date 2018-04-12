package com.carcom.entity;

public class Contact {
	private int contactId;
	private int mainUserId;
	private int contactUserId;
	private int status;
	
	public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
    
    public int getMainUserId() {
        return mainUserId;
    }

    public void setMainUserId(int mainUserId) {
        this.mainUserId = mainUserId;
    }
    
    public int getContactUserId() {
        return contactUserId;
    }

    public void setContactUserId(int contactUserId) {
        this.contactUserId = contactUserId;
    }
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}