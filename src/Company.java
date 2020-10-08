import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company{
    public List<Employee> staff = new ArrayList<Employee>();
    double income;

    Company(){
        this.income = 7e6 + (long)(Math.random()*1e7/2);
    }

    public List<Employee> getTopSalaryStaff(int count){
        List<Employee> staff = this.staff;
        List<Employee> total = null;
        for (int i = 0; i < staff.size()-1; i++) {
            for(int j = i+1; j < staff.size(); j++){
                if(staff.get(j).totalSalary > staff.get(i).totalSalary){
                    Collections.swap(staff, i ,j);
                }
            }
        }
        total = staff.subList(0, count-1);
        return total;
    }

    public List<Employee> getLowestSalaryStaff(int count){
        List<Employee> buff = this.staff;
        List<Employee> total = null;
        for (int i = 0; i < buff.size()-1; i++) {
            for(int j = i+1; j < buff.size(); j++){
                if(buff.get(j).totalSalary < buff.get(i).totalSalary){
                    Collections.swap(buff, i ,j);
                }
            }
        }
        total = buff.subList(0, count-1);
        return total;
    }

    public void hire(Employee a){
        this.staff.add(a);
    }

    public void hireAll(int operatorAmount, int managerAmount, int topManagerAmount){
        for (int i = 0; i < operatorAmount; i++) {
            double randSalary = 4e4+(long)(Math.random()*1e5%2e4);
            Operator operator = new Operator(this.income);
            Employee employee = new Employee(randSalary, operator);
            this.staff.add(employee);
        }
        for (int i = 0; i < managerAmount; i++) {
            double randSalary = 6e4+(long)(Math.random()*1e5%2e4);
            this.staff.add(new Employee(randSalary, new Manager(this.income)));
        }
        for (int i = 0; i < topManagerAmount; i++) {
            double randSalary = 8e4+(long)(Math.random()*1e5%4e4);
            this.staff.add(new Employee(randSalary, new TopManager(this.income)));
        }
    }

    public void fire(double percent){
        int amount = (int)(this.staff.size()/100*percent);
        for (int i = 0; i < amount; i++) {
            int index = (int)(Math.random()*1000%this.staff.size());
            this.staff.remove(index);
        }
    }

    public double getIncome(){
        return this.income;
    }

}