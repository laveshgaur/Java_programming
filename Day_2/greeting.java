import java.util.*;
class greeting{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int button;
        System.out.print("Button 1\nButton 2\nButton 3\n");
        System.out.print("Press a button : ");
        button = sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }
        else if(button==2){
            System.out.println("Namaste");
        }
        else if (button==3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid button");
        }
        sc.close();
    }
}