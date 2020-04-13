package com.lti.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name="recruitment_Understanding")
public class RecruitmentUnderstanding {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Form_id_two")
	private int formIdTwo;  
	
	@Column(name ="job_title")
	@NotNull
	private String jobTitle;
	
	@Column(name ="job_overview")
	@NotNull
	private String jobOverview;
	
	@Column(name ="Resources_Needed")
	@NotNull
	private int resourcesNeeded;
	
	@Column(name ="skill")
	@NotNull
	private String skillsRequired;
	
	@Column(name ="criteria")
	@NotNull
	private String criteria;
	
	@Column(name ="Requestor_Id")
	@NotNull
	private String requestorId;
	
	@Column(name ="Requestor_PU_BU")
	@NotNull
	private String requestorPUBU;
	
	@Column(name ="Requestor_Department")
	@NotNull
	private String requestorDepartment;

	
//	@ManyToOne
//	@JoinColumn(name="Form_id_one")
//	private DemandDetails demand_details;
	
//	@OneToMany(targetEntity = DemandDetails.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="fk", referencedColumnName="Form_id_two")
//	private List<DemandDetails> demand_details;
	
	public String getRequestorId() {
		return requestorId;
	}
	
	public void setRequestorId(String requestorId) {
		this.requestorId = requestorId;
	}

	public String getRequestorPUBU() {
		return requestorPUBU;
	}

	public void setRequestorPUBU(String requestorPUBU) {
		this.requestorPUBU = requestorPUBU;
	}

	public String getRequestorDepartment() {
		return requestorDepartment;
	}

	public void setRequestorDepartment(String requestorDepartment) {
		this.requestorDepartment = requestorDepartment;
	}

	


	

	public int getFormIdTwo() {
		return formIdTwo;
	}

	public void setFormIdTwo(int formIdTwo) {
		this.formIdTwo = formIdTwo;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobOverview() {
		return jobOverview;
	}

	public void setJobOverview(String jobOverview) {
		this.jobOverview = jobOverview;
	}

	public int getResourcesNeeded() {
		return resourcesNeeded;
	}

	public void setResourcesNeeded(int resourcesNeeded) {
		this.resourcesNeeded = resourcesNeeded;
	}

	public String getSkillsRequired() {
		return skillsRequired;
	}

	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	

	public RecruitmentUnderstanding() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecruitmentUnderstanding(int formIdTwo, String jobTitle, String jobOverview, int resourcesNeeded,
			String skillsRequired, String criteria, String requestorId, String requestorPUBU,
			String requestorDepartment, DemandDetails demand_details) {
		super();
		this.formIdTwo = formIdTwo;
		this.jobTitle = jobTitle;
		this.jobOverview = jobOverview;
		this.resourcesNeeded = resourcesNeeded;
		this.skillsRequired = skillsRequired;
		this.criteria = criteria;
		this.requestorId = requestorId;
		this.requestorPUBU = requestorPUBU;
		this.requestorDepartment = requestorDepartment;
//		this.demand_details = demand_details;
	}

	@Override
	public String toString() {
		return "RecruitmentUnderstanding [formIdTwo=" + formIdTwo + ", jobTitle=" + jobTitle + ", jobOverview="
				+ jobOverview + ", resourcesNeeded=" + resourcesNeeded + ", skillsRequired=" + skillsRequired
				+ ", criteria=" + criteria + ", requestorId=" + requestorId + ", requestorPUBU=" + requestorPUBU
				+ ", requestorDepartment=" + requestorDepartment + "]";
	}
}