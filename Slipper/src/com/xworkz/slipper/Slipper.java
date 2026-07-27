package com.xworkz.slipper;

import java.lang.reflect.Type;
import java.util.Arrays;

public class Slipper {
    Type type;
    Warranty warranty;
    int[] sizes;
    double price;
    boolean waterProof;

    public Slipper(Type type, Warranty warranty, int[] sizes, double price, boolean waterProof) {
        this.type = type;
        this.warranty = warranty;
        this.sizes = sizes;
        this.price = price;
        this.waterProof = waterProof;
    }

    public void priceInfo(){
        System.out.println("The price is depending on the brand and quality.");
    }

    public void sizeInfo(){
        System.out.println("The size of the slipper is upto 3-12.");
    }

    public String toString(){
        return "Warranty:"+warranty+",Type:"+type+",Size:"+ Arrays.toString(sizes)+",Price:"+price+",WaterProof:"+waterProof;
    }

}
