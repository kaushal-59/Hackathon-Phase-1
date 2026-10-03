class SolarSystem2C{
    static double calculateTotalEnergy(double morningEnergy , double eveningEnergy){
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args){
        double totalEnergy=calculateTotalEnergy(2.5 , 3.1);
        System.out.println(totalEnergy);
    }
}