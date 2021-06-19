package com.zacton.reusable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="USER_MASTER")
public class UserMasterEntity {
	
	@Id
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="MOBILE_NO")
	private long mobileNo;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@ManyToOne
	@JoinColumn(name="PROFESSION_ID",referencedColumnName="PROFESSION_ID")
	@JsonIgnore
	private ProfessionMasterEntity professionMasterEntity;
	
	@Column(name="PASSWORD")
	private String password;
	
	@ManyToOne
	@JoinColumn(name="ROLE_ID", referencedColumnName="ROLE_ID")
	@JsonIgnore
	private RoleMasterEntity roleMasterEntity;
	
	@Column(name="HIGHEST_QUALIFICATION")
	private String highestQualification;
	
	@Column(name="OTHER_PROFESSION")
	private String otherProfession;
	
	@Column(name="ACTIVE_FLAG")
	private char activeFlag;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public ProfessionMasterEntity getProfessionMasterEntity() {
		return professionMasterEntity;
	}

	public void setProfessionMasterEntity(ProfessionMasterEntity professionMasterEntity) {
		this.professionMasterEntity = professionMasterEntity;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleMasterEntity getRoleMasterEntity() {
		return roleMasterEntity;
	}

	public void setRoleMasterEntity(RoleMasterEntity roleMasterEntity) {
		this.roleMasterEntity = roleMasterEntity;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public char getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(char activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getOtherProfession() {
		return otherProfession;
	}

	public void setOtherProfession(String otherProfession) {
		this.otherProfession = otherProfession;
	}

	@Override
	public String toString() {
		return "UserMasterEntity [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNo=" + mobileNo + ", emailId=" + emailId + ", professionMasterEntity="
				+ professionMasterEntity + ", password=" + password + ", roleMasterEntity=" + roleMasterEntity
				+ ", highestQualification=" + highestQualification + ", otherProfession=" + otherProfession
				+ ", activeFlag=" + activeFlag + "]";
	}

	
	
	

}
