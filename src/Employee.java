public class Employee{
    public double totalSalary;
    public double fixedSalary;
    public String surname, name;
    public EmployeePosition employeePosition;
    Employee(double fixedSalary ,EmployeePosition employeePosition){
        this.employeePosition = employeePosition;
        this.fixedSalary = fixedSalary;
        this.totalSalary = employeePosition.calcSalary(fixedSalary);
    }

    @Override
    public String toString() {
        return "Post: " + employeePosition.getJobTitle() + " salary: " + this.totalSalary;
    }
}