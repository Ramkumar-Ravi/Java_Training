package nullobject;

//Interface for a printer
 interface Printer {
 void print(String document);
}

//Concrete implementation of the Printer interface
 class ConsolePrinter implements Printer {
 public void print(String document) {
     System.out.println(document);
 }
}

//Null object implementation of the Printer interface
 class NullPrinter implements Printer {
 public void print(String document) {
     // do nothing
 }
}

//Example usage
public class PrinterApplication {
 public static void main(String[] args) {
     Printer printer = getPrinter();
     printer.print("Hello, world!");
 }
 
 public static Printer getPrinter() {
     // return null to use the ConsolePrinter, or return new NullPrinter() to use 
	 //the Null Object
     return new NullPrinter();
 }
}


