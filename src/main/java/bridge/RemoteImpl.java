package bridge;

public class RemoteImpl implements Remote {

    private Device device;

    public RemoteImpl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    public void channelsUp() {
        device.setChannel(device.getChannel() + 1);
    }

    public void channelsDown() {
        device.setChannel(device.getChannel() - 1);
    }
}