import java.util.Arrays;

public class Main {

    private static Employee[] catalog = new Employee[10];

    public static void main(String[] args) {

        Employee c1 = new Employee(1, 25000, "Ivanov", "Ivan", "Ivanovish");
        Employee c2 = new Employee(4, 36000, "Petrov", "Petr", "Perovich");
        Employee c3 = new Employee(5, 52000, "Sidorov", "Evgeniy", "Nazarovich");
        Employee c4 = new Employee(2, 33000, "Avdeev", "Arsen", "Denisovich");
        Employee c5 = new Employee(3, 42000, "Primakov", "Robert", "Ildarovich");
        Employee c6 = new Employee(5, 81000, "Lisenkov", "Anton", "Vladimirovich");
        Employee c7 = new Employee(1, 56000, "Nazarov", "Egor", "Urievich");
        Employee c8 = new Employee(3, 41000, "Molodtsov", "Michail", "Antonovich");
        Employee c9 = new Employee(4, 55000, "Nicolaev", "Nikolai", "Artemovich");
        Employee c10 = new Employee(2, 63000, "Krutoi", "Vladislav", "Savelievich");
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
        Employee[] emp = Arrays.copyOf(catalog, 11);
        Arrays.stream(catalog).forEach(System.out::println);
        System.out.println("cat.length = " + emp.length);
        System.out.println("calculatTotalSalary() = " + calculatTotalSalary());
        System.out.println("maxSalaryOfEmployee() = " + maxSalaryOfEmployee());
        System.out.println("minSalaryOfEmployee() = " + minSalaryOfEmployee());
        System.out.println("calculateAverageSalary() = " + calculateAverageSalary());


    }

    public static void printEmployees() {
        for (Employee employee : catalog) {
            System.out.println("catalog = " + catalog);

        }
    }
    public static int calculatTotalSalary(){
        int sum = 0;
        for (Employee employee: catalog) {
            sum+= employee.getSalary();
        }
        return sum;
    }
    public static Employee maxSalaryOfEmployee(){
        Employee result = catalog[0];
        int maxSalary = catalog[0].getSalary();
        for(Employee employee: catalog){
            if(employee.getSalary() > maxSalary){
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;

    }
    public static Employee minSalaryOfEmployee(){
        Employee result = catalog[0];
        int minSalary = catalog[0].getSalary();
        for(Employee employee: catalog){
            if(employee.getSalary() < minSalary){
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;

    }
    public static float calculateAverageSalary(){
        return calculatTotalSalary()/(float) catalog.length;
    }
    public static void printName(){
        for(Employee employee : catalog) {
            System.out.println("employee.getSurname() = " + employee.getSurname());
        }
    }
}


