package com.shop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owner_table")
public class Owner {

	private String ownername;
	private String owneraddress;
	@Id
	private String ownerphone;
	private String ownerpassword;

	public Owner(String ownername, String owneraddress, String ownerphone, String ownerpassword) {
		super();
		this.ownername = ownername;
		this.owneraddress = owneraddress;
		this.ownerphone = ownerphone;
		this.ownerpassword = ownerpassword;
	}

	public Owner() {
		super();
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getOwneraddress() {
		return owneraddress;
	}

	public void setOwneraddress(String owneraddress) {
		this.owneraddress = owneraddress;
	}

	public String getOwnerphone() {
		return ownerphone;
	}

	public void setOwnerphone(String ownerphone) {
		this.ownerphone = ownerphone;
	}

	public String getOwnerpassword() {
		return ownerpassword;
	}

	public void setOwnerpassword(String ownerpassword) {
		this.ownerpassword = ownerpassword;
	}

	@Override
	public String toString() {
		return "Owner [ownername=" + ownername + ", owneraddress=" + owneraddress + ", ownerphone=" + ownerphone
				+ ", ownerpassword=" + ownerpassword + "]";
	}

}
