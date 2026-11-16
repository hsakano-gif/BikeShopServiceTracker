public class Bicycle{
    private String owner;
    private String model;
    private int mileage;
    private ServiceRecord c;
    private static int counterID;
    private final int INSTANCE_ID;

    public Bicycle(String owner, String model){
        this.owner = owner;
        this.model = model;
        mileage = 0;
        c = new ServiceRecord();
    }
    public void ride(int miles){
        mileage += miles;
    }
    public ServiceRecord getServiceRecord(){
        return c;
    }
}