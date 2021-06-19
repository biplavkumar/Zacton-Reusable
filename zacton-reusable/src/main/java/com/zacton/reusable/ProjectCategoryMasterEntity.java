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
@Table(name="PROJECT_CATEGORY_MASTER")
public class ProjectCategoryMasterEntity {
	
	@Id
	@Column(name="PROJECT_CATEGORY_ID")
	private int projectCategoryId;
	
	@Column(name="PROJECT_NAME")
	private String projectName;
	
	@ManyToOne
	@JoinColumn(name="DOMAIN_ID", referencedColumnName="DOMAIN_ID")
	@JsonIgnore
	private DomainMasterEntity domainMasterEntity;
	
	@OneToMany(mappedBy="projectCategoryMasterEntity")
	List<CustomerInputEntity> customerInputEntity;
	
	@Column(name="ACTIVE_FLAG")
	private char activeFlag;

}
