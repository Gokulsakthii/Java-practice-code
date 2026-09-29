class vehicle{
    String brand;
    int year;
    void startengine() {
        
    }
}

    class Car extends vehicle{
        String fuelType;
        @Override
        void startengine() {
            System.out.println("car engine starts");
        }

        void drive() {
            System.out.println("car is driving");
        }
    }

    class Truck extends vehicle{
        int loadCapacity;
        @Override
        void startengine() {
            System.out.println("truck engine starts");
        }

        void haul() {
            System.out.println("truck is hauling");
        }
    }

    public class inheritsex {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.year = 2020;
        c.fuelType = "Petrol";
        c.startengine();
        c.drive();

       Truck t = new Truck();
        t.brand = "Volvo";
        t.year = 2018;
        t.loadCapacity = 5000;
        t.startengine();
        t.haul();
    }
}
