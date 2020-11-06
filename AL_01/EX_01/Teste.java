public class Teste
{
  public static void main(String[] argumentos)
  {
    Anual Joao = new Anual(7,8,9,10);

    Semestral Maria = new Semestral(7,8);
    
    System.out.println("P1 = " + Joao.getP1());
    System.out.println("P2 = " + Joao.getP2());
    System.out.println("P3 = " + Joao.getP3());
    System.out.println("P4 = " + Joao.getP4());
    System.out.println("Media = " + Joao.getMedia());
    System.out.println("P1 = " + Maria.getP1());
    System.out.println("P2 = " + Maria.getP2());
    System.out.println("Media = " + Maria.getMedia());
  }
}