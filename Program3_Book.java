import java.util.*;

class Book{
	String name,author;
	int price,num_pages;

	Book(){
		name="";
		author="";
		price=0;
		num_pages=0;
	}

	void setnget(String n, String a, int p, int nop){
		name=n;
		author=a;
		price=p;
		num_pages=nop;
	}

	public String toString(){ 
		String s="";
		s+="Name: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nNo. of pages: "+num_pages;
		return s;
	}
}


class BookInfo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of books: ");
		int num=sc.nextInt();

		Book b[]=new Book[num];
	
 		for(int i=0;i<num;i++){
        	b[i]=new Book();
        }

		for(int i=0;i<num;i++)
        {
			System.out.println();
            System.out.println("Book "+(i+1));
            sc.nextLine();
            System.out.print("Enter the name of the Book: ");
            String n=sc.nextLine();
            System.out.print("Enter the name of the Author: ");
            String a=sc.nextLine();
            System.out.print("Enter the price of the Book: ");
            int p=sc.nextInt();
            System.out.print("Enter number of pages there in the Book: ");
            int nop=sc.nextInt();
             
            b[i].setnget(n,a,p,nop);
        }

        for(int i=0;i<num;i++)
        {
			System.out.println();
            System.out.println("Details of book :"+(i+1));
      		System.out.println(b[i]);
        }
	}
}
