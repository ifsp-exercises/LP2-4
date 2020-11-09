package EX_01;

public class Quadrado extends Quadrilatero {
  public Quadrado(double lado) {
    super(lado, lado);
    super.ID = "Quadrado";
  }

  public double getPerimetro() {
    return 4 * super.lado1;
  }

  public double getDiagonal() {
    return lado1 * Math.sqrt(2);
  }
}