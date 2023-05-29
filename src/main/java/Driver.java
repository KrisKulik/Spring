
import org.springframework.beans.factory.annotation.Qualifier;

public class Driver {
    private final String name;

    @Qualifier ("getBean")
    private final Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public Transport getTransport() {
        return transport;
    }
    public void startTheAuto () {
        System.out.println(getName() + " сел(а) в " + transport);
    }
}