public class Programa {
  public static void main(String[] args) {
    Conexao conexao = new Conexao("PostgreSql", "localhost", "5432", "db_java", "postgres", "DockerPostgres127!");

    conexao.conect();
  }
}
