import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class JdbcConnection implements JdbcInterface {
    static String url = "jdbc:mysql://localhost:3306/demo";
    static String userName = "root";
    static String pass = "Renu@123";
    Connection con = null;
    PreparedStatement stm = null;

    public JdbcConnection() throws SQLException, ClassNotFoundException {
        connectMysql();

    }

    public Connection connectMysql() throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, pass);
            if (con != null) {
                System.out.println("jdbc connected");
            }
        } catch (Exception e) {
            System.out.println(e);

        }


        return null;
    }


    @Override
    public void insert(String from, String to, String message) throws SQLException {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number rows you need to enter");
        number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("enter from emailId");
            from = sc.next();
            System.out.println("enter to emailId");
            to = sc.next();
            System.out.println("enter message to send ");
            message = sc.next();
            System.out.println("enter values into insert");
            String sql = "insert into emails(from,to,message) values(?,?,?)";
            stm = con.prepareStatement(sql);
            stm.setString(1, from);
            stm.setString(2, to);
            stm.setString(3, message);
            System.out.println(sql);
            stm.executeUpdate();
            stm.close();
        }
    }

    @Override
    public ResultSet getInfo(String emailId, String mode) throws SQLException {
        if (mode == "Inbox") {
            Statement stm2 = con.createStatement();
            String sql = "select * from emails where to=' " + emailId + "'";
            ResultSet rs = stm2.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getInt(3));
            }
            stm2.close();
            return rs;
        } else if (mode == "Sentbox") {
            Statement stm2 = con.createStatement();
            String sql = "select * from emails where from=' " + emailId + "'";
            ResultSet rs = stm2.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getInt(3));
            }
            stm2.close();
            return rs;

        }
        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

    }

    public static void option() throws Exception {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1:inbox");
            System.out.println("2:sentbox");
            System.out.println("3:compose");
            System.out.println("4:exit");
            System.out.println("enter  option");
            int input = sc.nextInt();
            GmailImp obj = new GmailImp();

            switch (input) {
                case 1:
                    obj.Inbox();
                    break;
                case 2:

                    obj.Sentbox();
                    break;
                case 3:
                    System.out.println("enter from emailId,to emailId,message to compose a mail");
                    obj.Compose();
                    break;
                case 4:
                    return;

            }
        }
    }
}