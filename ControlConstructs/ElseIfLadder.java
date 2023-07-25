import java.util.Scanner;
public class ElseIfLadder
	{
	     public static void main(String []args)
	     {	      
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the dept: ");
	        String dept=sc.nextLine();
	        int year;
	        if(dept.equals("CSE"))
	        { 
	             System.out.println("Enter a year: ");
	             year=sc.nextInt();
	           System.out.println("The student is in the Computer Science department"); 
	           if(year == 1)
	           {
		          System.out.println("The student is in 1st year");
		       }
		       else if(year == 2)
		       {
		        System.out.println("The student is in 2nd year");
		       }
		       else if(year == 3)
		       {
		        System.out.println("The student is in 3rd year");
		       }
		       else if(year == 4)
		       {
		        System.out.println("The student is in 4th year");
		       }
		    }
		    else if(dept.equals("EEE"))
	        { 
	             System.out.println("Enter a year: ");
	             year=sc.nextInt();
	           System.out.println("The student is in the Electrical and Electronics department"); 
	           if(year == 1)
	           {
		          System.out.println("The student is in 1st year");
		       }
		       else if(year == 2)
		       {
		        System.out.println("The student is in 2nd year");
		       }
		       else if(year == 3)
		       {
		        System.out.println("The student is in 3rd year");
		       }
		       else if(year == 4)
		       {
		        System.out.println("The student is in 4th year");
		       }
		    }
		    else if(dept.equals("ME"))
	        { 
	             System.out.println("Enter a year: ");
	             year=sc.nextInt();
	           System.out.println("The student is in the Mechanical department"); 
	           if(year == 1)
	           {
		          System.out.println("The student is in 1st year");
		       }
		       else if(year == 2)
		       {
		        System.out.println("The student is in 2nd year");
		       }
		       else if(year == 3)
		       {
		        System.out.println("The student is in 3rd year");
		       }
		       else if(year == 4)
		       {
		        System.out.println("The student is in 4th year");
		       }
		    }
		    else
		    {
		        System.out.println("Enter a valid department");
		    }
	     }
	}




