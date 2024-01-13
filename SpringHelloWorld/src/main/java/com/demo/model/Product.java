package com.demo.model;

public class Product {
	private int pid;
	private String pname;
	private double price;
	public Product() {
		super();
		System.out.println("Default constructor");
	}
	public Product(int pid, String pname, double price) {
		super();
		System.out.println("parametriesd constructor");
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		System.out.println("setter method of pid");
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		System.out.println("setter method of pname");
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("setter method of price");
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	

}
