import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.GridLayout;
import javax.swing.*;

public class StudentsForm implements ActionListener {
  private List<Student> students = new ArrayList<Student>();
  private JFrame frame = new JFrame();

  private JLabel labelName;
  private JLabel labelAge;
  private JLabel labelAddress;

  private JTextField fieldName;
  private JTextField fieldAge;
  private JTextField fieldAddress;

  private JButton buttonOK;
  private JButton buttonClear;
  private JButton buttonShow;
  private JButton buttonExit;

  private JPanel panelTop;
  private JPanel panelBottom;

  private void initializeElements() {
    labelName = new JLabel();
    labelAge = new JLabel();
    labelAddress = new JLabel();

    fieldName = new JTextField();
    fieldAge = new JTextField();
    fieldAddress = new JTextField();

    buttonOK = new JButton();
    buttonClear = new JButton();
    buttonShow = new JButton();
    buttonExit = new JButton();

    panelTop = new JPanel();
    panelBottom = new JPanel();

    ////////////////////////////

    labelName.setText("Nome:");
    labelAge.setText("Idade:");
    labelAddress.setText("Endereço:");

    buttonOK.setText("OK");
    buttonClear.setText("Limpar");
    buttonShow.setText("Mostrar");
    buttonExit.setText("Sair");

    buttonOK.addActionListener(this);
    buttonClear.addActionListener(this);
    buttonShow.addActionListener(this);
    buttonExit.addActionListener(this);

    frame.add(labelName);
    frame.add(labelAge);
    frame.add(labelAddress);
    frame.add(fieldName);
    frame.add(fieldAge);
    frame.add(fieldAddress);
    frame.add(buttonOK);
    frame.add(buttonClear);
    frame.add(buttonShow);
    frame.add(buttonExit);
    frame.add(panelTop);
    frame.add(panelBottom);
  }

  StudentsForm() {
    frame.setSize(600, 400);
    frame.setResizable(false);
    frame.setLocation(400, 200);
    frame.setTitle("Formulário de estudantes");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setLayout(new GridLayout(4, 2));
    initializeElements();

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new StudentsForm();

    System.out.println("Hey");
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    String command = event.getActionCommand();

    switch (command) {
      case "OK":
        students.add(new Student(fieldName.getText(), fieldAddress.getText(), Integer.parseInt(fieldAge.getText())));

        fieldName.setText("");
        fieldAddress.setText("");
        fieldAge.setText("");

        break;

      case "Limpar":
        fieldName.setText("");
        fieldAddress.setText("");
        fieldAge.setText("");
        break;

      case "Mostrar":
        String studentsString = new String();

        for (Student student : students) {

          studentsString += "Id:" + student.getUUID() + ", ";
          studentsString += "Nome:" + student.getName() + ", ";
          studentsString += "Idade:" + student.getAge() + ", ";
          studentsString += "Endereço:" + student.getAdress() + "";
          studentsString += "\n";
        }

        JOptionPane.showMessageDialog(null, studentsString);
        break;

      case "Sair":
        frame.dispose();
        break;
    }

    System.out.println(command);
  }
}
