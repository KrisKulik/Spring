public class Pickup extends Transport{
    public Pickup(String brand, String model, double enginVolume) {
        super(brand, model, enginVolume);
    }
    @Override
    public void start() {
        System.out.println(getModel() + " готов к работе");
    }
}
