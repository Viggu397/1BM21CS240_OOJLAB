import java.util.Scanner;

class Student {

	String name,USN;
	int marks[] = new int[10];
	int credits[] = new int[10];
	double SGPA=0;
	int n;

	Scanner s=new Scanner(System.in);

	void Input(){
		System.out.println();
		System.out.print("Enter name of the student: ");
		name=s.nextLine();
		System.out.print("Enter USN: ");
		USN=s.nextLine();
		System.out.print("Enter the number of courses: ");
		n=s.nextInt();
		
		for(int i=0;i<n;i++){
			System.out.println();
			System.out.println("Enter the credits of subject "+(i+1));
			credits[i]=s.nextInt();
			System.out.println("Enter the marks of subject "+(i+1));
			marks[i]=s.nextInt();
		}

	}

	void Display(){
		System.out.println();
		System.out.println("NAME :"+name);
		System.out.println("USN: "+USN);
		System.out.println("SGPA is "+SGPA);
	}

	void CalcSGPA(){
		double grade=0, totalcred=0;
		int i;

	for(i=0;i<n;i++){
		totalcred=totalcred+credits[i];
		}


	for(i=0;i<n;i++){

		if(marks[i]>=90)
		{
			grade+=credits[i]*10;
		}
		else if(marks[i]>=80)
		{
			grade+=credits[i]*9;
		}
		else if(marks[i]>=70)
		{
			grade+=credits[i]*8;
		}
		else if(marks[i]>=60)
		{
			grade+=credits[i]*7;
		}
		else if(marks[i]>=50)
		{
			grade+=credits[i]*6;
		}
		else if(marks[i]>=40)
		{
			grade+=credits[i]*5;
		}
		else{
			grade=0;
		}
	}

	SGPA=grade/totalcred;
	}
}


class SGPA{
	public static void main(String args[]){

		Student st= new Student();

		st.Input();
		st.CalcSGPA();
		st.Display();
	}
}


