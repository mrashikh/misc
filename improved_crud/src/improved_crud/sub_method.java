package improved_crud;

import java.util.Scanner;
import java.sql.*;

public class sub_method {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/student";
	static final String USER = "root";
	static final String PASS = "";
	Connection conn = null;
	Statement stmt = null;
	public void select(){
		try{
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      String name;
		      int id,year;
		      Scanner console = new Scanner(System.in);
		      System.out.println("Plz enter an id to select: ");
		      id=console.nextInt();
		      stmt = conn.createStatement();
		      //System.out.println("Inserted records into the table...");
		      String str="select * from std_detail where id = "+id;
		      ResultSet rest=stmt.executeQuery(str);
		      System.out.println("Student details:");
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
	}
	public void insert(){
		try{
		      Class.forName("com.mysql.jdbc.Driver");

		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      String name;
		      int id,year;
		      Scanner console = new Scanner(System.in);
		      System.out.println("Plz enter a name to insert: ");
		      name=console.nextLine();
		      System.out.println("Plz enter the id: ");
		      id=console.nextInt();
		      System.out.println("Plz enter the year: ");
		      year=console.nextInt();
		     
		      //Execute a query
		      System.out.println("Inserting records into the table...");
		      stmt = conn.createStatement();
		      String sql = "INSERT INTO std_detail " + "VALUES ("+id+",'"+name+"',"+ year+")";
		      stmt.executeUpdate(sql);      
		      System.out.println("Inserted records into the table...");
		      
		      ResultSet rest=stmt.executeQuery("SELECT * FROM std_detail");
		      System.out.println("Updated student details:");
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
	}
	public void update(){
		try{
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");		      
		      Scanner console = new Scanner(System.in);
		      System.out.println("Plz enter the id to update: ");
		      int id=console.nextInt();console.nextLine();
		      System.out.println("Plz enter the updated name: ");
		      String name=console.nextLine();		            
		      System.out.println("Plz enter updated year: ");
		      int year=console.nextInt();
		      stmt = conn.createStatement();
		      String str="UPDATE std_detail SET name = '"+name+"' , year = "+year+" WHERE id = "+id;
		      stmt.executeUpdate(str);
		      ResultSet rest=stmt.executeQuery("SELECT * FROM std_detail");
		      System.out.println("Updated records into the table...");
		      System.out.println("Updated student details:");
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
		}
	public void delete(){
		try{
		      Class.forName("com.mysql.jdbc.Driver");

		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      String name;
		      int id,year;
		      Scanner console = new Scanner(System.in);
		      System.out.println("Plz enter an id to delete: ");
		      id=console.nextInt();		     
		      stmt = conn.createStatement();
		      String sql = "DELETE FROM std_detail WHERE id="+id;
		      stmt.executeUpdate(sql);
		      System.out.println("Deleted records from the table...");
		      ResultSet rest=stmt.executeQuery("SELECT * FROM std_detail");
		      System.out.println("Updated student details:");
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
	}

}
