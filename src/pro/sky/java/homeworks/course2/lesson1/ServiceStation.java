package pro.sky.java.homeworks.course2.lesson1;
public class ServiceStation implements Service {

    @Override
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            transport.service();

        }
    }
}
