package pro.sky.java.homeworks.course2.lesson1;
public abstract class Transport {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }


    public void service() {
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();

        }
    }
}

