import java.util.Arrays;

public class Loader {
    public static void main(String[] args) {
        Company company = new Company();
        company.hireAll(180, 80, 10);
        System.out.println(Arrays.toString(company.getTopSalaryStaff(10).toArray()));
        System.out.println(Arrays.toString(company.getLowestSalaryStaff(30).toArray()));
        company.fire(50);
        System.out.println("delete 50% of employers");
        System.out.println(Arrays.toString(company.getTopSalaryStaff(15).toArray()));
        System.out.println(Arrays.toString(company.getLowestSalaryStaff(30).toArray()));

    }
}
