import java.awt.*;
import java.awt.event.*;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class V3 extends Frame implements ActionListener {
  Pessoa pessoas = new Pessoa();
  JFrame f = new JFrame("TP3 - V1");
  JPanel p1 = new JPanel(null);
  JPanel p2 = new JPanel(null);
  JPanel p3 = new JPanel(null);
  JPanel p4 = new JPanel(null);
  JPanel p5 = new JPanel(null);

  Label lblNumero = new Label("Numero:");
  TextField txtFieldNumero = new TextField(20);
  Label lblNome = new Label("Nome:");
  TextField txtFieldNome = new TextField(30);
  Label lblSexo = new Label("Sexo:");
  JRadioButton JRadBtnMasc = new JRadioButton("Masculino", false);
  JRadioButton JRadBtnFemin = new JRadioButton("Feminino", false);
  Label lblIdade = new Label("Ïdade:");
  TextField txtFieldIdade = new TextField(3);

  Button btnOk = new Button("Ok");
  Button btnLimpar = new Button("Limpar");
  Button btnMostrar = new Button("Mostrar");
  Button btnSair = new Button("Sair");
  boolean isTrue = true;

  public V3() {
    super();
    txtFieldNumero.disable();
    btnLimpar.addActionListener(this);
    btnMostrar.addActionListener(this);
    btnOk.addActionListener(this);
    btnSair.addActionListener(this);

    p1.setLayout(new GridLayout(0, 2, 0, 5));
    p1.setSize(100, 100);
    p1.add(lblNumero);
    p1.add(txtFieldNumero);

    p2.setLayout(new GridLayout(0, 2, 0, 5));
    p2.setSize(200, 300);
    p2.add(lblNome);
    p2.add(txtFieldNome);

    p3.setLayout(new GridLayout(0, 3, 0, 5));
    p3.setSize(200, 300);
    p3.add(lblSexo);
    p3.add(JRadBtnMasc);
    p3.add(JRadBtnFemin);

    p4.setLayout(new GridLayout(0, 2, 0, 5));
    p4.setSize(200, 300);
    p4.add(lblIdade);
    p4.add(txtFieldIdade);

    p5.setLayout(new GridLayout(0, 4, 0, 5));
    p5.setSize(200, 300);
    p5.add(btnOk);
    p5.add(btnLimpar);
    p5.add(btnMostrar);
    p5.add(btnSair);

    // #region Frame
    f.add(p1);
    f.add(p2);
    f.add(p3);
    f.add(p4);
    f.add(p5);

    // f.setLayout(new FlowLayout(FlowLayout.LEFT));
    f.setLayout(new GridLayout(5, 1, 0, 5));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    f.setSize(400, 200);
  }

  public static void main(String[] args) throws Exception {
    new V3();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnOk) {
      String x = "";

      if (JRadBtnMasc.isSelected()) {
        x = JRadBtnMasc.getText();
      }
      if (JRadBtnFemin.isSelected()) {
        x = JRadBtnFemin.getText();
      }

      try {
        String name = txtFieldNome.getText();
        if (name.length() < 3) {
          JOptionPane.showMessageDialog(null, "O nome deve ter no mínimo 3 caracteres.");
          isTrue = false;
        }

        String idade = txtFieldIdade.getText();
        if (idade.length() <= 0 || idade.length() > 2) {
          JOptionPane.showMessageDialog(null, "Idade deve ter entre 1 e 2 caracteres.");
          isTrue = false;
        }
        char sexo = x.charAt(0);
        if (sexo != 'M' && sexo != 'F') {
          JOptionPane.showMessageDialog(null, "Preencha corretamente: M (Masculino) ou F (Feminino)");
          isTrue = false;
        }
        if (isTrue) {
          pessoas.setNome(name);
          pessoas.setIdade(Integer.parseInt(idade));
          pessoas.setSexo(sexo);
          pessoas.setKp();
          JOptionPane.showMessageDialog(null, "Salvo");
        }
        txtFieldIdade.setText("");
        txtFieldNome.setText("");

      } catch (Exception exception) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro, tente novamente");
        txtFieldIdade.setText("");
        txtFieldNome.setText("");
        txtFieldNumero.setText("");
      }
    }

    if (e.getSource() == btnLimpar) {
      txtFieldIdade.setText("");
      txtFieldNome.setText("");
      txtFieldNumero.setText("");
    }

    if (e.getSource() == btnMostrar) {
      txtFieldIdade.setText("" + pessoas.getIdade());
      txtFieldNome.setText(pessoas.getNome());
      txtFieldNumero.setText("" + pessoas.getKp());
    }

    if (e.getSource() == btnSair) {
      System.exit(0);
    }
  }
}
