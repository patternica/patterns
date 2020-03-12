package factory_method;

public class SeaLogistics extends Logistics<Ship> {

    @Override
    public Ship createTransport() {
        return new Ship();
    }
}
