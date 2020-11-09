package EX_01;

public class Quadrilatero {
  protected String ID;
  protected double lado1;
  protected double lado2;

  public Quadrilatero(double lado1, double lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  public double getArea() {
    return lado1 * lado2;
  }

  public double getPerimetro() {
    return 2 * (lado1 + lado2);
  }

  public double getDiagonal() {
    return Math.sqrt(lado1 * lado1 + lado2 * lado2);
  }

  public String getTipoQuadrilatero() {
    return ID;
  }
}