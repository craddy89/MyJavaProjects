package SerializationAndCloning.deepCloning.staticmethod;

public class Car {
    private int weight;
    private String model;

    public Car(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    public Car() { }

    public static Car deepCopyCar(Car carToCopy) {
        Car copiedCar = new Car();
        copiedCar.model = carToCopy.model;
        copiedCar.weight = carToCopy.weight;
        return copiedCar;
    }

    @Override
    public String toString() {
        return "Car{" +
               "weight=" + weight +
               ", model=" + model +
               '}';
    }
}
