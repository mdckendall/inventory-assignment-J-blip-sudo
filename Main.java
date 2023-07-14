import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
  String name;
  String serialNumber;
  int value;
  public Inventory(){
    
  }
  public String toString(){
    return "Name: %s\n Serial Number: %s\n Value: %d\n".formatted(name, serialNumber, value);
  }
}

class Main {
  public static void main(String[] args) {
    ArrayList<Inventory> cart=new ArrayList<Inventory>();
    int input=0;
    while(input != 5){
      System.out.println("Press 1 to add an item");
      System.out.println("Press 2 to delete an item");
      System.out.println("Press 3 to update an item");
      System.out.println("Press 4 to show all the item");
      System.out.println("Press 5 to quit the program");
      Scanner one = new Scanner(System.in);
      input = one.nextInt();
      one.nextLine();
      if (input == 1) {
        Inventory tempItem = new Inventory();
        System.out.println("Enter the name:");
        String name = one.nextLine();  
        System.out.println("Enter the Serial Number:");
        String serialNumber = one.nextLine();  
        System.out.println("Enter the value in dollars (Whole Numbers)");
        int value = one.nextInt();
        one.nextLine();
        tempItem.name=name;
        tempItem.serialNumber=serialNumber;
        tempItem.value=value;
        cart.add(tempItem);
      }
      
      else if (input == 2) {
      System.out.println("Enter the serial number of the item you'd like to delete");
      String serialNumber = one.nextLine(); 
      for(int i=0; i<cart.size(); i++) {
        if(cart.get(i).serialNumber.equals(serialNumber)) {
          cart.remove(i);
        }
      }    
      }
        
      else if (input == 3) {
        System.out.println("Enter the serial number of the item you are changing");
        String serialNumber = one.nextLine();
        String newName;
        String newSerialNumber;
        int newValue;
      for(int i=0; i<cart.size(); i++) {
        if(cart.get(i).serialNumber.equals(serialNumber)) {
        System.out.println("Item found. Beginning update.");
        System.out.println("Enter the new name:");
        newName=one.nextLine();
        cart.get(i).name=newName;
        System.out.println("Enter the new serial number:");
        newSerialNumber=one.nextLine();
        cart.get(i).serialNumber=newSerialNumber;
        System.out.println("Enter the new value:");
        newValue=one.nextInt();
        cart.get(i).value=newValue;
        }
      
      }
      }
  
      else if (input == 4) {
          for(int i = 0; i < cart.size(); i++) {
            System.out.println("Item Number"+i);
            System.out.println(cart.get(i));
          }
      }
  
      else if (input == 5) {
        System.out.println("Goodbye!");
      }
      
      else {
      System.out.println("Input invalid. Please type a number between 1 and 5");
      }
    }
    
  }
}