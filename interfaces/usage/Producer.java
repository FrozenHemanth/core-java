package com.xworkz.interfaces.usage;

import com.xworkz.interfaces.Supermarket;

public class Producer {
    private  Supermarket supermarket;

    public Producer(Supermarket supermarket) {

        this.supermarket = supermarket;
    }
public void bill()
{
   if(this.supermarket!=null)
       System.out.println("belling executing by producer");
   {

       this.supermarket.discount();
       this.supermarket.purchase();

   }
}

}
