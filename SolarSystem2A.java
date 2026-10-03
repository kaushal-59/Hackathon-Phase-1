import java.util.Scanner;
public class SolarSystem2A{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter panel ID");
        int id= sc.nextInt();

        System.out.println("Enter energy generated(in kwH)");
        double energy= sc.nextDouble();

        System.out.println( "Enter the number of solar panels:");
        int panels= sc.nextInt();

        char SystemStatus= 'A';
        System.out.println("-----SOLAR ENERGY SYSTEM----");
        System.out.println("Panel ID= " + id);
        System.out.println("Energy generated: " + energy);
        System.out.println("Number of solar panels: " + panels);
        System.out.println("System Status: " + SystemStatus);
    }
}