public class Car extends Transport{
    public Car(String brand, String model, double enginVolume) {
        super(brand, model, enginVolume);
    }

    @Override
    public void start() {
        System.out.println(getModel() + " готов к работе");
    }
}
