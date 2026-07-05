package com.frozen.practicelambdaexp.Runner;

import com.frozen.practicelambdaexp.core.Camera;
import com.frozen.practicelambdaexp.core.Cameraimp;

public class CameraRunner {
    public static void main(String[] args) {

       Camera camera = (price, isWaterproof ) -> System.out.println("running  camera in runner");
       camera.useCamera(3000, false);

       Cameraimp cameraimp = new Cameraimp();
       cameraimp.useCamera(3000, false);


    }
}




