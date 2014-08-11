package com.froddyr.pokewar.pokewar;

/**
 * Created by Frode Dyrseth on 11.08.2014.
 */
public class WarItem {

    private String oponentName;
    private int myTimeRemaining, oponentTimeRemaining;

    public WarItem(String oponentName) {
        this.oponentName = oponentName;
    }

    public int getMyTimeRemaining() {
        return myTimeRemaining;
    }

    public void setMyTimeRemaining(int myTimeRemaining) {
        this.myTimeRemaining = myTimeRemaining;
    }

    public int getOponentTimeRemaining() {
        return oponentTimeRemaining;
    }

    public void setOponentTimeRemaining(int oponentTimeRemaining) {
        this.oponentTimeRemaining = oponentTimeRemaining;
    }

    public String getOponentName() {
        return oponentName;
    }

    public void setOponentName(String oponentName) {
        this.oponentName = oponentName;
    }
}