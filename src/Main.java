import cz.engeto.ja.Computer;
import cz.engeto.ja.Computer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    ////ú//

    ///////
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        Computer computer1 = new Computer("Dell", 2019, BigDecimal.valueOf(15000));
        Computer computer2 = new Computer("HP", 2018, BigDecimal.valueOf(12000));
        Computer computerx = new Computer("Lenovo", 2017, BigDecimal.valueOf(18000));
        Computer computery = new Computer("Lenovo", 2017, BigDecimal.valueOf(18000));
        Computer computer3 = new Computer("Lenovo", 2017, BigDecimal.valueOf(18000));

        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);

        for (Computer computer : computers) {
            System.out.println(computer.getDescription() + "   " + computer.getYearOfProduction() + "  " + computer.getPrice());

        }
        Collections.sort(computers, Comparator.comparing(Computer::getYearOfProduction));

        System.out.println("Sorted by year: ");
        computers.forEach(System.out::println);

        System.out.println("Sorted:");
        for (Computer computer : computers) {
            System.out.println(computer);

            Collections.sort(computers);
            System.out.println("Sorted by description");
        }
        }
}