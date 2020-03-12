package factory_method;

public class Main {

    public static void main(String[] args) {
        RoadLogistics roadLogistics = new RoadLogistics();

        double roadDeliveryTime = roadLogistics.calculatePrice(2000);

        SeaLogistics seaLogistics = new SeaLogistics();

        double seaDeliveryTime = seaLogistics.calculatePrice(6000);


        System.out.println("Road logistics: " + roadDeliveryTime);
        System.out.println("Sea logistics: " + seaDeliveryTime);
    }
}
