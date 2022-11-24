import java.util.Scanner;

class Student {

	void Display(String name, String USN){
		System.out.println("NAME :"+name);
		System.out.println("USN: "+USN);
	}

	void CalcSGPA(int marks[], int credits[]){
	double SGPA=0, grade=0, totalcred=0;
	int i;

	for(i=0;i<5;i++){
		totalcred=totalcred+credits[i];
	}


	for(i=0;i<5;i++){

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
		System.out.println("SGPA is "+SGPA);
	}
}


class SGPA{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);

		System.out.println("Enter name of the student");
		String name=s.nextLine();
		System.out.println("Enter USN");
		String USN=s.nextLine();

		Student st= new Student();

		int marks[]=new int[5];
		int credits[] = new int[5];

		for(int i=0;i<5;i++){
			System.out.println("Enter the credits of subject "+(i+1));
			credits[i]=s.nextInt();
		}

		System.out.println("Enter the marks");

		for(int i=0;i<5;i++){
			System.out.println("subject "+(i+1));
			marks[i]=s.nextInt();
		}

		st.Display(name,USN);
		st.CalcSGPA(marks,credits);
	}
}


