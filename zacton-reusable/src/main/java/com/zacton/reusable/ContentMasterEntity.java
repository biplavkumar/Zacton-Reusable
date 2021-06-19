package com.zacton.reusable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTENT_MASTER")
public class ContentMasterEntity {
	
	@Id
	@Column(name="CONTENT_ID")
	private int contentId;
	
	@Column(name="CONTENT_NAME")
	private String contentName;
	
	@Column(name="CONTENT")
	private String content;
	
	@Column(name="ACTIVE_FLAG")
	private char activeFlag;

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public String getContentName() {
		return contentName;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
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

	@Override
	public String toString() {
		return "ContentMasterEntity [contentId=" + contentId + ", contentName=" + contentName + ", content=" + content
				+ ", activeFlag=" + activeFlag + "]";
	}
	
	
	
}
