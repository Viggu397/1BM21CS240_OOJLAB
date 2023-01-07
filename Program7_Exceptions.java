import java.util.*;

class Father extends Exception {
    int Father_age;

    Father(int Father_age) {
        this.Father_age = Father_age;
    }

    public String toString() {
        return "Age must be a positive integer";
    }
}

class Son extends Father {
    int Son_age;

    Son(int Father_age, int Son_age) {
        super(Father_age);
        this.Son_age = Son_age;
    }

    public String toString() {
        return "Son's age must be less than father's age";
    }
}

class myException {
    static void WrongAge(int Father_age, int Son_age) throws Son, Father {
        if (Father_age <= 0 || Son_age <= 0)
            throw new Father(Father_age);
        else if (Son_age >= Father_age)
            throw new Son(Father_age, Son_age);
    }

    static void WrongAge(int age) throws Father {
        if (age <= 0)
            throw new Father(age);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter father age");
            int F_age = sc.nextInt();
            WrongAge(F_age);
            System.out.println("Enter son age");
            int S_age = sc.nextInt();
            WrongAge(S_age); WrongAge(F_age, S_age);
            System.out.println("No Errors\n" + "Son's Age:" + S_age + "\n" + "Father's Age:" + F_age);
        } catch (Son s) {
            System.out.println("\nError!!!: " + s);
        } catch (Father f) {
            System.out.println("\nError!!!: " + f);
        }

    }
}