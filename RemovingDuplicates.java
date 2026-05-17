package com.hem.dsa;

public class RemovingDuplicates {

        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 4, 4, 5};
            int n = arr.length;//checksss lengt of array

            for (int k = 0; k < n; k++) {
                int count = 0;

                for (int j = 0; j < k; j++) {
                    if (arr[k] == arr[j]) {
                        count = 1;
                        break;
                    }
                }

                if (count == 0) {
                    System.out.print(arr[k] + " ");
                }
            }
        }
    }

