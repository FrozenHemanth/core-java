package com.xworkz.Runner;

import com.xworkz.implenents.Patient;
import com.xworkz.interfacejava.Hospetal;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospetal hospetal=new Patient();
        {
            hospetal.takeAppointment();
            hospetal.cancelAppointment();
            hospetal.doctorInfo();
            hospetal.patientInfo();

            Hospetal.HospInfo();
        }
    }
}
