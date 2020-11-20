package EX_02;

public class DemoForm1 {
  public static void main(String[] args) {
    Form1 f = new Form1("Event Listener", 300, 100, 50, 50);
    f.addWindowListener(new FechaJanela());
    f.show();
  }
}