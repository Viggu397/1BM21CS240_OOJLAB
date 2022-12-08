import java.util.Scanner;

class Employee{
    Scanner s=new Scanner(System.in);
    String empid, empname;
    double empnohrs, empbasic, emphra, empda, empit, empgross;

    void EMPdata(){
        System.out.println("Enter Employee Details");
        System.out.print("NAME : ");
        empname=s.nextLine();
        System.out.print("EMPLOYEE ID : ");
        empid=s.nextLine();
        System.out.print("No of Working hours : ");
        empnohrs=s.nextDouble();
        System.out.print("Bsic Slary : ");
        empbasic=s.nextDouble();
        System.out.print("House Rental Allowance % : ");
        emphra=s.nextDouble();
        System.out.print("Daily Allowance % : ");
        empda=s.nextDouble();
        System.out.print("TAX % : ");
        empit=s.nextDouble();
   }

   void calcGSal(){
    if(empnohrs<200){
        empgross=empbasic + empbasic*(emphra/100) + empbasic*(empda/100) - empbasic*(empit/100) - 100*empnohrs;
    } else {
        empgross=empbasic + empbasic*(emphra/100) + empbasic*(empda/100) - empbasic*(empit/100) + 100*empnohrs;
    }
    System.out.print("\nGross Salary of the Employee : "+empgross);
   }
}

class main{
    public static void main(String[] args) {
        Employee E=new Employee();
        E.EMPdata();
        E.calcGSal();
    }
}