package fixed;
/**
 * Anwendungsklasse
 * Die Anwendung beschäftig sich mit der Repräsentation von rationalen Zahlen und
 * der Nutzung der Integer-Arithmetik für das Rechnen mit solchen Zahlen.
 * @author Kathrin Blabusch
 */
public class App {
  /*
  * Hauptprogramm, das einige Instanzen erzeugt.
  * Instanziieren von Objekten
  * Die Messwerte werden auf der Konsole ausgegeben.
  *
  * @param args Argumente für die Anwendung
  * */
  public static void main(String[] args) {
    System.out.println("Messwerte");

    int s = 200;
    int v = 200;
    lengths = new FixedPointNumber(s, v);

    double x = 1.0;
    lengths.set(x);
    print();
    System.out.println("Die ganze Zahl dazu: " + lengths.getValue());

    double y = 2.0;
    lengths.add(y);

    System.out.println("Das Ergebnis der Addition von 1.0 und 2.0");
    print();
    System.out.println("Die ganze Zahl dazu: " + lengths.getValue());

    System.out.println("Das Ergebnis der Subtaktion von 2.0");
    lengths.subtract(y);
    print();
    System.out.println("Die ganze Zahl dazu: " + lengths.getValue());

    x = 2.25;
    lengths.set(x);
    print();
    System.out.println("Die ganze Zahl dazu: " + lengths.getValue());
  }

  private static void print() {
    System.out.format("%.3f%n", lengths.get());
  }

  private static FixedPointNumber lengths;
}