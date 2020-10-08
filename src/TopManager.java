public class TopManager implements EmployeePosition{
    double baseSalary;
    double income;
    TopManager(double income){
        this.income = income;
        baseSalary = Math.random();
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary(double fixedSalary){
        if(this.income > 1e7){
            return fixedSalary*2.5;
        }
        return fixedSalary;
    }
}