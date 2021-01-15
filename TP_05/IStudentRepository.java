import java.util.List;

public interface IStudentRepository {
  public boolean create(Student student);

  public List<Student> list();
}
