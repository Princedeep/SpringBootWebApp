package com.springboot.webapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  ="customer")
public class Customers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cid;
	
	@Column(name="c_name")
	private String cname;
	
	@Column(name="c_email")
	private String cemail;

	
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}


}

