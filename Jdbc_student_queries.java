import java.sql.*;
import java.util.Scanner;

public class Add {

    static String url="jdbc:mysql://localhost:3306/demo";
    static String userName="root";
    static String pass="vtiger";
    static Connection con=null;
    static Statement stm=null;


    public static void main(String args[]) throws Exception{
        dataConnection();
        option();
    }
    public static void option() throws Exception{
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("1:input");
            System.out.println("2:search");
            System.out.println("3:delete");
            System.out.println("4:exit");
            System.out.println("enter the option");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    input();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    delete();
                    break;
                case 4: return;

            }
        }


    }
    public static void input() throws Exception{
        Scanner sc = new Scanner(System.in);
        int number;
        String sql;
        String name;
        String usn;
        int age;
        String branch;
        System.out.println("enter number of student information you need to enter");
        number=sc.nextInt();
        for(int i=0;i<number;i++){
            System.out.println("enter usn");
            usn=sc.next();
            System.out.println("enter name");
            name=sc.next();
            System.out.println("enter branch");
            branch=sc.next();
            System.out.println("enter age");
            age=sc.nextInt();
            stm= con.createStatement();
            sql="INSERT INTO student VALUES(?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setString(1,usn);
            stmt.setString(2,name);
            stmt.setInt(3,age);
            stmt.setString(4,branch);
            System.out.println(sql);
            stmt.executeUpdate();
        }

    }
    public static void search() throws Exception{
        String usn;
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter usn of student");
        usn=sc.next();
        stm=con.createStatement();
        String sql="select * from student where usn='"+usn+"'";
        ResultSet rs= stm.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getInt(3)+","+rs.getString(4));
        }
    }
    public static void delete() throws Exception{
        String usn;
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter usn of student");
        usn=sc.next();
        stm=con.createStatement();
        String sql="delete from student where usn='"+usn+"'";
        stm.executeUpdate(sql);

    }

    public static void dataConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,userName,pass);
            if(con!=null) {
                System.out.println("jdbc connected");
            }
        }
        catch (Exception e) {
            System.out.println(e);

        }

    }
}
