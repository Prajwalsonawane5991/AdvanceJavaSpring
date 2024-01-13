package com.demo.test;

import java.util.Scanner;

import com.demo.service.ProductService;
import com.demo.service.ProductServiceImp;

public class TestCrudOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductService ps=new ProductServiceImp();
		
		int choice;
		do {
			System.out.println("1:add Product\n 2:Display All \n choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
					
				ps.addproduct();
				
				break;
			case 2:
				break;
			default:
				System.out.println("Wrong Choice");
				break;
				
			
			}
			
		}while(choice!=0);
		

	}

}
