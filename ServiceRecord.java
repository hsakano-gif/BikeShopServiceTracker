public class ServiceRecord {
    private String serviceDescription = "Routine bicycle service";
    private double accumulatedCost = 0;
    private boolean completionStatus = false;

    public String getServiceDescription(){
        return serviceDescription;
    }
    public double getAccmulatedCost(){
        return accumulatedCost;
    }
    public boolean getCompleteionStatus(){
        return completionStatus;
    }

    public void addCharge(double amount){
        accumulatedCost += amount;
    }
    public void completionStatus(){
        completionStatus = true;
    }
    public String toString(){
        return serviceDescription + ": " + accumulatedCost + completionStatus; 
    }
}