package Week5_31_07_2026;

import java.util.Arrays;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;

    public Employee(int id, String name, String department, double salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Program6_Filter_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
	            new Employee(1, "Rahul", "IT", 50000, 32),
	            new Employee(2, "Neha", "HR", 60000, 35),
	            new Employee(3, "Aman", "Finance", 70000, 40),
	            new Employee(4, "Priya", "IT", 45000, 28),
	            new Employee(5, "Rohit", "Sales", 55000, 25)
	        );

	        employees.stream()
	                 .filter(emp -> emp.getAge() > 30)
	                 .forEach(emp -> System.out.println(emp.getName() + " - " + emp.getAge()));
	}

}
