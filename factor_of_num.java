import java.util.Scanner;
abstract class Main{  
  abstract void run(int n);  
}  
class Factor extends Main{  
    void run(int n){
       int sum=0;
       for(int i=1;i<=n;i++)
       {
            if(n%i==0)
            { 
                 System.out.println(i);
                 sum=sum+i;
            }
        }  
        System.out.println("SUM = "+sum);
        if(sum%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
class Num{

    public static void main(String[] args)
        {  
         int number=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter Number");
         number=sc.nextInt();
         System.out.print("The factors are:: ");
         Main obj = new Factor();  
         obj.run(number);  
        }  
}

    
    
    
    
    
    