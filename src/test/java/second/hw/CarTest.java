package second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chirkov.second.hw.Car;
import ru.chirkov.second.hw.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    private Car myCar;


    public static void main(String[] args) {

    }


    @BeforeEach
     void beforeEachMyCar() throws Exception {
        this.myCar = new Car("UAZ","Patriot", 1941);
    }


//- Проверить, что экземпляр объекта Car
// также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    public void isVehicle() throws Exception {
        assertInstanceOf(Vehicle.class, this.myCar);
    }
//    - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void howNumWheels() throws Exception {
        assertEquals(4, this.myCar.getNumWheels());
    }

//- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
// (используя метод testDrive()).
    @Test
    void whichSpeedInDrive() throws Exception {
        this.myCar.testDrive();
        assertEquals(60,this.myCar.getSpeed());
    }


//- Проверить, что в режиме парковки (сначала testDrive, потом park,
// т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void testParkingCar() throws Exception {
        this.myCar.testDrive();
        this.myCar.park();
        assertEquals(0, this.myCar.getSpeed());
    }
}
