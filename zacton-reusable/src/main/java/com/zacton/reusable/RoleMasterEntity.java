package com.zacton.reusable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ROLE_MASTER")
public class RoleMasterEntity {

	@Id
	@Column(name="ROLE_ID")
	private int roleId;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	@Column(name="ACTIVE_FLAG")
	private char activeFlag;
	
	@OneToMany(mappedBy="roleMasterEntity")
	private List<UserMasterEntity> userMasterEntity;
	
	@OneToMany(mappedBy="roleMasterEntity")
	private List<ProfessionMasterEntity> professionMasterEntity;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public List<ProfessionMasterEntity> getProfessionMasterEntity() {
		return professionMasterEntity;
	}

	public void setProfessionMasterEntity(List<ProfessionMasterEntity> professionMasterEntity) {
		this.professionMasterEntity = professionMasterEntity;
	}

	@Override
	public String toString() {
		return "RoleMasterEntity [roleId=" + roleId + ", roleName=" + roleName + ", activeFlag=" + activeFlag
				+ ", userMasterEntity=" + userMasterEntity + ", professionMasterEntity=" + professionMasterEntity + "]";
	}

	
	
	
}
