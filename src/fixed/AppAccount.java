package fixed;
/**
 * Anwendungsklasse
 * Anwendungsklasse für das Berechnen von Geldbetr&auml;gen.
 * @author Kathrin Blabusch
 */
public class AppAccount {
  /*
   * Hauptprogramm, das einige Instanzen erzeugt.
   * Instanziieren von Objekten
   * Die Geldbetr&auml;ge  werden auf der Konsole ausgegeben.
   *
   * @param args Argumente für die Anwendung
   * */
  private static Account lengths2;

  public static void main(String[] args) {

    System.out.println("Messwerte für Multiply");

    int s = 100;
    int v = 0;
    lengths2 = new Account(s, v);

    double x = 2.0;
    lengths2.set(x);
    print();
    System.out.println("Die ganze Zahl dazu: " + lengths2.getValue());

    double y = 4.0;
    lengths2.multiply(y);

    System.out.println("Das Ergebnis der Multiplikation von 2.0 und 4.0");
    print();
    System.out.println("Die ganze Zahl dazu: " + lengths2.getValue());

    lengths2.write();
  }

  private static FixedPointNumber lengths;

  private static void print() {
    System.out.format("%.3f%n", lengths2.get());
  }

}
