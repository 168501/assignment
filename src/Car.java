class Car {
    private String modelName;
    private double fuelEfficiency;

    public Car(String modelName, double fuelEfficiency) {
        this.modelName = modelName;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
}
