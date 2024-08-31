package fixed;
/**
 * Berechnung von K&ouml;rpergr&ouml;ßen
 * Addition
 * Subtraktion
 * @author Kathrin Blabusch
 * @version 1.0
 */
public class FixedPointNumber {

  public FixedPointNumber() {
    this.scaling = 0;
    this.displacement = 0;
    this.set(1.0);
  }

  public FixedPointNumber(int s, int v, double x) {
    this.scaling = s;
    this.displacement = v;
    this.set(x);
  }

  public FixedPointNumber(int s, int v) {
    this.scaling = s;
    this.displacement = v;
    this.set(1.0);
  }

  public void add(double x) {
    FixedPointNumber summand = new FixedPointNumber(this.scaling,
        this.displacement,
        x);
    this.value += summand.getValue() + this.displacement;
  }

  public void subtract(double x) {
    FixedPointNumber summand = new FixedPointNumber(this.scaling,
        this.displacement,
        x);
    this.value -= (summand.getValue() + this.displacement);
  }


  public void set(double x) {
    this.value = (int) ((scaling*x) - displacement);
  }

  public double get() {
    return (this.value + displacement)/(double)scaling;
  }

  public int getValue() {
    return this.value;
  }


  public int getDisplacement() {
    return this.displacement;
  }

  public int getScalingFactor() {
    return this.scaling;
  }

  protected int scaling;

  protected int displacement;

  protected int value;
}

