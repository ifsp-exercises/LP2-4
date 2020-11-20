package EX_01;

import java.awt.*;

public class DemoFlowLayout extends Frame {
  public static void main(String[] args) {
    Frame f = new Frame("FlowLayout");
    f.setSize(500, 400);
    f.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
    f.addWindowListener(new FechaJanela());

    for (int i = 1; i <= 10; i++)
      f.add(new Button("Botão " + (i + 1)));

    f.show();
  }
}