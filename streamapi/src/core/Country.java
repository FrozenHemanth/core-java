package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.list;
import static jdk.internal.org.jline.utils.Colors.s;

public class Country {

    public static void main(String[] args) {

        List<String> countrylist=Arrays.asList("india","pakistan","china","australia","canada","oman","czech republic");
        System.out.println(countrylist.getFirst());
        System.out.println(countrylist.getLast());
        System.out.println(countrylist.get(3));
        System.out.println(countrylist.get(1));
        System.out.println("------------------------------------");
        System.out.println("____________countries starting with i -------------");
        countrylist.stream() .filter(countries->countries.startsWith("i"))
                //.filter(countries->countries.endsWith("n"))
                .forEach(System.out::println);
        System.out.println("------countries ending with a--------");
        countrylist.stream()
                .filter(countries->countries.endsWith("a"))
                .forEach(System.out::println);

        System.out.println("--------countries name with two or more words--------");
        countrylist.stream().filter(countries->countries.split(" ").length>1)
                .forEach(System.out::println);
        System.out.println("--------countries name with more than 1 character--------");
        countrylist.stream()
                .filter(countries->countries.getBytes().length>10)

                .forEach(System.out::println);
        System.out.println("--------countries name with lengthh  is lesser than or equal to 5--------");
        countrylist.stream()
                .filter(countries->countries.getBytes().length<=5)
                .forEach(System.out::println);
        System.out.println("simply printing all countries below");
        countrylist.stream().forEach(System.out::println);

        System.out.println("//////////////task 1 completed/////////////");
        List<String> pincodecity = Arrays.asList(
                "Mumbai 400001",
                "Delhi 110001",
                "Bengaluru 22",
                "Hyderabad 500001",
                "Chennai 600001",
                "Kolkata 700001",
                "Ahmedabad 380001",
                "Surat 395001",
                "Pune 411001");
        System.out.println("list of 15 city pincode in india");
        pincodecity.forEach(System.out::println);


        System.out.println("cities with pincode range 0 to 500001");
        pincodecity.stream()
                .filter(city->Integer.parseInt(city.split(" ")[1])>=0
                && Integer.parseInt(city.split(" ")[1])<=500001)
                .forEach(System.out::println);

        System.out.println("cities with pincode range 500001 to 1000001");
        pincodecity.stream()
                .filter(city->Integer.parseInt(city.split(" ")[1])>=500001
                && Integer.parseInt(city.split(" ")[1])<=1000001)
                .forEach(System.out::println);
        System.out.println("cities with name larger than 6 charector");
        pincodecity.stream()
                .filter(city->city.split(" ")[0].length()>6)
                .forEach(System.out::println);

        System.out.println("cities with pincode containing digit '7'");
        pincodecity.stream()
                .filter(city->city.split(" ")[1].contains("7"))
                .forEach(System.out::println);


        System.out.println("cities with pincode containing even number");
        pincodecity.stream()

                .filter(city->Integer.parseInt(city.split(" ")[1])%2==0)
                .forEach(System.out::println);

        System.out.println("now citiess poncode ending with 001");
        pincodecity.stream()
                .filter(city->city.split(" ")[1].endsWith("001"))
                .forEach(System.out::println);

        System.out.println("now cities with name contains a ");
        pincodecity.stream()
                .filter(city->city.split(" ")[0].contains("a"))
                .forEach(System.out::println);
        System.out.println("\\\\\\\\\\\\\\\\Task 2 Completed\\\\\\\\\\\\");

}

}