import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double enginVolume;

    public Transport(String brand, String model, double enginVolume) {
        this.brand = brand;
        this.model = model;
        this.enginVolume = enginVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEnginVolume() {
        return enginVolume;
    }

    public void setEnginVolume(double enginVolume) {
        this.enginVolume = enginVolume;
    }

    public abstract void start();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.enginVolume, enginVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, enginVolume);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", enginVolume=" + enginVolume +
                '}';
    }
}
