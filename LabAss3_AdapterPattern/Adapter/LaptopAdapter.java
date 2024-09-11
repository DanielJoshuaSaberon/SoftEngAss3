package LabAss3_AdapterPattern.Adapter;

import LabAss3_AdapterPattern.Adaptee.*;
import LabAss3_AdapterPattern.Target.*;

public class LaptopAdapter implements Outlet {
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String plugIn() {
        if(isCompatible(laptop.getPlugType(), laptop.getVoltage(), laptop.getAmperage())){
           return laptop.charge();
        }
        else{
            return "\tIncompatible power outlet for Loptop";
        }

    }
    @Override
    public boolean isCompatible(String plugType, int voltage, double amperage) {
        return plugType.equals("B") && voltage == 30 && amperage == 3.42;
    }
}
