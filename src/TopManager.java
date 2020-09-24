public class TopManager implements EmployeePosition {
    String position;
    double baseSalary;

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return 0;
    }
}
