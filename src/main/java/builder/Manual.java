package builder;

public class Manual {

    private final Car car;

    public Manual(Car car) {
        this.car = car;
    }

    public String getText() {
        return "Manual for: " + car.toString();
    }

    public Car getCar() {
        return car;
    }
}
