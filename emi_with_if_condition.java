import java.util.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double principal;
    double rate=0;
    double time=0;
    double emi;
    System.out.print("Enter principal: ");
    principal = sc.nextFloat();
    if(principal >= 100000 && principal <=1000000)
    {
        System.out.print("Enter rate: ");
        rate = sc.nextFloat();
        if(rate >=3 && rate<=30)
       {
         rate=rate/(12*100); 
         System.out.print("Enter time in year: ");
         time = sc.nextFloat();
         if(time >=5 && time<=30)
         {
           time=time*12; 
         }
         else{
             System.out.println("please enter rate between 5 to 30");
         }

        }
        else{
             System.out.println("please enter rate between 3 to 30");
         }
    }
    else{
        System.out.println("please enter rate between 100000 to 1000000");
        
       }
    emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
    System.out.println(emi);
    }
   
}

    
    