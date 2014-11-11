public class Brother implements Comparable<Brother> {

    private int iNum;
    private String initials, name;
    private boolean coopStatus, inHouse, positionStatus;

    public Brother (int iNum, String initials, String name,
        boolean coopStatus, boolean inHouse, boolean positionStatus) {
        this.iNum = iNum;
        this.initials = initials;
        this.name = name;
        this.coopStatus = coopStatus;
        this.inHouse = inHouse;
        this.positionStatus = positionStatus;
    }

    @Override
    public int compareTo(Brother other) {
        return this.iNum - other.iNum;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {return false;}
        if (!(other instanceof Brother)) {return false;}
        return this.hashCode() == other.hashCode();
    }

    @Override
    public int hashCode() {
        return iNum;
    }

    public int getINum() {
        return iNum;
    }

    public String getInitials() {
        return initials;
    }

    public String getName() {
        return name;
    }

    public boolean getCoopStatus() {
        return coopStatus;
    }

    public boolean getInHouse() {
        return inHouse;
    }

    public boolean getPositionStatus() {
        return positionStatus;
    }

    public void setCoopStatus(boolean newStatus) {
        coopStatus = newStatus;
    }

    public void setInHouse(boolean newStatus) {
        inHouse = newStatus;
    }

    public void setPositionStatus(boolean newStatus) {
        positionStatus = newStatus;
    }

    @Override
    public String toString() {
        String s = "";
        String housePhrase = "";
        String coopPhrase = "";
        String positionPhrase = "";
        if (!inHouse) {housePhrase = "not ";}
        if (coopStatus) {coopPhrase = "\nIs currently in a Co-Op.";}
        if (positionStatus) {positionPhrase = "\nIs currently holding a priority position.";}
        s = "I-%d %s. \nIs currently %sliving in the house.%s%s";
        return String.format(s, iNum, name, housePhrase, coopPhrase, positionPhrase);
    }

}