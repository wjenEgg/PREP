package rmistock;

import java.rmi.*;

public interface StockUpdate extends java.rmi.Remote {
  void update(String symbol, String price) throws RemoteException;
}
