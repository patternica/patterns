package factory_method;

public abstract class Logistics<T extends Transport> {

    public double calculatePrice(long distance) {
        T transport = createTransport();
        return distance * transport.getPricePerKm();
    }

    public abstract T createTransport();
}
