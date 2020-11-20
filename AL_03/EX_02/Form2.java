package EX_02;

import java.awt.*;

public class Form2 {
  public static void main(String[] args) {
    Frame f = new Frame();
    Label l1 = new Label("Primeiro", Label.LEFT);
    Label l2 = new Label("Segundo", Label.CENTER);
    Label l3 = new Label("Terceiro", Label.RIGHT);
    f.setTitle("Exemplo com labels");
    f.setSize(300, 200);
    f.setLocation(50, 50);
    f.setLayout(new FlowLayout());
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(new Label("... é o Fim!!!"));
    f.setVisible(true);
  }
}