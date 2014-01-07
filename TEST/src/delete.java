import java.sql.*;
import java.util.Scanner;


public class delete {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/student";

   static final String USER = "root";
   static final String PASS = "";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      String name;
      int id,year;
      Scanner console = new Scanner(System.in);
      System.out.println("Plz enter an id: ");
      id=console.nextInt();
      
     // stmt = conn.createStatement();
      // String sql = "INSERT INTO std_detail " + "VALUES ("+id+",'"+name+"',"+ year+")";
      //stmt.executeUpdate(sql);      
      //System.out.println("Inserted records into the table...");
      //String str="DELETE FROM std_detail WHERE id="+id;
      stmt = conn.createStatement();
      String sql = "DELETE FROM std_detail WHERE id="+id;
      stmt.executeUpdate(sql);
      ResultSet rest=stmt.executeQuery("SELECT * FROM std_detail");
	  while(rest.next()){
			System.out.println(rest.getString("id") + " " + rest.getString("name") + " "+ rest.getString("year"));
		}

   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Thaks!!");
}
}