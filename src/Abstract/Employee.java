package Abstract;

public abstract class Employee {
    String name;
    double age;
    double salary;
    String rank;
    String job;

    public Employee() {
    }
    public Employee (String n , double a, double sal, String ra, String jo){
        name = n;
        age = a;
        salary = sal;
        rank = ra;
        job = jo;
    }
    public void set_Salary(double s) {
        salary = s;
    }

    public void setName(String name) {
        this.name = name;
    }

      public void setRank(String rank) {
        this.rank = rank;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public abstract double get_Salary() ;



}
