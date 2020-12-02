package com.sb.sampleWebApp.service;

import com.sb.sampleWebApp.dao.PlantDao;
import com.sb.sampleWebApp.model.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServiceImpl implements PlantService{
    @Autowired
    PlantDao plantDao;

    @Override
    public Plant createPlant(Plant newPlant) {
        return plantDao.createPlant(newPlant);
    }

    @Override
    public Plant renamePlant(int plantId, String newPlantName) {
        return plantDao.renamePlant(plantId, newPlantName);
    }

    @Override
    public Plant deletePlant(Plant deletePlant) {
        return plantDao.deletePlant(deletePlant);
    }

    @Override
    public List<Plant> getPlants() {
        return plantDao.getPlants();
    }

    @Override
    public Plant flowerPlant(int plantId) {
        return null;
    }
}
