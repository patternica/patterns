package builder;

public interface Builder<T> {

    void reset();
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setAlarm(boolean hasAlarm);
    void setGPS(boolean hasGps);
    T getResult();
}
