package Employee.Salaries;

public class SalariedEmployee extends Employee implements Displayble{

   double salary;
    double bouns;
    double deducations;

    public SalariedEmployee(String name, String address, int ssn, Gender sex, double salary, double bouns, double deducations) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bouns = bouns;
        this.deducations = deducations;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDeducations() {
        return deducations;
    }

    public void setDeducations(double deducations) {
        this.deducations = deducations;
    }

    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + ", bouns=" + bouns + ", deducations=" + deducations + '}';
    }
    @Override
    public void Displayalldetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public double earnings() {
        return (salary + bouns)- deducations;
    }
    @Override
    public void Displayearnings() {
        System.out.println(earnings());
    }

}
