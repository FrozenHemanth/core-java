package com.xworkz.interfaces.usage;

import com.xworkz.interfaces.inner.Bluetooth;

public class Music {
    private Bluetooth bluetooth;

    public Music(Bluetooth bluetooth)
    {
        this.bluetooth=bluetooth;
    }

    public void playMusic()
    {
        System.out.println("Playmusic executing in Music");
        if (this.bluetooth!=null)
        {
            this.bluetooth.connect();
            this.bluetooth.discunnect();
        }
    }

}
