// Interface company
interface Company {
    public abstract void work();
}

// Class Employee implements Company
public class Employee implements Company {
    // Private field for salary
    private double salary;

    // Constructor for Employee
    Employee() {
        System.out.println("Rahul is an employee.");
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary > 0) { // Validation to ensure salary is positive
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive. Salary update failed.");
        }
    }

    // Implementing work method
    @Override
    public void work() {
        System.out.println("Rahul is working.");
    }

    // Main method
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();

        // Set and get salary
        emp.setSalary(50000);
        System.out.println("Rahul's Salary: " + emp.getSalary());
    }
}
