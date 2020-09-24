import java.util.List;

public class Company {
    List<Employee> workers;
    double income;
    void hire(Employee worker){
        this.workers.add(worker);
    }

    void hireAll(List<Employee> workers){
        this.workers.addAll(workers);
    }

    void fire(Employee worker){
        this.workers.remove(worker);
    }

    double getIncome(){
        return this.income;
    }

    List<Employee> getTopSalaryStaff(int count){
        List<Employee> copy = this.workers;
        List<Employee> topList = null;
        for(int i = 0; i < copy.size()-1; i++){
            Employee one = copy.get(i);
            for(int j = i+1; j < copy.size();j++){
                Employee two = copy.get(j);
              /*  if(two.calcSalary() > one.calcSalary()){
                    Employee buff = two;
                    two = one;
                    one = buff;
                }*/
            }
        }
        return topList;
    }
}
