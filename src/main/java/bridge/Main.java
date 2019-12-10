package bridge;

public class Main {

    public static void main(String[] args) {
        Device device = new DeviceImpl();

        Remote remote = new RemoteImpl(device);

        remote.channelsDown();
    }
}
