package com.shop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplier_table")
public class Supplier {
	private String suppliername;
	@Id
	private String supplierphone;
	private String supplieraddress;

	public Supplier() {

	}

	public Supplier(String suppliername, String supplierphone, String supplieraddress) {
		super();
		this.suppliername = suppliername;
		this.supplierphone = supplierphone;
		this.supplieraddress = supplieraddress;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public String getSupplierphone() {
		return supplierphone;
	}

	public void setSupplierphone(String supplierphone) {
		this.supplierphone = supplierphone;
	}

	public String getSupplieraddress() {
		return supplieraddress;
	}

	public void setSupplieraddress(String supplieraddress) {
		this.supplieraddress = supplieraddress;
	}

	@Override
	public String toString() {
		return "Supplier [suppliername=" + suppliername + ", supplierphone=" + supplierphone + ", supplieraddress="
				+ supplieraddress + "]";
	}

}
