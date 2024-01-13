

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBUtil {

	public static void main(String[] args) {
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.150:3306/dac38?useSSL=false";
			Connection con =DriverManager.getConnection(url,"dac38","welcome");
			if(con!=null)
			{
				Statement st=con.createStatement();
				ResultSet s=st.executeQuery("select * from student");
				while(s.next())
				{
					System.out.println("id: "+s.getInt(1));
					System.out.println("NameFirst: "+s.getString(2));
					System.out.println("Namelast: "+s.getString(3));
					System.out.println("Dob: "+s.getString(4));
					System.out.println("Email: "+s.getString(5));
					System.out.println("========================================");
				}
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter a id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter a first name");
				String f=sc.nextLine();
				System.out.println("Enter a last name");
				String l=sc.nextLine();
				System.out.println("Enter a Dob");
				String d=sc.nextLine();
				System.out.println("Enter a email");
				String e=sc.nextLine();
				String query="insert into student(id,namefirst,namelast,dob,emailid) values("+id+",'"+f+"','"+l+"','"+d+"','"+e+"')"; 
				System.out.println(query);
				int n=st.executeUpdate(query);
				if(n>0)
				{
				   System.out.println("Added Successfully");
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

