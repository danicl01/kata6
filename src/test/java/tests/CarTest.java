package tests;

import org.junit.Test;
import software.ulpgc.kata6.Car;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void the_engine_is_on_when_start_up_the_car() {
        Car car = new Car();
        car.startUp();
        assertEquals("on", car.getEngineStatus());
    }

    @Test
    public void the_car_speed_increase_when_speed_up() {
        Car car = new Car();
        car.startUp();
        assertEquals(0, car.getSpeed());

        car.speedUp(20);
        assertEquals(20, car.getSpeed());
    }

    @Test
    public void the_speed_of_the_car_stop_increasing_when_reached_the_speed_limit() {
        Car car = new Car();
        car.startUp();
        car.speedUp(1000);
        assertEquals(car.getSpeedLimit(), car.getSpeed());
    }

    @Test
    public void when_braking_the_car_the_speed_should_be_0() {
        Car car = new Car();
        car.startUp();
        car.speedUp(30);
        car.brake(46);
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void the_car_must_not_move_if_engine_is_off() {
        Car car = new Car();
        car.speedUp(100);
        assertEquals(0, car.getSpeed());
    }


}
