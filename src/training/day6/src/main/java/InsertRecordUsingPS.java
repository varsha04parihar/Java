import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;



public class InsertRecordUsingPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name ,designation and salary of employee");
			
			String n=br.readLine();
			String d=br.readLine();
			float s=Float.parseFloat(br.readLine());
			
			//load DriverClass and create obj of it
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish connection with jdbc
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jdbc_db","root","");
			
			//create prepared stmt
			PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?,?)");
			
			ps.setString(1, null);
			ps.setString(2, n);
			ps.setString(3, d);
			ps.setFloat(4, s);

			//execute ps
			int result=ps.executeUpdate();
		
			if(result==1)
				System.out.println("Record Updated using Prepared Statement");
			else
			{
				System.out.println("Please try again");

			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

	}

}
