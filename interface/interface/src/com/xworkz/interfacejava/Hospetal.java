package com.xworkz.interfacejava;

public interface Hospetal {

    int nurse=60;
    String name="yanapoye";
    int noOfAmbulence=8;

    void takeAppointment();
    void cancelAppointment();

default void doctorInfo()
{
    System.out.println("doctorinfo is running in hospetal interface");
}

default void patientInfo()
{
    System.out.println("patient info method runing in hospetal interface");
}
static void HospInfo()
{
    System.out.println("hospinfo running in hospetal interface");
}

}
