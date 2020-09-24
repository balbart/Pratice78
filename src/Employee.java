interface EmployeePosition{
    String getJobTitle();
    double calcSalary(double baseSalary);
}


public class Employee implements EmployeePosition {
    private String  name;
    private String surname;
    private double baseSalary;
    private String position;

    @Override
    public String getJobTitle() {
        return null;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return 0;
    }
}

