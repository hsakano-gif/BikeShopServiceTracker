public class Bicycle{
    private String owner;
    private String model;
    private int mileage;
    private ServiceRecord s;
    private static int nextIdCounter;
    private final int INSTANCE_ID;

    public Bicycle(String owner, String model){
        this.owner = owner;
        this.model = model;
        nextIdCounter++;
        INSTANCE_ID = nextIdCounter;
        mileage = 0;
        s = new ServiceRecord(); 

    }
    public String getOwner(){
        return owner;
    }
    public String getModel(){
        return model;
    }
    public int getMileage(){
        return mileage;
    }
    public int getNextIdCounter(){
        return nextIdCounter;
    }
    public int getINSTANCE_ID(){
        return INSTANCE_ID;
    }

    public boolean needsService(){
        return mileage > 100;
    }
    public void ride(int miles){
        if (miles > 0){
            mileage += miles;
        }
    }
    public ServiceRecord getServiceRecord(){
        return s;
    }


}