import java.sql.DriverManager;

public class bd {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost/ContosoRetailDW;databaseName=ContosoRetailDW;user=public;password='';encrypt=false;";
        
    }
}
