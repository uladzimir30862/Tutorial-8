class Car extends Vehicle {
    private double milesDriven;
    private double fuelConsumed;

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / fuelConsumed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Miles Driven: " + milesDriven + ", Fuel Consumed: " + fuelConsumed +
                ", Fuel Efficiency: " + calculateFuelEfficiency();
    }
}
