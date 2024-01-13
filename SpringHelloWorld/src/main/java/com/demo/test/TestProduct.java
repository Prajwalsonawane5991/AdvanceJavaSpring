package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Product;
import com.demo.model.Productstore;

public class TestProduct {

	public static void main(String[] args) {
		ApplicationContext ctx=new  ClassPathXmlApplicationContext("springconfig.xml");
//		Product p=(Product) ctx.getBean("p2");
//		System.out.println(p);
		Productstore p=(Productstore) ctx.getBean("ps");
		System.out.println(p);
//		Product p1=(Product) ctx.getBean("ps2");
//		System.out.println(p1);
//		Product p2=(Product) ctx.getBean("ps3");
//		System.out.println(p2);
		System.out.println("---------------------------------------------------");
		Productstore p1=(Productstore) ctx.getBean("ps1");
		System.out.println(p1);

	}

}
