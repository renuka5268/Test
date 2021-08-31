import java.util.Scanner;
class subject{
    void cse()
    {  System.out.println("ML");
       System.out.println("DATA SCIENCE");
       System.out.println("ROBOTICS");
       Scanner sc=new Scanner(System.in);
       System.out.println("choose subject");
       String sub=sc.nextLine();
       if(sub=="ML")
       {
           System.out.println("profesor: upendra sir");
       }
       else if(sub=="DATASCIENCE")
       {
            System.out.println("profesor:");
       }
       else if(sub=="ROBOTICS")
       {
            System.out.println("profesor:");
       }
    }
}
class subject1 extends subject{
    void ece()
    {   System.out.println("communication");
        System.out.println("electornics");
        System.out.println("vls");
        Scanner sc=new Scanner(System.in);
        System.out.println("choose subject");
        String sub=sc.nextLine();
        if(sub=="communication")
       {
           System.out.println("profesor: upendra sir");
       }
       else if(sub=="electroics")
       {
            System.out.println("profesor:");
       }
       else if(sub=="vls")
       {
            System.out.println("profesor:");
       }
    }
}
class subject2 extends subject1{
    void mech()
    {  System.out.println("communication");
       System.out.println("auto mobiles");
       System.out.println("System.in");
       Scanner sc=new Scanner(System.in);
       System.out.println("choose subject");
       String sub=sc.nextLine();
       if(sub=="communication")
       {
            System.out.println("profesor:");
       }
       else if(sub=="electronics")
       {
            System.out.println("profesor:");
       }
    }
}
              
       
class Main{

    public static void main(String[] args)
        {  
         
         Scanner sc=new Scanner(System.in);
         System.out.println("college: RGUKT");
         System.out.println("choose Branch");
         String branch=sc.nextLine();
         subject2 obj=new subject2();
         switch(branch)
         { 
           case "cse":{
               obj.cse();
                    
            }
           break;  
           case "ece":{
               obj.ece();
           }
           break;  
           case "mech":{
               obj.mech();
           }
           break;  
             
         }
        
        
        
        }  
}

    