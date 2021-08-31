import java.util.HashMap;
import java.util.Scanner;
public class Map<S, S1> {
    public static void main(String args[]){
        try{
            HashMap<String, HashMap<String, String>> maps=new HashMap<>();
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<5;i++){
                System.out.println("enetr employee id");
                String id=sc.next();
                HashMap<String, String> map=new HashMap<String,String>();
                System.out.println("enter name");
                map.put("name",sc.next());
                System.out.println("enter age");
                map.put("age",sc.next());
                System.out.println("enter department");
                map.put("department",sc.next());
                maps.put(id,map);
            }
            System.out.println(maps);
        }
        catch(Exception e)
        {

        }
    }
}
