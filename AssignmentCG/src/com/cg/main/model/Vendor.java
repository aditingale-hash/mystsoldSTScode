package com.cg.main.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class Vendor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vId")
	private int vid;
	
	@Column(name = "vname", nullable = false)
	private String vname;
	
	private String vcity;
	
	public Vendor(int vid, String vname, String vcity) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vcity = vcity;
	}
	public Vendor() {
		// TODO Auto-generated constructor stub
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVcity() {
		return vcity;
	}
	public void setVcity(String vcity) {
		this.vcity = vcity;
	}
	
}
