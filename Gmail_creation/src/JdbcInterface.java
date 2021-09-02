import java.sql.ResultSet;
import java.sql.SQLException;

public interface JdbcInterface {

        public void insert(String from,String to,String  message) throws ClassNotFoundException, SQLException;
        ResultSet getInfo(String emailId, String mode) throws ClassNotFoundException, SQLException;


}
