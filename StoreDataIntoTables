package jdbc_odbc;
import java.sql.*;
public class Data {
	public static void main(String[]args) {
		try {
			java.util.Scanner sc=new java.util.Scanner(System.in);
			System.out.println("Enter Customer ID : ");
			String cust_id=sc.nextLine();
			System.out.println("Enter Customer Name : ");
			String cust_name=sc.nextLine();
			System.out.println("Enter Location : ");
			String location=sc.nextLine();
			System.out.println("Enter Email ID : ");
			String email_id=sc.nextLine();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nct","nct");  //xe-express edition
			String query="insert into customer values('"+cust_id+"','"+cust_name+"','"+location+"','"+email_id+"')";
			PreparedStatement ps=con.prepareStatement(query);
			int res=ps.executeUpdate();
			if(res>0) {
				System.out.println("Success");
			}
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}
}
