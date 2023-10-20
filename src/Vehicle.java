
public abstract class Vehicle {

    private String typeOfTruck;
    private int weightOfTruck;

    public Vehicle (String typeOfTruck, int weightOfTruck){
        this.typeOfTruck = typeOfTruck;
        this.weightOfTruck = weightOfTruck;
    }


    public String getTypeOfTruck() {
        return typeOfTruck;
    }
    public void setTypeOfTruck(String typeOfTruck) {
        this.typeOfTruck = typeOfTruck;
    }

    public int getWeightOfTruck() {
        return weightOfTruck;
    }
    public void setWeightOfTruck(int weightOfTruck) {
        this.weightOfTruck = weightOfTruck;
    }
}