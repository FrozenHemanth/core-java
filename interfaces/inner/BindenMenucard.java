package com.xworkz.interfaces.inner;

public class BindenMenucard implements Menucard{


    @Override
    public String[] getItems(int tableNo, String itemName) {
        System.out.println("getitems executig in BindingMenucsrd");
        System.out.println("tableno="+tableNo);
        System.out.println("itemname"+itemName);
        return new String[0];
    }
}
