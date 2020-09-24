public class Manager implements EmployeePosition {
    String position;

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return 0;
    }
}
