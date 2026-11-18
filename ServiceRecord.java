public class ServiceRecord {
    private String serviceDescription;
    private double accumulatedCost;
    private boolean completionStatus;

    public ServiceRecord(){
        this.serviceDescription = "Routine bicycle service";
        this.accumulatedCost = 0.0;
        this.completionStatus = false;
    }

    public String getServiceDescription(){
        return serviceDescription;
    }
    public double getAccumulatedCost(){
        return accumulatedCost;
    }
    public boolean getCompletionStatus(){
        return completionStatus;
    }

    public void addCharge(double amount){
        if (validation(amount)){
            accumulatedCost += amount;
        }
    }

    private boolean validation(double amount){
        return amount > 0;
    }

    private String statusCheck(){
        if (completionStatus){
            return "Complete";
        } else {
            return "Open";
        }
    }
    public void markComplete(){
        completionStatus = true;
    }
    


    public String toString(){
        return getServiceDescription() + ": " + "$" + getAccumulatedCost() + " ("  + statusCheck() + ")"; 

    }
}