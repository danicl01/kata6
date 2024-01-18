package software.ulpgc.kata6;

public class Car {
    private String engineStatus;
    private int speed;
    private final int speedLimit = 120;

    public Car() {
        this.engineStatus = "off";
        this.speed = 0;
    }

    public String getEngineStatus() {
        return engineStatus;
    }

    public void startUp() {
        engineStatus = "on";
    }

    public int getSpeed() {
        return speed;
    }

    public void speedUp(int amount) {
        if(engineStatus.equals("on")) speed += amount;
        if (speed > speedLimit) speed = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void brake(int amount) {
        speed -= amount;
        if (speed < 0) speed = 0;
    }
}
