import java.rmi.*;

public class AddClient {
  public static void main(String args[]) {
    try {
      //String addServerURL = "rmi://" + args[0] + "/AddServer";
      String addServerURL = "rmi://" + "127.0.0.1" + "/AddServer";
      //Returns a reference, a stub, for the remote object associated with the specified name.
      AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
      System.out.println("The first number is: " + 89.9);
      double d1 = 89.9;
      
      System.out.println("The second number is: " + 77.8);
      double d2 = 77.8;

      System.out.println("The sum is: " + addServerIntf.add(d1, d2));
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
