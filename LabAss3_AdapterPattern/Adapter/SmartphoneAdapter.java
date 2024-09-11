package LabAss3_AdapterPattern.Adapter;

import LabAss3_AdapterPattern.Adaptee.*;
import LabAss3_AdapterPattern.Target.*;

public class SmartphoneAdapter implements Outlet {
    private SmartphoneCharger phone;

    public SmartphoneAdapter(SmartphoneCharger phone) {
        this.phone = phone;
    }

    @Override
    public String plugIn() {
        if(isCompatible(phone.getPlugType(), phone.getVoltage(), phone.getAmperage())){
            return phone.chargePhone();
        }
        else{
            return "\tIncompatible power outlet for Smartphone";
        }    
    }
    

    @Override
    public boolean isCompatible(String plugType, int voltage, double amperage) {
        return plugType.equals("C") && voltage == 25 && amperage == 2;
    }
}
