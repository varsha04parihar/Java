import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name, designation and salary of employee");
			String n=br.readLine();
			String d=br.readLine();
			float s=Float.parseFloat(br.readLine());
			
			//load DriverClass and create obj of it
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish connection with jdbc
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jdbc_db","root","");
			
			//create stmt
			Statement stmt=con.createStatement();
			//execute stmt
			int result=stmt.executeUpdate("insert into Employee values(null,'"+n+"','"+d+"','"+s+"')");
			
			if(result==1)
				System.out.println("Record Inserted");
			else
			{
				System.out.println("Please try again");

			}
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
			// TODO: handle exception
		}
		catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
