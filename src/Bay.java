public abstract class Bay {
    private Vehicle vehicle;
    private String bayName;

    private int maxWeight;

    protected Bay (String bayName, int maxWeight) {
        this.vehicle = null;
        this.bayName = bayName;
        this.maxWeight = 0;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}