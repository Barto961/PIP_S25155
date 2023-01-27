class Car {
    private String make;
    private String model;
    private double fuelLevel;
    private double distanceTravelled;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void drive(double distance) {
        if (distance > fuelLevel) {
            System.out.println("Nie wystarczająca ilosc paliwa na podaną trase");
        } else {
            fuelLevel -= distance;
            distanceTravelled += distance;
        }
    }

    public void refuel(double amount) {
        fuelLevel += amount;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }
}

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.drive(50);
        car.refuel(10);
        System.out.println(car.getFuelLevel()); // 10
        System.out.println(car.getDistanceTravelled()); // 50
    }

}
