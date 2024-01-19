package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.service.Service;
import com.demo.service.ServiceImpl;

public class CrudOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service ps=new ServiceImpl();
		Scanner Sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1:add ne product \n2:display All\n 3:Display by id\n choice");
			choice=Sc.nextInt();
			switch(choice)
			{
			case 1:
				ps.addproduct();
				break;
			case 2:
				List<Product> plist=ps.displayAll();
				plist.forEach(System.out::println);
				break;
			case 3:
				System.out.println("enetr pid");
				int id=Sc.nextInt();
				Product p=ps.displaybyId(id);
				if(p!=null) {
					System.out.println(p);
				}
				else {
					System.out.println("not found");
				}
				break;
			default:
			    System.out.println("Wrong choice!!!!");
			}
			
		}while(choice!=0);
		

	}

}
