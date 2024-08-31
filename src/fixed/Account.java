package fixed;
/**
 * Berechnung von Geldbetr&auml;gen
 * Multiplikation
 * @author Kathrin Blabusch
 * @see FixedPointNumber
 * @version 1.0
 */
public class Account extends FixedPointNumber{

  public Account(){
    super();
  }
  public Account(int s, int v) {
    super(s, v);
  }

  public void multiply (double x){
    FixedPointNumber faktor2 = new FixedPointNumber(this.scaling, this.displacement, x);
    this.value *= (int) ((double) (faktor2.getValue() + this.displacement) /this.scaling);
  }

  public void write() {
    System.out.println("Test: " + this.getValue());
  }
}