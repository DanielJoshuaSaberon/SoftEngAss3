package LabAss3_AdapterPattern.Adaptee;

public class SmartphoneCharger {
    private String plugType;
    private int voltage;
    private double amperage;

    public SmartphoneCharger(String plugType, int voltage, double amperage) {
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

    public String chargePhone(){
        return "\tOutlet Compatible\n\tYou can charge your Phone now";
    }
}
