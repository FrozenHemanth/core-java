package com.xworkz.interfaces.Runner;

import com.xworkz.interfaces.DmartSupermarket;
import com.xworkz.interfaces.Supermarket;
import com.xworkz.interfaces.inner.*;
import com.xworkz.interfaces.usage.Kitchen;
import com.xworkz.interfaces.usage.Music;
import com.xworkz.interfaces.usage.Producer;
import com.xworkz.interfaces.usage.User;

public class AllRunner {
    public static void main(String[] args) {

        Supermarket supermarket=new LuluSuperMarket();
        Producer producer=new Producer(supermarket);
        producer.bill();

        Bluetooth bluetooth=new BoatBluetooth() ;
        Music music=new Music(bluetooth);
        music.playMusic();


        Remote remote=new LenovoRemote();
        User user=new User(remote);
        user.operatingTV();

        Menucard menucard=new AppMenucard();
        Kitchen kitchen=new Kitchen(menucard);
        kitchen.Serving();




    }
}
