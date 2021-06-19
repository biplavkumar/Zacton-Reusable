package com.zacton.reusable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DOMAIN_MASTER")
public class DomainMasterEntity {
	
	@Id
	@Column(name="DOMAIN_ID")
	private int domainId;
	
	@Column(name="DOMAIN_NAME")
	private String domainName;
	
	@Column(name="ACTIVE_FLAG")
	private char activeFlag;
	
	@OneToMany(mappedBy="domainMasterEntity")
	List<CustomerInputEntity> customerInputEntity;
	
	@OneToMany(mappedBy="domainMasterEntity")
	List<ProjectCategoryMasterEntity> projectCategoryMasterEntity;

	public int getDomainId() {
		return domainId;
	}

	public void setDomainId(int domainId) {
		this.domainId = domainId;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public char getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(char activeFlag) {
		this.activeFlag = activeFlag;
	}

	public List<CustomerInputEntity> getCustomerInputEntity() {
		return customerInputEntity;
	}

	public void setCustomerInputEntity(List<CustomerInputEntity> customerInputEntity) {
		this.customerInputEntity = customerInputEntity;
	}
	
	public List<ProjectCategoryMasterEntity> getProjectCategoryMasterEntity() {
		return projectCategoryMasterEntity;
	}

	public void setProjectCategoryMasterEntity(List<ProjectCategoryMasterEntity> projectCategoryMasterEntity) {
		this.projectCategoryMasterEntity = projectCategoryMasterEntity;
	}

	@Override
	public String toString() {
		return "DomainMasterEntity [domainId=" + domainId + ", domainName=" + domainName + ", activeFlag=" + activeFlag
				+ "]";
	}
	
	

}
