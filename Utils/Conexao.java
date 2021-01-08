import java.sql.*;

public class Conexao {
  public static void main(String args[]) {
    try {
      String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=AulaJava;integratedSecurity=true";
      // String url =
      // "jdbc:sqlserver://127.0.0.1\\SQLEXPRESS;databaseName=AulaJava;integratedSecurity=true";
      // String
      // url="jdbc:microsoft:sqlserver://localhost\\SQLEXPRESS;databaseName=AulaJava;";
      // String usuario = "sa";
      // String senha = "sa";
      System.out.println("Passou");
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      // DriverManager.registerDriver(new
      // com.microsoft.sqlserver.jdbc.SQLServerDriver());
      Connection con;
      con = DriverManager.getConnection(url); // ,usuario,senha);
      System.out.println("Conexao OK");
      // dados da conexao
      DatabaseMetaData db = con.getMetaData();
      System.out.println("Conectado a " + db.getURL());
      System.out.println("Conexao     " + db.getConnection());
      System.out.println("Driver      " + db.getDriverName());
      System.out.println("Usuario     " + db.getUserName());
      System.out.println("----------------------------------");

      con.close();
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}