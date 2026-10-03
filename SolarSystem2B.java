import java.util.Scanner;
class SolarSystem2B{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter energy generated(in kWh)");
        double energy= sc.nextDouble();

        if(energy>=10.0){
            System.out.println("Good energy generation");

        } else{
            System.out.println("Lower energy generation");
        }
    }
}