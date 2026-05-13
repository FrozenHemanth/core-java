package com.xworkz.interfaces.usage;

import com.xworkz.interfaces.inner.Remote;

public class User {
    private Remote remote;
    public User(Remote remote)
    {
        this.remote=remote;

    }
    public void operatingTV(){
        if(this.remote!=null){
            this.remote.turnOn();
            this.remote.turnOff();
            System.out.println("operating TV by user ");
        }
    }

}
