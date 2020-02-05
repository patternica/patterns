package builder;

public class CarManualBuilder implements Builder<Manual> {

    private Manual manual = new Manual(new Car());

    @Override
    public void reset() {
        this.manual = new Manual(new Car());
    }

    @Override
    public void setSeats(int seats) {
        this.manual.getCar().setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.manual.getCar().setEngine(engine);
    }

    @Override
    public void setAlarm(boolean hasAlarm) {
        this.manual.getCar().setAlarm(hasAlarm);
    }

    @Override
    public void setGPS(boolean hasGps) {
        this.manual.getCar().setGps(hasGps);
    }

    @Override
    public Manual getResult() {
        return this.manual;
    }
}
