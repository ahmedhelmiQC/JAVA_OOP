package Constructor;

public class Employee {
    int emp_id ;
    String ename ;
    String depart;
    double salary;
    double bounce;
    boolean resident;
    public Employee(){
        emp_id = 100;
        ename = " mohamed";
        depart = " no yet";
        salary = 5000;
        bounce = 100;
        resident = false;
    }
    public Employee(int idNo, String na){
        emp_id = idNo;
        ename = na;
    }
    public Employee (int idNo, String na ,boolean r ){
        this (idNo , na);
        resident = r;
    }
    public Employee (int idNo, String na ,boolean r , double sa ,double bon , String dep ){
        this (idNo , na , r);
        salary = sa;
        bounce = bon;
        depart = "dep";

    }
    public void print_emp_data(){
        System.out.println("ID" +" " + emp_id);
        System.out.println(" Name" +" " + ename);
        System.out.println("Department" +" " + depart);
        System.out.println("Salary" +" " + salary);
        System.out.println("Bonus" +" " + bounce);
        System.out.println("Resident" +" " + resident);
    }



  }
