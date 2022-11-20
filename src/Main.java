import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);


        Passport popova = new Passport(23851111, "Попова", "Анастасия", "Сергеевна",
                LocalDate.of(1996, 2, 14));
        System.out.println(popova);

    }
}