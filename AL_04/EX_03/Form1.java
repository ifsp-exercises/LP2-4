package EX_03;

import java.awt.*;
import java.awt.event.*;

class Form1 extends Frame implements ActionListener {
  private int k1 = 0;
  private int k2 = 0;
  private int k3 = 0;
  private Button b1 = new Button("Botao1");
  private Button b2 = new Button("Botao2");
  private Button b3 = new Button("Botao3");
  private Label l1 = new Label(k1 + " vezes");
  private Label l2 = new Label(k2 + " vezes");
  private Label l3 = new Label(k3 + " vezes");

  public Form1(String titulo, int largura, int altura, int colinic, int lininic) {
    super(titulo);

    setSize(largura, altura);
    setLocation(colinic, lininic);
    setLayout(new GridLayout(2, 3));

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    add(b1);
    add(b2);
    add(b3);
    add(l1);
    add(l2);
    add(l3);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      ++k1;
      l1.setText(k1 + " vezes!");
    } else if (e.getSource() == b2) {
      ++k2;
      l2.setText(k2 + " vezes!");
    } else if (e.getSource() == b3) {
      ++k3;
      l3.setText(k3 + " vezes!");
    }
  }
}