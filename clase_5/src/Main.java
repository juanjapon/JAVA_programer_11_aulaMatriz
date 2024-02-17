import ConnectionDB.ConnectionDB;

import java.sql.SQLException;
import java.sql.Statement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ConnectionDB mysqlConnection=new ConnectionDB("aulamatriz-mysql.cu8fdrthvxfg.us-east-1.rds.amazonaws.com","root","123ABCbe.","3306","dyf");

        var connection = mysqlConnection.doConnectionDB();

        String createTable  ="Create table user ( \n" +
                " id BIGINT  UNSIGNED  AUTO_INCREMENT PRIMARY KEY ,  \n" +
                " name varchar(50)\n" +
                ");";
        try {
            Statement statement=connection.createStatement();
            statement.execute(createTable);
            System.out.println("Se creo la tabla correctamente");
        } catch (SQLException e) {
            System.out.println("Error al crear la tabla "+e.getMessage());
        }
    }

}