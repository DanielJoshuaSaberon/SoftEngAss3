package LabAss3_AdapterPattern;

import java.util.*;
import LabAss3_AdapterPattern.Adaptee.*;
import LabAss3_AdapterPattern.Adapter.*;
import LabAss3_AdapterPattern.Target.Outlet;

public class CompatabilityChecker {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //
        boolean x = true;
        do {
            System.out.println("1. Check Laptop");
            System.out.println("2. Check Smartphone");
            System.out.println("3. Check Refrigerator");
            System.out.println("4. Exit");
            System.out.print("Enter your choice to check if compatible: ");
            int choice = sc.nextInt();sc.nextLine();
            //
            switch (choice){
                case 1:
                    System.out.println("\tEnter the following details");
                    System.out.print("\tPlug Type[B-L]: ");
                    String Plugtype = sc.nextLine().toUpperCase();
                    System.out.print("\tVoltage: ");
                    int volt = sc.nextInt();sc.nextLine();
                    System.out.print("\tAmperage: ");
                    double amp = sc.nextDouble();sc.nextLine();
                    //
                    Laptop laptop = new Laptop(Plugtype,volt,amp);
                    Outlet laptopTarget = new LaptopAdapter(laptop);
                    System.out.println("---------------------------");
                    System.out.println(laptopTarget.plugIn());
                    System.out.println("---------------------------");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\tEnter the following details");
                    System.out.print("\tPlug Type[B-L]: ");
                    Plugtype = sc.nextLine().toUpperCase();
                    System.out.print("\tVoltage: ");
                    volt = sc.nextInt();sc.nextLine();
                    System.out.print("\tAmperage: ");
                    amp = sc.nextDouble();sc.nextLine();
                    //
                    SmartphoneCharger phone = new SmartphoneCharger(Plugtype,volt,amp);
                    Outlet phoneTarget = new SmartphoneAdapter(phone);
                    System.out.println("---------------------------");
                    System.out.println(phoneTarget.plugIn());
                    System.out.println("---------------------------");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\tEnter the following details");
                    System.out.print("\tPlug Type[B-L]: ");
                    Plugtype = sc.nextLine().toUpperCase();
                    System.out.print("\tVoltage: ");
                    volt = sc.nextInt();sc.nextLine();
                    System.out.print("\tAmperage: ");
                    amp = sc.nextDouble();sc.nextLine();
                    //
                    Refrigerator ref = new Refrigerator(Plugtype,volt,amp);
                    Outlet refTarget = new RefrigeratorAdapter(ref);
                    System.out.println("---------------------------");
                    System.out.println(refTarget.plugIn());
                    System.out.println("---------------------------");
                    System.out.println();
                    break;
                case 4:
                    x = false;
                    break;

            }
        }while(x);


//        SmartphoneCharger phone = new SmartphoneCharger();
//        Outlet phoneTarget = new SmartphoneAdapter(phone);
//
//        Refrigerator ref = new Refrigerator();
//        Outlet refTarget = new RefrigeratorAdapter(ref);
//
//        Laptop laptop = new Laptop();
//        Outlet laptopTarget = new LaptopAdapter(laptop);
        //
//        System.out.println(phoneTarget.plugIn());
//        System.out.println(refTarget.plugIn());
//        System.out.println(laptopTarget.plugIn());
    }
}
