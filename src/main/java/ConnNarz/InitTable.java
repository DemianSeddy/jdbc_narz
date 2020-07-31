package ConnNarz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class InitTable {

    //driver={SQL Server};server=HPDL380;uid=reader;pwd=1234qsw;database=Документация;

      String connectionUrl =
            "jdbc:sqlserver://HPDL380:1433;"
                    + "database=Документация;"
                    + "user=pridvorov@narp;"
                    + "password=Pridvorov1509@;"
                    + "encrypt=true;"
                    + "trustServerCertificate=false;"
                    + "loginTimeout=30;";

    public InitTable() throws SQLException {

        try {
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              System.out.print("Connecting to SQL Server ... ");
              try (Connection connection = DriverManager.getConnection(connectionUrl)) {
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

