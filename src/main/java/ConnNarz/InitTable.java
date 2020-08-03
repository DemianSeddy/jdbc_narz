package ConnNarz;

import java.sql.*;


public class InitTable {

    //driver={SQL Server};server=HPDL380;uid=reader;pwd=1234qsw;database=Документация;

    private final String connectionUrl = "jdbc:jtds:sqlserver://HPDL380;database=Документация;domain=NARP;loginTimeout=300;";
    private final String user = "pridvorov";
    private final String password = "Pridv0r0v0915@";

    public  ResultSet getExecuteQuery() {
        return executeQuery;
    }


    public static ResultSet executeQuery = null;

    public InitTable(String sqlStringOstatkiall)  {
            try {
                Statement statement = getNewConnection().createStatement();
                try {
                   executeQuery = statement.executeQuery(sqlStringOstatkiall);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    }

    private Connection getNewConnection() throws SQLException, ClassNotFoundException {
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        return DriverManager.getConnection(connectionUrl,user,password);
    }



}



