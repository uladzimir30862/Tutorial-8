class Truck extends Vehicle {
    private double milesDriven;
    private double fuelConsumed;
    private double cargoWeight;

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / (fuelConsumed + (cargoWeight * 0.5));
    }

    @Override
    public String toString() {
        return super.toString() + ", Miles Driven: " + milesDriven + ", Fuel Consumed: " + fuelConsumed +
                ", Cargo Weight: " + cargoWeight + ", Fuel Efficiency: " + calculateFuelEfficiency();
    }
}
