package com.frozen.practicelambdaexp.Runner;

import com.frozen.practicelambdaexp.core.Towel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = (int price, boolean isCotton) -> {
            if (isCotton) {
                System.out.println("cotton");

            } else {
                System.out.println("not cotton");
            }

            System.out.println("ptice =" + price);

        };
        towel.useTowel(3000, true);


    }}


