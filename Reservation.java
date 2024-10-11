public abstract class Reservation {
    protected String roomType;
    protected int nights;
    protected boolean breakfast;
    protected boolean wifi;

    public abstract Reservation reset();

    public Reservation setNights(int nights) {
        this.nights = nights;
        return this;
    }

    public Reservation addBreakfast() {
        this.breakfast = true;
        return this;
    }

    public Reservation addWifi() {
        this.wifi = true;
        return this;
    }

    public String toString() {
        return "Reservation: " + roomType + ", " + nights + " nights, Breakfast: " + breakfast + ", WiFi: " + wifi;
    }
}