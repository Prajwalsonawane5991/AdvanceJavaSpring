package com.demo.model;

public class Productstore {
	private String storename;
	private String stradd;
	private Product prd;
	public Productstore() {
		super();
	}

	
	public Productstore(String storename, String stradd, Product prd) {
		super();
		this.storename = storename;
		this.stradd = stradd;
		this.prd = prd;
	}


	public String getStradd() {
		return stradd;
	}
	public void setStradd(String stradd) {
		this.stradd = stradd;
	}
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	public Product getPrd() {
		return prd;
	}
	public void setPrd(Product prd) {
		this.prd = prd;
	}

	public Productstore(String storename, Product prd) {
		super();
		this.storename = storename;
		this.prd = prd;
	}


	@Override
	public String toString() {
		return "Productstore [storename=" + storename + ", stradd=" + stradd + ", prd=" + prd + "]";
	}
	

}
