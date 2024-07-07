import java.util.*;
class greeting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Button 1\nButton 2\nButton 3\n");
        System.out.print("Press a button : ");
        int button = sc.nextInt();
        switch(button){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid button");
        }
    }
}