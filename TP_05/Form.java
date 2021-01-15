import java.awt.*;
import java.awt.event.*;
import com.google.gson.Gson;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;

public class Form extends Frame implements ActionListener {
  private JFrame window;
  private JPanel panelTop;
  private Label nameLabel;
  private TextField nameField;
  private JPanel namePanel;
  private Label ageLabel;
  private TextField ageField;
  private JPanel agePanel;
  private Label weightLabel;
  private TextField weightField;
  private JPanel weightPanel;
  private Label heightLabel;
  private TextField heightField;
  private JPanel heightPanel;
  private Label objectiveLabel;
  private TextField objectiveField;
  private JPanel objectivePanel;
  private JButton addButton;
  private JButton clearButton;
  private JButton showDataButton;
  private JButton exitButton;
  private JPanel panelBottom;

  private IStudentRepository _studentRepository;

  public Form(IStudentRepository studentRepository) {
    super();
    _studentRepository = studentRepository;
  }

  public void createWindow() {
    window = new JFrame("Gym");

    panelTop = new JPanel(null);

    nameLabel = new Label("Nome:");
    nameField = new TextField(20);
    namePanel = new JPanel();

    ageLabel = new Label("Idade:");
    ageField = new TextField(20);
    agePanel = new JPanel();

    weightLabel = new Label("Peso:");
    weightField = new TextField(20);
    weightPanel = new JPanel();

    heightLabel = new Label("Altura:");
    heightField = new TextField(20);
    heightPanel = new JPanel();

    objectiveLabel = new Label("Objetivo:");
    objectiveField = new TextField(20);
    objectivePanel = new JPanel();

    namePanel.add(nameLabel);
    namePanel.add(nameField);
    panelTop.add(namePanel);

    agePanel.add(ageLabel);
    agePanel.add(ageField);
    panelTop.add(agePanel);

    weightPanel.add(weightLabel);
    weightPanel.add(weightField);
    panelTop.add(weightPanel);

    heightPanel.add(heightLabel);
    heightPanel.add(heightField);
    panelTop.add(heightPanel);

    objectivePanel.add(objectiveLabel);
    objectivePanel.add(objectiveField);
    panelTop.add(objectivePanel);

    addButton = new JButton("Adicionar");
    clearButton = new JButton("Limpar");
    showDataButton = new JButton("Apresentar dados");
    exitButton = new JButton("Sair");

    addButton.setName("addButton");
    clearButton.setName("clearButton");
    showDataButton.setName("showDataButton");
    exitButton.setName("exitButton");

    panelBottom = new JPanel(null);

    for (JButton button : new JButton[] { addButton, clearButton, showDataButton, exitButton }) {
      button.addActionListener(this);
      panelBottom.add(button);
      button.setAlignmentY(200);
    }

    panelTop.setLayout(new GridLayout(5, 0));
    panelTop.setSize(400, 200);

    panelBottom.setLayout(new GridLayout(1, 4));
    panelBottom.setSize(400, 200);

    window.add(panelTop);
    window.add(panelBottom);

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setSize(400, 400);
  }

  public void clearFields() {
    nameField.setText("");
    ageField.setText("");
    weightField.setText("");
    heightField.setText("");
    objectiveField.setText("");
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    switch (event.getActionCommand()) {
      case "Sair":
        System.exit(0);
        break;

      case "Apresentar dados":
        String deserializedContent;

        Gson gson = new Gson();

        deserializedContent = gson.toJson(_studentRepository.list());

        JOptionPane.showMessageDialog(null, deserializedContent);
        break;

      case "Limpar":
        clearFields();
        break;

      case "Adicionar":
        if (nameField.getText().isEmpty() 
          || ageField.getText().isEmpty() 
          || weightField.getText().isEmpty()
          || heightField.getText().isEmpty() 
          || objectiveField.getText().isEmpty())
          JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        
        String name = nameField.getText(); 
        int age = Integer.parseInt(nameField.getText());
        float weight = Float.parseFloat(weightField.getText());
        float height = Float.parseFloat(heightField.getText());
        String objective = objectiveField.getText(); 

        var student = new Student(
          name,
          age,
          weight,
          height,
          objective
        );

        var created = _studentRepository.create(student);
      
        if (created) 
          JOptionPane.showMessageDialog(null, "Criado com sucesso.");
         else 
          JOptionPane.showMessageDialog(null, "Falha ao criar.");

        clearFields();
        break;
    }
  }
}
