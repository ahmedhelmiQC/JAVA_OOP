package Employee.Salaries;

public class Main {
    public static void main(String[] args) {


        Department d1 = new Department(1 , "Information Systems");
    SalariedEmployee se = new SalariedEmployee("ahmed","cairo",100 , Gender.male,10000,3000,4000);
    d1.add_employee(se);

    HourlyEmployee h = new HourlyEmployee("mohamed","giza",150,Gender.male,10,500);
    d1.add_employee(h);

    Commission_Employee co = new Commission_Employee("ali", "quisna",200,Gender.male,9000,4000);
    d1.add_employee(co);

    BasePlusCommission_Employee ba = new BasePlusCommission_Employee("assma","banha",300,Gender.female,8000,4000,100);
    d1.add_employee(ba);

        System.out.println(d1.getemployeecount());
        d1.print_basic_data();
        d1.print_All_details();
    }
}
