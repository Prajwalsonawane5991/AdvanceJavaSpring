package com.demo.bean;

public class Product {
private int id;
private String pnm;
private int qty;
private double price;

public Product() {
	super();
}

public Product(int id, String pnm, int qty, double price) {
	super();
	this.id = id;
	this.pnm = pnm;
	this.qty = qty;
	this.price = price;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPnm() {
	return pnm;
}

public void setPnm(String pnm) {
	this.pnm = pnm;
}

public int getQty() {
	return qty;
}

public void setQty(int qty) {
	this.qty = qty;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "product [id=" + id + ", pnm=" + pnm + ", qty=" + qty + ", price=" + price + "]";
}

}
