package Calculadora;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora extends Frame implements ActionListener {

  private static double calculo1 = 0;
  private static double calculo2 = 0;
  private String operacao = "";

  JFrame frame = new JFrame("Calculadora");
  JPanel p1 = new JPanel(null);
  JPanel p2 = new JPanel(null);
  JPanel p3 = new JPanel(null);
  JPanel p4 = new JPanel(null);
  JPanel p5 = new JPanel(null);
  JPanel p6 = new JPanel(null);

  TextField txtFieldNome = new TextField(5);
  Button btn1 = new Button("1");
  Button btn2 = new Button("2");
  Button btn3 = new Button("3");
  Button btn4 = new Button("4");
  Button btn5 = new Button("5");
  Button btn6 = new Button("6");
  Button btn7 = new Button("7");
  Button btn8 = new Button("8");
  Button btn9 = new Button("9");
  Button btn0 = new Button("0");
  Button btnDot = new Button(".");

  Button adicao = new Button("+");
  Button subtracao = new Button("-");
  Button divisao = new Button("/");
  Button multiplicacao = new Button("*");
  Button limpar = new Button("C");
  Button executar = new Button("=");

  public Calculadora() {
    super();

    txtFieldNome.disable();
    txtFieldNome.setText("");

    p1.setLayout(new GridLayout(0, 1, 0, 5));
    p1.setSize(200, 300);
    p1.add(txtFieldNome);

    p2.setLayout(new GridLayout(0, 4, 0, 10));
    p2.setSize(200, 300);
    p2.add(btn1);
    p2.add(btn2);
    p2.add(btn3);
    p2.add(divisao);

    p3.setLayout(new GridLayout(0, 4, 0, 10));
    p3.setSize(200, 300);
    p3.add(btn4);
    p3.add(btn5);
    p3.add(btn6);
    p3.add(multiplicacao);

    p4.setLayout(new GridLayout(0, 4, 0, 10));
    p4.setSize(200, 300);
    p4.add(btn7);
    p4.add(btn8);
    p4.add(btn9);
    p4.add(subtracao);

    p5.setLayout(new GridLayout(0, 4, 0, 10));
    p5.setSize(200, 300);
    p5.add(btn0);
    p5.add(executar);
    p5.add(adicao);
    p5.add(limpar);

    btn0.addActionListener(this);
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    btn6.addActionListener(this);
    btn7.addActionListener(this);
    btn8.addActionListener(this);
    btn9.addActionListener(this);

    subtracao.addActionListener(this);
    adicao.addActionListener(this);
    multiplicacao.addActionListener(this);
    divisao.addActionListener(this);
    limpar.addActionListener(this);
    executar.addActionListener(this);

    frame.add(p1);
    frame.add(p2);
    frame.add(p3);
    frame.add(p4);
    frame.add(p5);

    frame.setLayout(new GridLayout(5, 1, 0, 5));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(300, 400);
  }

  public static void main(String[] args) throws Exception {
    new Calculadora();
  }

  public static boolean isNumeric(String value) {
    if (value == null) {
      return false;
    }
    
    try {
      Double.parseDouble(value);
    } catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    try {
      if (isNumeric(((Button) e.getSource()).getLabel()))
        txtFieldNome.setText(txtFieldNome.getText().toString() + ((Button) e.getSource()).getLabel());

      ArrayList<String> operadores = new ArrayList<>();
      operadores.add("-");
      operadores.add("+");
      operadores.add("*");
      operadores.add("/");

      if (operadores.contains(((Button) e.getSource()).getLabel())) {
        operacao = ((Button) e.getSource()).getLabel();
        calculo1 = Double.parseDouble(txtFieldNome.getText());
        txtFieldNome.setText("");
      }

      if (e.getSource() == limpar) {
        calculo1 = 0;
        calculo2 = 0;
        txtFieldNome.setText("");
      }
    } catch (Exception exception) {
    }

    if (e.getSource() == executar) {
      try {
        switch (operacao) {
          case "-":
            calculo2 = Double.parseDouble(txtFieldNome.getText());
            txtFieldNome.setText(Double.toString(calculo1 - calculo2));
            break;

          case "+":
            calculo2 = Double.parseDouble(txtFieldNome.getText());
            txtFieldNome.setText(Double.toString(calculo1 + calculo2));
            break;
          case "*":
            calculo2 = Double.parseDouble(txtFieldNome.getText());
            txtFieldNome.setText(Double.toString(calculo1 * calculo2));
            break;
          case "/":
            calculo2 = Double.parseDouble(txtFieldNome.getText());
            txtFieldNome.setText(Double.toString(calculo1 / calculo2));
            break;
        }
      } catch (Exception exception) {
      }
    }
  }

}