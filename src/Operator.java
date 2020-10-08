public class Operator implements EmployeePosition{
    double income;
    Operator(double income){
        this.income = income;
    }


    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double fixedSalary) {
        return fixedSalary;
    }
}