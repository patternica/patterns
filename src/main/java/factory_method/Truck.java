package factory_method;

public class Truck implements Transport {

    private final double fuelPriceForLiter = 2.136;
    private final double fuelUsagePerKm = 3;

    @Override
    public double getPricePerKm() {
        return fuelUsagePerKm * fuelPriceForLiter;
    }
}
