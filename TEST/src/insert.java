import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class insert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insert");
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
			Statement st = (Statement) conn.createStatement();
			ResultSet rest=st.executeQuery("INSERT INTO student.std_detail(id ,name ,year) VALUES ('015', 'toonmoy', '2052')");
			ResultSet rest2=st.executeQuery("SELECT * FROM std_detail");
			while(rest2.next()){
				//System.out.println(rest.getString("id"));
				System.out.println(rest2.getString("id") + " " + rest2.getString("name") + " "+ rest2.getString("year"));
			}
		}
		
		catch(Exception e){
			//System.out.println(e.toString());
		}

	}


}
