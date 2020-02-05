package builder;

public class Main {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        makeSportCar(carBuilder);
        Car sportCar = carBuilder.getResult();

        CarManualBuilder manualCarBuilder = new CarManualBuilder();
        makeSportCar(manualCarBuilder);
        Manual sportCarManual = manualCarBuilder.getResult();

        System.out.println(sportCar);
        System.out.println(sportCarManual.getText());
    }

    public static void makeSportCar(Builder<?> builder) {
        builder.setSeats(2);
        builder.setAlarm(true);
        builder.setGPS(false);
        builder.setEngine(new SportEngine());
    }
}
