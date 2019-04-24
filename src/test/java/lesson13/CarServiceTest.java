package test.java.lesson13;

import main.java.lesson13.CarService;
import org.junit.jupiter.api.Test;

public class CarServiceTest {

    @Test
    public void shouldDemonstrateLogging() {
        CarService carService = new CarService();
        carService.process("BMW");
    }
}
