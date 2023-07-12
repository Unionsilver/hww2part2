package pro.sky.java.homeworks.course2.lesson1;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1");
        Car car2 = new Car("car2");
        System.out.println(car.getWheelsCount());
        System.out.println(car2.getWheelsCount());

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        System.out.println(truck.getWheelsCount());
        System.out.println(truck2.getWheelsCount());
        truck.updateTyre();

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        System.out.println(bicycle.getWheelsCount());
        System.out.println(bicycle2.getWheelsCount());

        System.out.println("___________________________");
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car);
        serviceStation.check(car2);
        serviceStation.check(truck);
        serviceStation.check(truck2);
        serviceStation.check(bicycle);
        serviceStation.check(bicycle2);
    }
}
