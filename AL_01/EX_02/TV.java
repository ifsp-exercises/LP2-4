public class TV extends Eletrodomestico {
  private int canal;
  private int volume;
  private int tamanho;

  public TV(int voltagem, int consumo, int canal, int volume, int tamanho) {
    super(false, voltagem, consumo);

    this.canal = canal;
    this.volume = volume;
    this.tamanho = tamanho;
  }

  public void setCanal(int canal) {
    this.canal = canal;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public int getTamanho() {
    return this.tamanho;
  }

  public int getCanal() {
    return this.canal;
  }

  public int getVolume() {
    return this.volume;
  }
}