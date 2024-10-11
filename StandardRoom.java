public class StandardRoom extends Reservation {

    public StandardRoom() {
        this.roomType = "Standard Room";
    }
    
    @Override
    public Reservation reset() {
        return new StandardRoom();
    }
}