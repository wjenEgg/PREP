package rmistock;

import java.net.URL;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class StockWatchText implements StockUpdate {
  public static void main(String args[]) {
    String host = "";
    if (args.length > 0) {
      host = args[0];
    }
    StockWatchText swt = new StockWatchText();
    try {
      UnicastRemoteObject.exportObject(swt, 0);
	    String serverName = "//" + host + ":"
        + "5001" + "/rmistock.StockInfo";
      StockInfo stockInfo = (StockInfo)Naming.lookup(serverName);
      stockInfo.register(swt);
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(2);
    }
  }

  public synchronized void update(String symbol, String price)
                           throws RemoteException {
    System.out.println(symbol + ": " + price);
  }
}

