public class Semestral
{
  protected float p1;
  protected float p2;

  Semestral(float x, float y)
  {
    p1 = x;
    p2 = y;
  }

  public void setP1(float x)
  {
    p1 = x;
  }

  public void setP2(float x)
  {
    p2 = x;
  }

  public float getP1()
  {
    return p1;
  }

  public float getP2()
  {
    return p2;
  }

  public float getMedia()
  {
    return (p1+p2)/2;
  }
}