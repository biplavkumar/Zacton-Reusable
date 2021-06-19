package com.zacton.reusable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Telling the JPA that this is an Entity:
@Entity
@Table(name="CONTACT_MASTER")
public class ContactMasterEntity {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CONTACT_ID")
	private int contactId;
	
	@Column(name="MOBILE_NO")
	private long mobileNo;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="INSTAGRAM_ID")
	private String instagramId;
	
	@Column(name="FACEBOOK_ID")
	private String facebookId;
	
	@Column(name="ACTIVE_FLAG")
	private char activeFlag;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInstagramId() {
		return instagramId;
	}

	public void setInstagramId(String instagramId) {
		this.instagramId = instagramId;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public char getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(char activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Override
	public String toString() {
		return "ContactMasterEntity [contactId=" + contactId + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", address=" + address + ", instagramId=" + instagramId + ", facebookId=" + facebookId
				+ ", activeFlag=" + activeFlag + "]";
	}
	
	
}
