package improved_crud;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please select from the following:");
		System.out.println("1. Select");
		System.out.println("2. Insert");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		Scanner console = new Scanner(System.in);
		
		System.out.println("Please enter your choice:");
		int id=9;
		sub_method ob=new sub_method();
		while(id!=5){
	    id=console.nextInt();  
	    if(id==1){
	    	ob.select();
	    }
	    else if(id==2){
	    	ob.insert();
	    }
	    else if(id==3){
	    	ob.update();
	    }
	    else if(id==4){
	    	ob.delete();
	    }
	    else if(id==5){
	    	break;
	    }
	    else{
	    	System.out.println("Wrong input.");
	    }
		//ob.update();
	    System.out.println("Please enter your choice:");
		
		}

	}
}

