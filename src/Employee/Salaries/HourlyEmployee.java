package Employee.Salaries;

public class HourlyEmployee extends Employee implements Displayble{

    private int no_of_hours;
    private double hour_rate;

    public int getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
    }

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public HourlyEmployee() {
    }
    public HourlyEmployee(String name, String address, int ssn, Gender sex, int hour, double rate) {
        super(name, address, ssn, sex);
        this.no_of_hours = hour;
        this.hour_rate = rate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "hour=" + no_of_hours + ", rate=" + hour_rate + '}';
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
        return no_of_hours* hour_rate;
    }
}
