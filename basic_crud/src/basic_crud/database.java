package basic_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class database {
	public static void main(String args[]){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
			Statement st = (Statement) conn.createStatement();
			
			
			/*CallableStatement cs;
			cs=conn.prepareCall("(call showStudent())");
			*/
			ResultSet rest=st.executeQuery("SELECT * FROM std_detail");
			
			while(rest.next()){
				//System.out.println(rest.getString("id") + " " + rest.getString("name") + " "+ rest.getString("year"));
			}
		}
		/*catch(SQLException se){
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}*/
		catch(Exception e){
			//System.out.println(e.toString());
		}
	}

}
