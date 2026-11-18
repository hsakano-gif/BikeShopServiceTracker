public class BikeShop{
    public static final double LABOR_RATE = 65.0;
    private static int repairCounter = 0;

    public static String serviceBike(Bicycle bike, double hours){
        double cost = 0;
        if (hours > 0 && bike.needsService()){
            cost = laborCost(hours);
        }
        bike.getServiceRecord().markComplete();

        bike.getServiceRecord().addCharge(cost);
        repairCounter++;           

        return bike.getServiceRecord().toString();
    }

    //https://stackoverflow.com/questions/285177/how-do-i-call-one-constructor-from-another-in-java
    public static double laborCost(double hours){
        return hours * LABOR_RATE;
    }
    public static int getTotalRepairs(){
        return repairCounter;
    }
}