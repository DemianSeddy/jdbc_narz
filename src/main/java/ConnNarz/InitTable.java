package ConnNarz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class InitTable {

    String instanceName = "HPDL380";
    String databaseName = "Документация";
    String userName = "NARP\\Pridvorov";
    String pass = "Pridv0r0v0915@";
    String connectionUrl = "jdbc:sqlserver://%1$s;databaseName=%2$s;user=%3$s;password=%4$s;";
    String connectionString = String.format(connectionUrl, instanceName, databaseName, userName, pass);

    public InitTable() throws SQLException {

        try {
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              System.out.print("Connecting to SQL Server ... ");
              try (Connection connection = DriverManager.getConnection(connectionString)) {
                  System.out.println("Done.");
              }
                  catch (SQLException ex)
                  {
                      System.out.println(ex);
                  }
        } catch (ClassNotFoundException e) {
                   System.out.println("Unable to load class.");
                   e.printStackTrace();
            }
    }
    }

