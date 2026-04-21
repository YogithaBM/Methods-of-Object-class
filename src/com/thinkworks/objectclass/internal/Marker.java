package com.thinkworks.objectclass.internal;

public class Marker {
    private String markerColor;
    private int markersQuantity;
    private String tipType;
    private int lifeSpan;

    public Marker(int lifeSpan, String tipType, int markersQuantity, String markerColor) {
        this.lifeSpan = lifeSpan;
        this.tipType = tipType;
        this.markersQuantity = markersQuantity;
        this.markerColor = markerColor;
    }

    @Override
    public String toString() {
        return "Marker colour : "+markerColor+", Quantity : "+markersQuantity;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Marker){
            Marker marker=(Marker) obj;
            if(markerColor.equals(marker.getMarkerColor())&&markersQuantity==marker.getMarkersQuantity()) {
                if(tipType.equals(marker.getTipType())&&lifeSpan==marker.getLifeSpan()){
                   return true;
                }
                return false;
            }

        }
            return false;
    }

    public String getMarkerColor() {
        return markerColor;
    }

    public void setMarkerColor(String markerColor) {
        this.markerColor = markerColor;
    }

    public int getMarkersQuantity() {
        return markersQuantity;
    }

    public void setMarkersQuantity(int markersQuantity) {
        this.markersQuantity = markersQuantity;
    }

    public String getTipType() {
        return tipType;
    }

    public void setTipType(String tipType) {
        this.tipType = tipType;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
