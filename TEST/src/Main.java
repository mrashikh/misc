import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("pppp");
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
			Statement st = (Statement) conn.createStatement();
			//ResultSet rest=st.executeQuery("INSERT INTO student.std_detail (id,name,year)VALUES ('011', 'tonmoy', '2020')");
			ResultSet rest=st.executeQuery("SELECT * FROM std_detail");
			
			while(rest.next()){
				//System.out.println(rest.getString("id"));
				System.out.println(rest.getString("id") + " " + rest.getString("name") + " "+ rest.getString("year"));
			}
		}
		
		catch(Exception e){
			//System.out.println(e.toString());
		}

	}

}
