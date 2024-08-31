package de.hskl.ita;

import java.io.IOException;
import java.util.logging.*;
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

    final Logger log = Logger.getLogger(App.class.getName());
    final Handler systemOut = new ConsoleHandler();

    systemOut.setLevel(Level.CONFIG);
    log.addHandler(systemOut);
    log.setLevel(Level.CONFIG);
    log.setUseParentHandlers(false);

    final FileHandler fileTxt;
    final SimpleFormatter formatter = new SimpleFormatter();

    try{
      fileTxt = new FileHandler("Logs.txt");
      fileTxt.setFormatter(formatter);
      fileTxt.setLevel(Level.ALL);
      log.addHandler(fileTxt);
    } catch (IOException e) {
      e.printStackTrace();
    }

    log.info(">> App.Main");

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

    log.info("<< App.Main");

  }

  private static void print() {
    System.out.format("%.3f%n", lengths.get());
  }

  private static FixedPointNumber lengths;
}