package com.xworkz.interfaces.usage;

import com.xworkz.interfaces.inner.Menucard;

public class Kitchen {
    private Menucard menucard;

    public Kitchen(Menucard menucard)
    {
        this.menucard=menucard;

    }
    public void Serving()
    {
        if (this.menucard!=null)
        {
            this.menucard.getItems(1,"Biriyani");
        }
    }
}
