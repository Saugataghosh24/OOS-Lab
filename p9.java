class Employee {
     String name;
     int id;
     String address;
     double salary;

    Employee(String name, int id, String address, double salary) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.salary = salary;
    }

}

class Dept {
     String name;
     String location;
     Employee employees[];
     int empno;

    Dept(String name, String location) {
        this.name = name;
        this.location = location;
        employees = new Employee[50];
        empno= 0;
    }

    void add(Employee employee) {
        employees[empno]= employee;
        empno++;
    }

    void remove(Employee employee) {
        int index = -1;
        for (int i = 0; i < empno; i++) {
            if (employees[i] == employee) {
                index = i;
                break;
            }
        }
       
        for (int i = index; i < empno - 1; i++) {
            employees[i] = employees[i + 1];
            }
            empno--;
    }

    double getYearlyExpenditure() {
        double expenditure = 0;
        for (int i=0; i<empno; i++) {
            expenditure += employees[i].salary * 12;
        }
        return expenditure;
    }

    public static void main(String[] args) {
        Dept itDept = new Dept("Information Technology", "Salt Lake");

        Employee employee1 = new Employee("Parama Bhaumik", 1001, "123 Main St.", 90000);
        Employee employee2 = new Employee("Rohini Basak", 1002, "456 Elm St.", 75000);
        Employee employee3 = new Employee("Tohida Rehman", 1003, "789 Oak St.", 70000);
        Employee employee4 = new Employee("Bhaskar Sardar", 1004, "321 Maple St.", 80000);
        Employee employee5 = new Employee("Palash Kundu", 1005, "654 Pine St.", 80000);

        itDept.add(employee1);
        itDept.add(employee2);
        itDept.add(employee3);
        itDept.add(employee4);
        itDept.add(employee5);

        double yearlyExpenditure = itDept.getYearlyExpenditure();

        System.out.println("Information Technology Department's Yearly Expenditure is: Rs" + yearlyExpenditure);
    }
}
