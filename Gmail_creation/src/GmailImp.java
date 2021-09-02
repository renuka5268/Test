import java.sql.SQLException;
import java.util.Scanner;

public class GmailImp implements Gmail{
    @Override
    public void Compose() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("from emailId");
        String from = sc.nextLine();
        System.out.println("to emailId");
        String to = sc.nextLine();
        System.out.println("message to send");
        String message = sc.nextLine();
        JdbcConnection con = new JdbcConnection();
        con.insert(from, to, message);
    }

    @Override
    public void Inbox() throws SQLException, ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("to emailId");
        String to=sc.nextLine();
        System.out.println("enter message to emailId");
        String message=sc.nextLine();
        JdbcConnection con = new JdbcConnection();
        con.getInfo(to,message);

    }
    @Override
    public void Sentbox() throws SQLException, ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("from emailId");
        String from=sc.nextLine();
        System.out.println("enter message to emailId");
        String message=sc.nextLine();
        JdbcConnection con = new JdbcConnection();
        con.getInfo(from,message);

    }


}



