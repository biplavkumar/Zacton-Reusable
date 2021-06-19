package com.zacton.reusable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SERVICE_MASTER")
public class ServiceMasterEntity {

	@Id
	@Column(name="SERVICE_ID")
	private int serviceId;
	
	@Column(name="SERVICE_NAME")
	private String serviceName;
	
	@Column(name="CONTENT")
	private String content;
	
	@Column(name="ACTIVE_FLAG")
	private char activeFlag;
	
	@OneToMany(mappedBy="serviceMasterEntity")
	List<CustomerInputEntity> customerInputEntity;

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	@Override
	public String toString() {
		return "ServiceMasterEntity [serviceId=" + serviceId + ", serviceName=" + serviceName + ", content=" + content
				+ ", activeFlag=" + activeFlag + "]";
	}
	
	
	
	
	
}
