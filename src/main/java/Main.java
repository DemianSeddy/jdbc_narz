import ConnNarz.InitTable;
import FromCsv.LoadFromCsv;

import java.sql.*;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws SQLException {
        //new LoadFromCsv();

        InitTable dataAll = new InitTable("SELECT * FROM OSTATKIFORTOIRFROMNARZ");
        ResultSet executeQuery = dataAll.getExecuteQuery();
        // Количество колонок в результирующем запросе
        int columns = executeQuery.getMetaData().getColumnCount();
        // Перебор строк с данными
        while(executeQuery.next()){
            for (int i = 1; i <= columns; i++){
                System.out.print(executeQuery.getString(i) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}





