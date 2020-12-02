package com.sb.sampleWebApp.model;

public class Plant {
    private int plantId;
    private String plantType;
    private String plantName;
    private boolean isWatered;

    public Plant(int plantId, String plantType, String plantName, boolean isWatered) {
        this.plantId = plantId;
        this.plantType = plantType;
        this.plantName = plantName;
        this.isWatered = isWatered;
    }

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public boolean isWatered() {
        return isWatered;
    }

    public void setWatered(boolean watered) {
        isWatered = watered;
    }
}
