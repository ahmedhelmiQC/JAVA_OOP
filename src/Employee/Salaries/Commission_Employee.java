package Employee.Salaries;

public class Commission_Employee extends Employee implements Displayble{
    private double gross_sales;
    private double commission_rate;

    public Commission_Employee() {

    }
       public Commission_Employee(String name, String address, int ssn, Gender sex, double gross_sales, double commission_rate) {
        super(name, address, ssn, sex);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }

    public double getGross_sales() {
        return gross_sales;
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }

    @Override
    public String toString() {
        return "Commission_Employee{" + "gross_sales=" + gross_sales + ", commission_rate=" + commission_rate + '}';
    }

    @Override
    public void Displayalldetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public void Displayearnings() {
        System.out.println(earnings());
    }
    @Override
    public double earnings() {
        return gross_sales * commission_rate;
    }
}
