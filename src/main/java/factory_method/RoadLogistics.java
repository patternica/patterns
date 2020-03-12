package factory_method;

public class RoadLogistics extends Logistics<Truck> {

    @Override
    public Truck createTransport() {
        return new Truck();
    }
}
