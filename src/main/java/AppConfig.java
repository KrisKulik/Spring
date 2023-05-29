import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class AppConfig {

        @Bean
        public Car getBeanCar (){
            return new Car("Volvo", "S90", 2.0);
        }
        @Bean
        public Bus getBeanBus (){
            return new Bus("Fiat","Ducato", 3.0);
        }
        @Bean
        public Pickup getBeanPickup(){
            return new Pickup("Volkswagen","Amarok",3.0);
        }

        @Bean ("driver")
        public Driver getDriverCar (){
            return new Driver("Люк Скайуокер", getBeanCar());
        }
        @Bean ("driver2")
        public Driver getDriverBus(){
            return new Driver("Оби Ван Кенобе", getBeanBus());
        }
        @Bean ("driver3")
        public Driver getDriverPickup(){
            return new Driver("Лея", getBeanPickup());
        }
    }
