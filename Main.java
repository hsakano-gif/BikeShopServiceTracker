public class Main{
    public static void main (String[] args){
        Bicycle nissan = new Bicycle("Mr.Gorton", 
            "Nissan"
        );
        Bicycle toyota = new Bicycle("Ms.Gorton",
            "Toyota");
        System.out.println("Bike #" + nissan.getINSTANCE_ID() + ":" + nissan.getOwner() + "'s " + nissan.getModel() + ", " + nissan.getMileage() + " miles; " +  nissan.getServiceRecord());
        System.out.println("Bike #" + toyota.getINSTANCE_ID() + ":" + toyota.getOwner() + "'s " + toyota.getModel() + ", " + toyota.getMileage() + " miles; " +  toyota.getServiceRecord());
        
        nissan.ride(50);
        System.out.println(nissan.getModel() + " needs service: " + nissan.needsService());
        toyota.ride(120);
        System.out.println(toyota.getModel() + " needs service: " + toyota.needsService());

        Bicycle alias = nissan;
        alias.ride(50);
        System.out.println("Alias of " + nissan.getModel() + "'s mileage: " + nissan.getMileage() + " miles.");



        System.out.println(nissan.getNextIdCounter() + ":" + nissan.getOwner() + "'s " + nissan.getModel() + ", " + nissan.getMileage() + " miles; " + BikeShop.serviceBike(nissan, 5));

        System.out.println(toyota.getNextIdCounter() + ":" + toyota.getOwner() + "'s " + toyota.getModel() + ", " + toyota.getMileage() + " miles; " +  BikeShop.serviceBike(toyota, 8));

        System.out.println(BikeShop.getTotalRepairs());

        
    }
}