package pro.sky.java.homeworks.course2.lesson1;
public class Car extends MotorTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public Car(String modelName) {
        super(modelName, 4);
    }
}
