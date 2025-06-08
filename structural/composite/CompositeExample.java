import java.util.ArrayList;
import java.util.List;

interface Employee {
    void showDetails();
}

class Developer implements Employee {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Developer: " + name);
    }
}

class Manager implements Employee {
    private List<Employee> employees = new ArrayList<>();

    public void add(Employee e) {
        employees.add(e);
    }

    public void showDetails() {
        for (Employee e : employees) {
            e.showDetails();
        }
    }
}
