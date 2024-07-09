package Employee.Salaries;

public class BasePlusCommission_Employee extends Commission_Employee {
    private double base ;

    public BasePlusCommission_Employee() {
    }
    public BasePlusCommission_Employee(String name, String address, int ssn, Gender sex, double gross_sales, double commission_rate, double base) {
        super(name, address, ssn, sex, gross_sales, commission_rate);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "BasePlusCommission_Employee{" + "base=" + base + '}';
    }

    @Override
    public void Displayalldetails() {
     super.Displayalldetails();
     Displayearnings();
    }

    @Override
    public void Displayearnings() {
        System.out.println("Earnings = " + earnings());
    }

    @Override
    public double earnings() {
        return base + super.earnings();
    }
}
