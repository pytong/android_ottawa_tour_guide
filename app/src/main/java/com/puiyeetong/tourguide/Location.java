package com.puiyeetong.tourguide;

/**
 * Displays location details to the user.
 */
public class Location {

    private int nameId;

    private int detailsId;

    private int imageResourceId;

    public Location(int nameId, int detailsId, int imageResourceId) {
        this.nameId = nameId;
        this.detailsId = detailsId;
        this.imageResourceId = imageResourceId;
    }

    public int getNameId() {
        return nameId;
    }

    public int getDetailsId() {
        return detailsId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
