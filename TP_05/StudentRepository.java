import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
  private Connection _connection;

  public StudentRepository(String host, String port, String username, String dbName, String password) {
    super();

    String connectionString = "jdbc:postgresql://" + host + ":" + port + "/" + dbName;

    try {
      Class.forName("org.postgresql.Driver");

      _connection = DriverManager.getConnection(connectionString, username, password);
      // _connection.createStatement();
    } catch (Exception e) {
      System.err.println(e);
      e.printStackTrace();
    }
  }

  @Override
  public boolean create(Student student) {
    try {
      String query = "";
      query += "insert into students (name, age, weight, height, objective)";
      query += "values (";

      query += student.name + ",";
      query += student.age + ",";
      query += student.weight + ",";
      query += student.height + ",";
      query += student.objective;

      query += ")";

      _connection.createStatement().executeQuery(query);
    } catch (Exception e) {
      return false;

    } finally {
      return true;
    }
  }

  @Override
  public List<Student> list() {
    List<Student> students = new ArrayList<Student>();

    try {
      var resultSet = _connection.createStatement().executeQuery("select * from students");

      while (resultSet.next()) {
        Student student = new Student();
        student.name = resultSet.getString("name");
        student.age = resultSet.getInt("age");
        student.height = resultSet.getFloat("height");
        student.weight = resultSet.getFloat("weight");
        student.objective = resultSet.getString("objective");

        students.add(student);
      }

    } catch (Exception e) {
      return new ArrayList<Student>();

    } finally {
      return students;
    }
  }
}
