package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projects {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer projectId;
	private String emailId; 
	private String projectName;
	private String projectDesc;
	private String duration;
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projects(Integer projectId, String emailId, String projectName, String projectDesc, String duration) {
		super();
		this.projectId = projectId;
		this.emailId = emailId;
		this.projectName = projectName;
		this.projectDesc = projectDesc;
		this.duration = duration;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Projects [projectId=" + projectId + ", emailId=" + emailId + ", projectName=" + projectName
				+ ", projectDesc=" + projectDesc + ", duration=" + duration + "]";
	}
	
	
	
}
