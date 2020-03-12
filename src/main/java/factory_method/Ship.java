package factory_method;

public class Ship implements Transport {

    private final double fuelPriceForLiter = 3;
    private final double fuelUsagePerKm = 100;

    @Override
    public double getPricePerKm() {
        return fuelUsagePerKm * fuelPriceForLiter;
    }
}
