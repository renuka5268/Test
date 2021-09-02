import java.sql.SQLException;

public interface Gmail {
    public void Compose() throws SQLException, ClassNotFoundException;
    public void Inbox() throws SQLException, ClassNotFoundException;
    public void Sentbox() throws SQLException, ClassNotFoundException;


}
