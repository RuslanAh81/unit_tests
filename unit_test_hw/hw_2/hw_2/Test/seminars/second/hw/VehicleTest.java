package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);

        assertTrue(car instanceof Vehicle);
    }
    @Test
    public void testCarHaveFourWheels() {
        Car car = new Car("Lada", "Granta", 2020);

        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHaveTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R", 2022);

        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedInTestDrive() {
        Car car = new Car("Reno", "Duster", 2022);
        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testMotorcycleSpeedInTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 2021);
        motorcycle.testDrive();

        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testCarStopPark() {
        Car car = new Car("Honda", "Accord", 2000);
        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testMotorcycleStopPark() {
        Motorcycle motorcycle = new Motorcycle("Java", "350", 2024);
        motorcycle.testDrive();
        motorcycle.park();

        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}