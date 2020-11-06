public class Eletrodomestico {
  private boolean ligado;
  private int voltagem;
  private int consumo;

  public Eletrodomestico(boolean ligado, int voltagem, int consumo) {
    this.ligado = ligado;
    this.voltagem = voltagem;
    this.consumo = consumo;
  }

  public void setLigado(boolean isLigado) {
    this.ligado = isLigado;
  }

  public int getConsumo() {
    return this.consumo;
  }

  public int getVoltagem() {
    return this.voltagem;
  }

  public boolean isLigado() {
    return this.ligado;
  }
}