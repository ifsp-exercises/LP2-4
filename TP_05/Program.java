public class Program {
  public static void main(String[] args) {
    System.out.println("This pretty program was developed by Angelo Evangelista ;)");
    
    StudentRepository studentRepository = new StudentRepository(
      "127.0.0.1",
      "5432",
      "postgres",
      "db_java",
      "DockerPostgres127!"
    ); 

    new Form(studentRepository).createWindow();
  }
}
