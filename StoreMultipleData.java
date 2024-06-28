package jdbc_odbc;
import java.sql.*;
import java.util.Scanner;
public class StoreMultipleData {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nct","nct");
			PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?)");
			Scanner sc=new Scanner(System.in);
			String user_value="";
			do {
				System.out.println("Enter Customer Id : ");
				String cust_id=sc.nextLine();
				System.out.println("Enter Customer Name :");
				String cust_name=sc.nextLine();
				System.out.println("Enter Location : ");
				String location=sc.nextLine();
				System.out.println("Enter Email ID : ");
				String email_id=sc.nextLine();
				
				ps.setString(1, cust_id);
				ps.setString(2, cust_name);
				ps.setString(3, location);
				ps.setString(4, email_id);
				
				ps.addBatch();
				
				System.out.println("Enter your choice : yes/no");
				user_value=sc.nextLine();
				
			}while(user_value.equals("yes"));
			
			ps.executeBatch();
			System.out.println("Success");
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}

}
