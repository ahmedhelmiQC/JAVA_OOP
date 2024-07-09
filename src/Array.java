import java.util.Scanner;

public class Array {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /*  Scanner inputs = new Scanner(System.in);
        double s1,s2;
        System.out.println("Enter 1st slary");
        s1 = inputs.nextDouble();
        System.out.println("Enter 2st slary");
        s2 = inputs.nextDouble();
        s1 = s1 + (s1*0.10);
        s2 = s2 + (s2*0.10);
        System.out.println(s1);
        System.out.println(s2);
         */


        //// Array////
        /*
        // double [] sales = { 12.5 , 45.9 , 90.5 , 60.3};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size Off Array");
        int size;
        size = input.nextInt();
        double [] salaries = new double[size];
        for (int i=0 ; i<salaries.length ; i++){
            System.out.println("Enter Salary For Employee No" + (i+1));
            salaries [i] = input.nextDouble();
        }
        double sum =0;
        for (int i=0 ; i<salaries.length; i++){
            sum += salaries[i];
        }
        System.out.println(" the sum of the salaries is " + sum);
        System.out.println("the average of salaries is " + sum/salaries.length);

         */
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size;
        size = input.nextInt();
        int[] numbers = new int[size];
        for (int i =0 ; i<numbers.length ; i++){
            System.out.println("enter No" + (i+1));
            numbers[i] = input.nextInt();
        }
            int sum = 0 , count = 0;
            for (int i=0; i< numbers.length ; i++){
              if (numbers[i]>0)
                sum += numbers[i];
                count++;
            }

            System.out.println("the sum of Numbers is "+ sum);
            System.out.println("the average of positive numbers is "+ (sum/count));
       */
        System.out.println("Enter Size Off Array");
        int size , searchedid;
        size = input.nextInt();
        int[] ids = new int[size];
             fillarray(ids);
             printarray(ids);
        System.out.println("enter the id to search for");
        searchedid = input.nextInt();
        int returnedindex = search(ids,searchedid);

        if (returnedindex >=0)
            System.out.println("the item is found");
        else
            System.out.println("the item not found");

    }

    public static void fillarray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter No " + (i + 1));
            list[i] = input.nextInt();
        }
    }

    public static void printarray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static int search(int[] list, int target) {
        for (int i = 0; i < list.length; i++)
         if (list[i]==target)
           return i;
       return  -1;

    }
}
