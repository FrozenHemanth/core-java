package Runner;

import dto.WarDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WarDTORunner {
    public static void main(String[] args) {

       List<WarDTO> wars = new ArrayList<>();
       wars.add(new WarDTO("world war 2", LocalDate.of(1939, 9, 1), LocalDate.of(1945, 9, 2), "Europe", List.of("Germany", "Soviet Union", "United Kingdom", "United States"), 1000000, "Germany surrendered", 732, "Adolf Hitler", "Axis powers invaded Soviet Union"));
       wars.add(new WarDTO("world war 1", LocalDate.of(1914, 7, 28), LocalDate.of(1918, 11, 11), "Europe", List.of("Germany", "France", "Britain", "Italy", "Austria-Hungary", "Russia", "United States"), 9000000, "Germany surrendered", 4000, "Wilhelm II", "German invasion of Belgium"));
       wars.add(new WarDTO("american revolution", LocalDate.of(1775, 4, 19), LocalDate.of(1783, 9, 3), "North America", List.of("United States"), 100000, "British surrender", 5, "George Washington", "British attempt to tax Americans"));
       wars.add(new WarDTO("indonesia independence war", LocalDate.of(1945, 8, 17), LocalDate.of(1949, 12, 17), "Southeast Asia", List.of("Indonesia", "Netherlands"), 100000, "Indonesia declared independence", 5, "Sukarno", "Dutch invasion of Indonesia"));
       wars.add(new WarDTO("yemen civil war", LocalDate.of(1994, 1, 1), LocalDate.of(2002, 12, 22), "Middle East", List.of("South Yemen", "North Yemen"), 100000, "North Yemen forces surrendered", 10, "Ali Abdullah Saleh", "Civil war in Yemen"));
       wars.add(new WarDTO("anglo-sikh wars", LocalDate.of(1845, 10, 16), LocalDate.of(1849, 11, 3), "India", List.of("Britain", "Sikh Empire"), 300000, "British defeated Sikh Empire", 5000, "Duleep Singh", "Sikh rebellion against British rule"));
       wars.add(new WarDTO("first anglo-indian war", LocalDate.of(1856, 11, 10), LocalDate.of(1858, 2, 21), "India", List.of("Britain", "India"), 100000, "Britain defeated India", 5000, "Lord Canning", "Indian rebellion against British rule"));
       wars.add(new WarDTO("kargil war", LocalDate.of(1999, 6, 1), LocalDate.of(1999, 8, 14), "India", List.of("India", "Pakistan"), 100000, "Indian forces withdrew", 1000, "Pakistan", "Indian military operation in Kargil"));
   wars.stream()
           .filter(war->war
                   .getWarName().startsWith("w"))
           .forEach(System.out::println);
        System.out.println("---------------");
   wars.stream()
           .filter(war->war
                   .getLocation().equals("India"))
           .forEach(System.out::println);
        System.out.println("-----------------");
   wars.stream()
           .filter(war->war
                   .getCommander().contains("Lord Canning"))
           .forEach(System.out::println);

        System.out.println("-------filtering by date --------");
        wars.stream()
                .filter(war -> war.getStartDate().isAfter(LocalDate.of(1900, 1, 1)))
                .forEach(System.out::println);
        System.out.println("---------------");
        wars.stream()
                .filter(war -> war.getEndDate().isBefore(LocalDate.of(1800, 1, 1)))
                .forEach(System.out::println);
        System.out.println("-------filter by casualties--------");
        wars.stream()
                .filter(war -> war.getCasualties() > 100000)
                .forEach(System.out::println);
        System.out.println("---------------");
        wars.stream()
                .filter(war -> war.getCasualties() < 10000)
                .forEach(System.out::println);
        System.out.println("---------------");
        wars.stream()
                .filter(war -> war.getCasualties() >= 50000 && war.getCasualties() <= 500000)
                .forEach(System.out::println);
        System.out.println("-------filter by duration means dayss of war--------");
        wars.stream()
                .filter(war -> war.getDurationDays() % 7 == 0)
                .forEach(System.out::println);
        System.out.println("-------countries involved--------");
        wars.stream()
                .filter(war -> war.getCountriesInvolved().contains("India"))
                .forEach(System.out::println);
        System.out.println("-------filter by size--------");
        wars.stream()
                .filter(war -> war.getCountriesInvolved().size() > 3)
                .forEach(System.out::println);



    }

}
