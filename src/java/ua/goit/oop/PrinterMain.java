package main.java.OOP;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer("White","HP", 30, 100);
        System.out.println("printVolume "+ printer.getPrintVolume());
    }
}
