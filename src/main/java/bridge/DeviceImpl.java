package bridge;

public class DeviceImpl implements Device {

    private boolean enabled;
    private int volume;
    private int channel;

    public void disable() {
        this.enabled = false;
    }

    public void enable() {
        this.enabled = true;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }
}
