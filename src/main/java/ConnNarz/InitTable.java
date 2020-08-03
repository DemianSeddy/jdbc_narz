package ConnNarz;

import java.sql.*;


public class InitTable {

    //driver={SQL Server};server=HPDL380;uid=reader;pwd=1234qsw;database=Документация;

    private final String connectionUrl = "jdbc:jtds:sqlserver://HPDL380;database=Документация;domain=NARP;loginTimeout=300;";
    private final String user = "pridvorov";
    private final String password = "Pridv0r0v0915@";

    private final String sqlStringOstatkiall = "SELECT * FROM OSTATKIFORTOIRFROMNARZ";
    private final String sqlStringOstatkiForOne = "SELECT * FROM OSTATKIFORTOIRFROMNARZ where nomen ?";

    public InitTable() {
        try {
            Connection conn = getNewConnection();
            try {
                Statement statement = this.getNewConnection().createStatement();
                try {
                    ResultSet executeQuery = statement.executeQuery(sqlStringOstatkiall);
                    return
                            ;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Connection getNewConnection() throws SQLException
    {
        return DriverManager.getConnection(connectionUrl, this.user, this.password);
    }


}



