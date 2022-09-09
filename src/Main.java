import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        Employee[] catalog = new Employee[10];

        Employee c1 = new Employee();
        c1.Employee(1, 25000, "Ivanov", "Ivan", "Ivanovish");
        Employee c2 = new Employee();
        c2.Employee(4, 36000, "Petrov", "Petr", "Perovich");
        Employee c3 = new Employee();
        c3.Employee(5, 52000, "Sidorov", "Evgeniy", "Nazarovich");
        Employee c4 = new Employee();
        c4.Employee(2, 33000, "Avdeev", "Arsen", "Denisovich");
        Employee c5 = new Employee();
        c5.Employee(3, 42000, "Primakov", "Robert", "Ildarovich");
        Employee c6 = new Employee();
        c6.Employee(5, 81000, "Lisenkov", "Anton", "Vladimirovich");
        Employee c7 = new Employee();
        c7.Employee(1, 56000, "Nazarov", "Egor", "Urievich");
        Employee c8 = new Employee();
        c8.Employee(3, 41000, "Molodtsov", "Michail", "Antonovich");
        Employee c9 = new Employee();
        c9.Employee(4, 55000, "Nicolaev", "Nikolai", "Artemovich");
        Employee c10 = new Employee();
        c10.Employee(2, 63000, "Krutoi", "Vladislav", "Savelievich");
        catalog[0] = c1;
        catalog[1] = c2;
        catalog[2] = c3;
        catalog[3] = c4;
        catalog[4] = c5;
        catalog[5] = c6;
        catalog[6] = c7;
        catalog[7] = c8;
        catalog[8] = c9;
        catalog[9] = c10;


        Arrays.stream(catalog).forEach(System.out::println);
        IntSummaryStatistics result = Arrays.stream(catalog).collect(Collectors.summarizingInt(Employee::getSalary));
        System.out.println(result.getSum());
        System.out.println(result.getMin());
        System.out.println(result.getMax());
        System.out.println(result.getAverage());





    }
    }