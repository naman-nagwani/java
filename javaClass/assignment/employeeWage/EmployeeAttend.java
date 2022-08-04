package javaClass.assignment.employeeWage;

public class EmployeeAttend {

    static int wage=20;
    static int fullDay=8;
    static int halfDay=8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int x = (int) Math.round(Math.random());
        int monthlyWage;
        if (x==1) {
            System.out.println("Employee is Present");
            System.out.println("Employee's Wage is "+(wage*fullDay));
            System.out.println("Employee's Wage is "+(wage*halfDay));
            System.out.println("Employee's Wage is "+(wage*fullDay*20));
        }
        else
            System.out.println("Employee is Absent");

        switch (x){
            case 1:
                System.out.println("Employee is Present");
                System.out.println("Employee's Wage is "+(wage*fullDay));
                System.out.println("Employee's Wage is "+(wage*halfDay));
                System.out.println("Employee's Wage is "+(wage*fullDay*20));
                break;
            default :
                System.out.println("Employee is Absent");
                break;
        }


    }
}
