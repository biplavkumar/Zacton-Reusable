package com.zacton.reusable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="CUSTOMER_INPUT")
public class CustomerInputEntity {

	@Id
	@Column(name="INPUT_ID")
	private int inputId;
	
	@ManyToOne
	@JoinColumn(name="USER_NAME",referencedColumnName="USER_NAME")
	@JsonIgnore
	private UserMasterEntity userMasterEntity;
	
	@Column(name="PROJECT_TITLE")
	private String projectTitle;
	
	@Column(name="PROJECT_DESCRIPTION")
	private String projectDescription;
	
	@ManyToOne
	@JoinColumn(name="SERVICE_ID",referencedColumnName="SERVICE_ID")
	@JsonIgnore
	private ServiceMasterEntity serviceMasterEntity;
	
	@Column(name="DOCUMENT_UPLOAD")
	private String documentUpload;
	
	@ManyToOne
	@JoinColumn(name="DOMAIN_ID",referencedColumnName="DOMAIN_ID")
	@JsonIgnore
	private DomainMasterEntity domainMasterEntity;
	
	@ManyToOne
	@JoinColumn(name="PROJECT_CATEGORY_ID",referencedColumnName="PROJECT_CATEGORY_ID")
	@JsonIgnore
	private ProjectCategoryMasterEntity projectCategoryMasterEntity;
	
	@Column(name="PROJECT_STATUS")
	private String projectStatus;
	
	@Column(name="ACTIVE_FLAG")
	private char activeFlag;

	public int getInputId() {
		return inputId;
	}

	public void setInputId(int inputId) {
		this.inputId = inputId;
	}

	public UserMasterEntity getUserMasterEntity() {
		return userMasterEntity;
	}

	public void setUserMasterEntity(UserMasterEntity userMasterEntity) {
		this.userMasterEntity = userMasterEntity;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public ServiceMasterEntity getServiceMasterEntity() {
		return serviceMasterEntity;
	}

	public void setServiceMasterEntity(ServiceMasterEntity serviceMasterEntity) {
		this.serviceMasterEntity = serviceMasterEntity;
	}

	public String getDocumentUpload() {
		return documentUpload;
	}

	public void setDocumentUpload(String documentUpload) {
		this.documentUpload = documentUpload;
	}

	public DomainMasterEntity getDomainMasterEntity() {
		return domainMasterEntity;
	}

	public void setDomainMasterEntity(DomainMasterEntity domainMasterEntity) {
		this.domainMasterEntity = domainMasterEntity;
	}

	public ProjectCategoryMasterEntity getProjectCategoryMasterEntity() {
		return projectCategoryMasterEntity;
	}

	public void setProjectCategoryMasterEntity(ProjectCategoryMasterEntity projectCategoryMasterEntity) {
		this.projectCategoryMasterEntity = projectCategoryMasterEntity;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public char getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(char activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Override
	public String toString() {
		return "CustomerInputEntity [inputId=" + inputId + ", userMasterEntity=" + userMasterEntity + ", projectTitle="
				+ projectTitle + ", projectDescription=" + projectDescription + ", serviceMasterEntity="
				+ serviceMasterEntity + ", documentUpload=" + documentUpload + ", domainMasterEntity="
				+ domainMasterEntity + ", projectCategoryMasterEntity=" + projectCategoryMasterEntity
				+ ", projectStatus=" + projectStatus + ", activeFlag=" + activeFlag + "]";
	}
	
	
	
	
}
