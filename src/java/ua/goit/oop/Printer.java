package main.java.OOP;

public class Printer {
    private String printerColor;
    private String model;
    private double typeSpeed;
    private double printVolume;

    public Printer(String printerColor, String model, double speed, double printVolume) {
        this.printerColor = printerColor;
        this.model = model;
        this.typeSpeed = speed;
        this.printVolume = printVolume;
    }

    public String getPrinterColor() {
        return printerColor;
    }

    public void setPrinterColor(String printerColor) {
        this.printerColor = printerColor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getTypeSpeed() {
        return typeSpeed;
    }

    public void setTypeSpeed(double typeSpeed) {
        this.typeSpeed = typeSpeed;
    }

    public double getPrintVolume() {
        return printVolume;
    }

    public void setPrintVolume(double printVolume) {
        this.printVolume = printVolume;
    }
}
