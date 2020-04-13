package com.lti.models;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




@Entity
@Table(name="assemble_data")
public class AssembleData {
	@Id
	@GeneratedValue
	@Column(name ="Form_id_three")
	private int formIdThree;  
	
	@Column(name ="cv")
	private Blob cv;  
	
	@NotNull
	@Column(name ="mail")
	private String mail;
	
	@NotNull
	@Column(name ="source")
	private String source;
	
	@NotNull
	@Column(name ="dob")
	private Date dob;
	
	@NotNull
	@Column(name ="contact")
	private long contact;
	
	@NotNull
	@Column(name ="registrationDate")
	private Date registrationDate;

	public int getFormIdThree() {
		return formIdThree;
	}

	public void setFormIdThree(int formIdThree) {
		this.formIdThree = formIdThree;
	}

	public Blob getCv() {
		return cv;
	}

	public void setCv(Blob cv) {
		this.cv = cv;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public AssembleData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssembleData(@NotNull int formIdThree, Blob cv, @NotNull String mail, @NotNull String source,
			@NotNull Date dob, @NotNull long contact, @NotNull Date registrationDate) {
		super();
		this.formIdThree = formIdThree;
		this.cv = cv;
		this.mail = mail;
		this.source = source;
		this.dob = dob;
		this.contact = contact;
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "AssembleData [formIdThree=" + formIdThree + ", cv=" + cv + ", mail=" + mail + ", source=" + source
				+ ", dob=" + dob + ", contact=" + contact + ", registrationDate=" + registrationDate + "]";
	}

	
	
	
	
}
