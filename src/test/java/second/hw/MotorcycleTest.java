package second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chirkov.second.hw.Motorcycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleTest {
    private Motorcycle motorcycle;


    @BeforeEach
    void beforeEach() {
        motorcycle = new Motorcycle("Ducati", "Diavel", 2023);
    }

    //    - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void howNumWheelsMotorcycle() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    //    - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
//    (используя метод testDrive()).
    @Test
    void whichSpeedInDrive() throws Exception {
        this.motorcycle.testDrive();
        assertEquals(75, this.motorcycle.getSpeed());
    }

    //    - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
//    мотоцикл останавливается (speed = 0).
    @Test
    void testParkingMotorcycle() throws Exception {
        this.motorcycle.testDrive();
        this.motorcycle.park();
        assertEquals(0, this.motorcycle.getSpeed());
    }
}
