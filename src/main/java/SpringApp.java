import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


        Car car = context.getBean(Car.class);
        car.start();
        Bus bus = context.getBean(Bus.class);
        bus.start();
        Pickup pickup = context.getBean(Pickup.class);
        pickup.start();

        Driver driver = context.getBean("driver",Driver.class);
        driver.startTheAuto();

        Driver driver2 = context.getBean("driver2",Driver.class);
        driver2.startTheAuto();

        Driver driver3 = context.getBean("driver3",Driver.class);
        driver3.startTheAuto();
    }
}