package LabAss3_AdapterPattern.Adaptee;

public class Refrigerator {
    private String plugType;
    private int voltage;
    private double amperage;

    public Refrigerator(String plugType, int voltage, double amperage) {
        this.plugType = plugType;
        this.voltage = voltage;
        this.amperage = amperage;
    }

    public String getPlugType() {
        return plugType;
    }
    //
    public int getVoltage() {
        return voltage;
    }
    //
    public double getAmperage() {
        return amperage;
    }

    public String startCooling(){
        return "\tOutlet Compatible\n\tYou can plug in your Refrigerator to cool";
    }
}
