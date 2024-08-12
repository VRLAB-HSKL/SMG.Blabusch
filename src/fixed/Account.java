package fixed;

public class Account extends FixedPointNumber{

  public Account(){
    super();
  }
  public Account(int s, int v) {
    super(s, v);
  }

  public void write() {
    System.out.println("Test: " + this.getValue());
  }
}