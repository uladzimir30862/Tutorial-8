public class VehicleManagementSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2020, 15000, 500);
        Vehicle truck = new Truck("Ford", "F-150", 2018, 20000, 800, 5);

        System.out.println(car);
        System.out.println(truck);
    }
}

