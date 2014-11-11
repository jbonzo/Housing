public class Room {
    private int roomNum;
    private boolean vacant;
    private Brother occupant = null;

    public Room(int roomNum) {
        this.roomNum = roomNum;
        vacant = true;
    }

    public Room(int roomNum, Brother occupant) {
        this.roomNum = roomNum;
        this.occupant = occupant;
        vacant = false;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public Brother getOccupant() {
        return occupant;
    }

    public boolean getVacancyStatus() {
        return vacant;
    }

    public void clearRoom() {
        occupant = null;
        vacant = true;
    }

    public void setOccupant(Brother newOccupant) {
        occupant = newOccupant;
        vacant = false;
    }

    public String toString() {
        String s = "";
        String occupantPhrase = "";
        if (vacant) {
            occupantPhrase = "vacant";
        } else {
            occupantPhrase = "occupied by " + occupant.getInitials();
        }
        s = "Room %d is %s";
        return String.format(s, roomNum, occupantPhrase);
    }
}