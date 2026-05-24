package com.xworkz.Arraydsa;

public class Search {

        public static void main(String[] args) {
            int[] arr = {5, 8, 12, 20, 25};
            int key = 12;
            int found = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    System.out.println("Found at index: " + i);
                    found = 1;
                }
            }

            if (found == 0) {
                System.out.println("Not found");
            }
        }
    }

