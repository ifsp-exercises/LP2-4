public class Anual extends Semestral {
  private float p3;
  private float p4;

  Anual(float x, float y, float w, float z) {
    super(x, y);
    p3 = w;
    p4 = z;
  }

  public void setP3(float x) {
    p3 = x;
  }

  public void setP4(float x) {
    p4 = x;
  }

  public float getP3() {
    return p3;
  }

  public float getP4() {
    return p4;
  }

  public float getMedia() {
    return (p1 + p2 + p3 + p4) / 4;
  }
}