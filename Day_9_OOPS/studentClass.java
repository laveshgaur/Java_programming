import java.util.*;
class student{
    String name;
    int roll,m1,m2,m3;
    void displayDetails(){
        System.out.println("Name is "+name+"\nRoll no. "+roll+"\nMarks are "+m1+" "+m2+" "+m3);
    }
    int total(){
        return m1+m2+m3;
    }
    double avg(){
        return (m1+m2+m3)/3;
    }
}
class studentClass{
    public static void main(String args[]){
        student s = new student();
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter student name : ");
        s.name = sc.nextLine();
        System.out.print("Enter roll and 3 subject marks : ");
        s.roll = sc.nextInt();
        s.m1 = sc.nextInt();
        s.m2 = sc.nextInt();
        s.m3 = sc.nextInt();
        s.displayDetails();
        System.out.println("Total marks : "+s.total());
        System.out.println("Average marks : "+s.avg());
    }
}