package com.sb.sampleWebApp.service;

import com.sb.sampleWebApp.model.Plant;

import java.util.List;

public interface PlantService {
    Plant createPlant(Plant newPlant);
    Plant renamePlant(int plantId, String newPlantName);
    Plant deletePlant(Plant deletePlant);
    List<Plant> getPlants();
    Plant flowerPlant(int plantId);
    Plant getPlantById(int plantId);
}
