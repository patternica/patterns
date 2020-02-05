package builder;

public class CarBuilder implements Builder<Car> {

    private Car car = new Car();

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setAlarm(boolean hasAlarm) {
        this.car.setAlarm(hasAlarm);
    }

    @Override
    public void setGPS(boolean hasGps) {
        this.car.setGps(hasGps);
    }

    @Override
    public Car getResult() {
        return this.car;
    }

}
