package builder;

public class Main {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        makeSportCar(carBuilder);
        Car sportCar = carBuilder.getResult();

        carBuilder.reset();
        makeSuv(carBuilder);
        Car suv = carBuilder.getResult();

        CarManualBuilder manualCarBuilder = new CarManualBuilder();
        makeSportCar(manualCarBuilder);
        Manual sportCarManual = manualCarBuilder.getResult();

        manualCarBuilder.reset();
        makeSuv(manualCarBuilder);
        Manual suvManual = manualCarBuilder.getResult();

        System.out.println(sportCar);
        System.out.println(sportCarManual.getText());

        System.out.println(suv);
        System.out.println(suvManual.getText());
    }

    public static void makeSportCar(Builder<?> builder) {
        builder.setSeats(2);
        builder.setAlarm(true);
        builder.setGPS(false);
        builder.setEngine(new SportEngine());
    }

    public static void makeSuv(Builder<?> builder) {
        builder.setSeats(4);
        builder.setAlarm(true);
        builder.setGPS(true);
        builder.setEngine(new SportEngine());
    }
}
