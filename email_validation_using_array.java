import java.util.Scanner;  
public class Main
{  
    public static void main(String[] args)   
    {  
        int n;  
        Scanner sc=new Scanner(System.in);  
        String[] email= new String[3];  
        System.out.println("Enter the email: ");
        for(int i=0; i<=email.length; i++)  
        {  
    	email[i]=sc.nextLine(); 
        
        }  
        System.out.println("\nChecking validation ");  
        for (int j=0; j<=email.length; j++)   
        {  
    		if(email[j].endswith("@gmail.com"))
    		{
    			
           			 System.out.println("valid email");
    		} 
    		else
    		{
    			 System.out.println("invalid email");
    		} 
    
        }
    }
}