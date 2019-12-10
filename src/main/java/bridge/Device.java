package bridge;

public interface Device {

    void disable();
    void enable();

    boolean isEnabled();

    void setVolume(int volume);
    int getVolume();

    void setChannel(int channel);
    int getChannel();
}
