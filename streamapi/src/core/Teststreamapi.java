package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.list;

public class Teststreamapi {

    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(2,3,4,5,6);

        System.out.println(list.subList(1,5));
                        list.stream()
                        .filter(n->n%2==0)
                        .map(n->n*2)
                        .forEach(System.out::println);
    }
}
