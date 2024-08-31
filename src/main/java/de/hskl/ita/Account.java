package de.hskl.ita;
/**
 * Berechnung von Geldbetr&auml;gen
 * Multiplikation
 * @author Kathrin Blabusch
 * @see FixedPointNumber
 * @version 1.0
 */
/*
 * Logging mit JUL
 */

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class Account extends FixedPointNumber{

  final private Logger rectLog = Logger.getLogger(Account.class.getName());
  final private Handler systemOut = new ConsoleHandler();

  public Account() throws IOException {
    super();
  }
  public Account(int s, int v) throws IOException {
    super(s, v);
    setupLogging(rectLog, systemOut);
    rectLog.info(">> Account(" + s + "," + v + ")");
    this.a = this.multiply(s);
    rectLog.config("** Geldbetrag mit Verschiebung " + a);
    rectLog.info("<< Account(" + s + "," + v + ")");
  }

  public int multiply (double x){
    FixedPointNumber faktor2 = new FixedPointNumber(this.scaling, this.displacement, x);
    this.value *= (int) ((double) (faktor2.getValue() + this.displacement) /this.scaling);
    return 0;
  }

  public void write() {
    System.out.println("Test: " + this.getValue());
  }
}