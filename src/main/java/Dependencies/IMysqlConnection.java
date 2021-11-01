package Dependencies;

import java.sql.Connection;

public interface IMysqlConnection {
    public Connection connect(); // remember correct arguments
    public boolean disconnect();
}
