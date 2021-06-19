package com.zacton.reusable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="PROFESSION_MASTER")
public class ProfessionMasterEntity {
	
	@Id
	@Column(name="PROFESSION_ID")
	private int professionId;
	
	@Column(name="PROFESSION_NAME")
	private String professionName;
	
	@Column(name="ACTIVE_FLAG")
	private char activeFlag;
	
	@OneToMany(mappedBy="professionMasterEntity")
	List<UserMasterEntity> userMasterEntity;
	
	@ManyToOne
	@JoinColumn(name="ROLE_ID", referencedColumnName="ROLE_ID")
	@JsonIgnore
	private RoleMasterEntity roleMasterEntity;

	public int getProfessionId() {
		return professionId;
	}

	public void setProfessionId(int professionId) {
		this.professionId = professionId;
	}

	public String getProfessionName() {
		return professionName;
	}

	public void setProfessionName(String professionName) {
		this.professionName = professionName;
	}

	public char getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(char activeFlag) {
		this.activeFlag = activeFlag;
	}

	public List<UserMasterEntity> getUserMasterEntity() {
		return userMasterEntity;
	}

	public void setUserMasterEntity(List<UserMasterEntity> userMasterEntity) {
		this.userMasterEntity = userMasterEntity;
	}

	public RoleMasterEntity getRoleMasterEntity() {
		return roleMasterEntity;
	}

	public void setRoleMasterEntity(RoleMasterEntity roleMasterEntity) {
		this.roleMasterEntity = roleMasterEntity;
	}

	@Override
	public String toString() {
		return "ProfessionMasterEntity [professionId=" + professionId + ", professionName=" + professionName
				+ ", activeFlag=" + activeFlag + ", userMasterEntity=" + userMasterEntity + ", roleMasterEntity="
				+ roleMasterEntity + "]";
	}
}
