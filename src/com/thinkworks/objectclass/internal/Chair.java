package com.thinkworks.objectclass.internal;

import java.util.Objects;

public class Chair {
    private String woodType;
    private int legCount;
    private int chairCount;
    private String colour;
    private boolean isCushionAvailable;

    public Chair(String woodType, int legCount, int chairCount, String colour, boolean isCushionAvailable) {
        this.woodType = woodType;
        this.legCount = legCount;
        this.chairCount = chairCount;
        this.colour = colour;
        this.isCushionAvailable = isCushionAvailable;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "woodType='" + woodType + '\'' +
                ", legCount=" + legCount +
                ", chairCount=" + chairCount +
                ", colour='" + colour + '\'' +
                ", isCushionAvailable=" + isCushionAvailable +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Chair)) return false;
        Chair chair = (Chair) obj;
        return getLegCount() == chair.getLegCount() && getChairCount() == chair.getChairCount() && isCushionAvailable() == chair.isCushionAvailable() && Objects.equals(getWoodType(), chair.getWoodType()) && Objects.equals(getColour(), chair.getColour());
    }


    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public int getChairCount() {
        return chairCount;
    }

    public void setChairCount(int chairCount) {
        this.chairCount = chairCount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isCushionAvailable() {
        return isCushionAvailable;
    }

    public void setCushionAvailable(boolean cushionAvailable) {
        isCushionAvailable = cushionAvailable;
    }

}
