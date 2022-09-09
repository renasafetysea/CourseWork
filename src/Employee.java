public class Employee {
int department;
int salary;

String surname;
String name;
String patronymic;

private static int count = 1;
private  int id = count++;

  public void Employee(int department, int salary, String surname,String name,String patronymic) {
        this.department = department;
        this.salary = salary;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        count++;

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

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
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

