package com.shop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_table")
public class Product {
	@Id
	private String productid;
	private String productname;
	private String producttype;
	private String companyname;
	private int price;

	public Product() {

	}

	public Product(String productid, String productname, String producttype, String companyname, int price) {

		this.productid = productid;
		this.productname = productname;
		this.producttype = producttype;
		this.companyname = companyname;
		this.price = price;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", producttype=" + producttype
				+ ", companyname=" + companyname + ", price=" + price + "]";
	}

}
