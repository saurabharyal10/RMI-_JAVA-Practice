import java.net.*;
import java.rmi.*;

public class AddServer {
  public static void main(String args[]) {

    try {
      AddServerImpl addServerImpl = new AddServerImpl();
//The Naming class provides methods for storing and obtaining references to remote objects in a remote object registry. 

//Rebinds the specified name to a new remote object.
      Naming.rebind("AddServer", addServerImpl); //its same like servlet mapping -> url pattern
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
