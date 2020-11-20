package EX_02;

import javax.swing.*;

class Form1 extends JFrame {
  Form1(String titulo, int largura, int altura, int colinic, int lininic) {
    super(titulo);
    setSize(largura, altura);
    setLocation(colinic, lininic);
  }

  public static void main(String[] args) {
    Form1 f = new Form1("Meu Primeiro Form", 300, 150, 50, 50);
    f.setVisible(true);
  }
}