import java.util.Scanner;
import java.lang.Math;

class Quadratic {
public static void main(String args[]){
Scanner s=new Scanner(System.in);

System.out.println("Enter the values of a, b and c");
double a= s.nextInt();
double b= s.nextInt();
double c= s.nextInt();

//Discriminant is D

double D=b*b-4*a*c;

double root1,root2;

if(D>0){
System.out.println("Roots are real and Unique");
root1= -b+Math.sqrt(D)/(2*a);
root2= -b-Math.sqrt(D)/(2*a);
System.out.println("Root1= "+root1+" AND "+"Root2= "+root2);
}

else if(D==0){
System.out.println("Roots are real and equal");
root1=root2=-b/(2*a);
System.out.println("Root1=Root2= "+root1);
}

else{
System.out.println("There are no real solutions");
double realpart=-b/(2*a);
double imagpart=Math.sqrt(-D)/(2*a);
System.out.println("Root1= "+realpart+" + "+imagpart+"i"+" AND "+"Root2= "+realpart+" - "+imagpart+"i");
}
}
}


