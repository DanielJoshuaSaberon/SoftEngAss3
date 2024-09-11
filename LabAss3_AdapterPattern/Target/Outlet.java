package LabAss3_AdapterPattern.Target;

public interface Outlet {
    public String plugIn();
    public boolean isCompatible(String plugType, int voltage, double amperage);
}
