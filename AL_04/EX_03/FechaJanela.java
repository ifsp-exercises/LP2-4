package EX_03;

import java.awt.event.*;

class FechaJanela extends WindowAdapter {
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }
}
