import ConnNarz.InitTable;
import FromCsv.LoadFromCsv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws SQLException {
        //new LoadFromCsv();
        InitTable conn = new InitTable();

   /**     if (conn.shouldGetJdbcConnection() != null) {

            System.out.println(conn.shouldGetJdbcConnection().getSchema().toString());
            Statement stmt = conn.shouldGetJdbcStatement(conn.shouldGetJdbcConnection());
            System.out.println(stmt.getConnection());

            if (stmt != null) {
                ResultSet executeQuery = stmt.executeQuery("SELECT * FROM OSTATKIFORTOIRFROMNARZ");
                // Обход результатов выборки
                while (executeQuery.next()) {
                    System.out.println(executeQuery.getString("Category"));
                }
                // Закрываем соединение
                executeQuery.close();
                stmt.close();
            }

        }
 **/

    }


}
