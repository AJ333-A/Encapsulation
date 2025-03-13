class Car {
    private String licensePlate;
    private boolean isRented;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isRented = false; // Initially, the car is available
    }

    public void rentCar() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car with plate " + licensePlate + " rented.");
        } else {
            System.out.println("Car is rented.");
        }
    }

    public void returnCar() {
        if (isRented) {
            isRented = false;
            System.out.println("Car with plate " + licensePlate + " returned.");
        } else {
            System.out.println("Car is available.");
        }
    }

    public boolean isCarRented() {
        return isRented;
    }

    public static void main(String[] args) {
        Car myCar = new Car("KDK 238H");
        myCar.rentCar();
        myCar.returnCar();
        System.out.println("Car status: " + myCar.isCarRented());
    }
}

