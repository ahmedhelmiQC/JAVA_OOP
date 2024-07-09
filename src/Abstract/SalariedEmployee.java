package Abstract;

public class SalariedEmployee extends Employee{
    double bonus;
    double deduction;

    public SalariedEmployee()
    {

    }

    public SalariedEmployee(String n, double a, double sal, String ra, String jo, double bonus, double deduction) {
        super(n, a, sal, ra, jo);
        this.bonus = bonus;
        this.deduction = deduction;
    }
    @Override
    public double get_Salary(){
        return salary + bonus - deduction;
    }

}
