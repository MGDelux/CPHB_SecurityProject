package Dependencies;

import java.sql.Connection;

public class MysqlConnection implements IMysqlConnection {
    @Override
    public Connection connect() {
        return null;
    }

    @Override
    public boolean disconnect() {
        return false;
    }
}
