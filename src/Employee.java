public class Employee {
private int department;
private int salary;

private String surname;
private String name;
private String patronymic;

private static int counter = 0;
private Integer id ;

  public Employee(int department, int salary, String surname,String name,String patronymic) {
        this.department = department;
        this.salary = salary;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.id = counter++;

    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Integer getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "department " + department +
                ", salary " + salary +
                ", surname " + surname + '\'' +
                ", name " + name + '\'' +
                ", patronymic " + patronymic + '\'' +
                ", id " + id;



        }
        }

