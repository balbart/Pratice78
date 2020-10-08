public class Manager implements EmployeePosition{
    double income;
    Manager(double income){
        this.income = income;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double fixedSalary) {
        double bonus = (115e3+(long)(Math.random()*1e6%25e3))*0.05;
        return bonus+fixedSalary;
    }
}