package ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    private String host;
    private String port;
    private String database;
    private String user;
    private String password;

    public ConnectionDB(String localhost, String root, String number, String number1, String s) {
        this.host=localhost;
        this.user=root;
        this.password=number;
        this.port=number1;
        this.database=s;
    }

    public Connection doConnectionDB(){
        try{
            String jdbcUrl="jdbc:mysql://"+this.host+":"+this.port+"/"+this.database;
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection(jdbcUrl,this.user,this.password);
            return connection;
        }catch (Exception e){
            System.out.println("error en la conexión a la base..."+e.getMessage());
            return null;
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
