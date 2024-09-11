package LabAss3_AdapterPattern.Adapter;

import LabAss3_AdapterPattern.Adaptee.*;
import LabAss3_AdapterPattern.Target.*;

public class RefrigeratorAdapter implements Outlet {
    private Refrigerator ref;

    public RefrigeratorAdapter(Refrigerator ref) {
        this.ref = ref;
    }

    @Override
    public String plugIn() {
        if(isCompatible(ref.getPlugType(), ref.getVoltage(), ref.getAmperage())){
            return ref.startCooling();
        }
        else{
            return "\tIncompatible power outlet for Refrigerator";
        }
    }
    @Override
    public boolean isCompatible(String plugType, int voltage, double amperage) {
        return plugType.equals("J") && voltage == 120 && amperage == 5;
    }
}
