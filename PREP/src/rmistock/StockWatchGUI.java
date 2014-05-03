package rmistock;

import java.net.URL;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
import java.awt.*;
import java.awt.List;

public class StockWatchGUI implements StockUpdate {
  StockList l;

  public StockWatchGUI() {
    Frame frm = new Frame("StockWatchGUI");
    l = new StockList();
    frm.add(l);
    frm.pack();
    frm.show();
  }
  
  public static void main(String args[]) {
    String host = "";
    if (args.length > 0) {
      host = args[0];
    }
    StockWatchGUI swg = new StockWatchGUI();
    try {

        UnicastRemoteObject.exportObject(swg, 1300);
	    String serverName = "//" + host + ":"
        + "5001" + "/rmistock.StockInfo";
     StockInfo stockInfo = (StockInfo)Naming.lookup(serverName);
      stockInfo.register(swg);
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(2);
    }
  }

  public synchronized void update(String symbol, String price)
                           throws RemoteException {
    l.updateStock(symbol, price);
  }
}

class StockList extends List {
  private static String stocks[] = {"SUNW", "IBM" };
  
  public StockList() {
    super(stocks.length, false);
    for (int i = 0; i < stocks.length; i++) {
      addItem(formatStock(stocks[i], "      "));
    }
  }

  private String formatStock(String symbol, String price) {
    int padlen = (symbol.length() > 10) ? 0 : 10 - symbol.length();
    return symbol + "          ".substring(0, padlen) + price;
  }
  
  public synchronized void updateStock(String symbol, String price) {
    int i = 0;
    for (i = 0; i < stocks.length; i++) {
      if (stocks[i].equals(symbol))
        break;
    }
    if (i >= stocks.length)
      return;
    replaceItem(formatStock(symbol, price), i);
  }

  public synchronized void paint(Graphics g) {
    Font f = getFont();
    Font nf = new Font("Monospaced", f.getStyle(), f.getSize());
    setFont(nf);
    super.paint(g);
  }

  public void update(Graphics g) {
      paint(g);
  }
}


