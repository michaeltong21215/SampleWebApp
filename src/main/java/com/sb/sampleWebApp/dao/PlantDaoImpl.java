package com.sb.sampleWebApp.dao;

import com.sb.sampleWebApp.model.Plant;
import com.sb.sampleWebApp.model.PlantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PlantDaoImpl implements PlantDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Plant createPlant(Plant newPlant) {
        String query = "insert into plants(plantId,plantType,plantName, isWatered) VALUES(?, ?, ?, false)";
        jdbcTemplate.update(query, newPlant.getPlantId(), newPlant.getPlantType(), newPlant.getPlantName());
        return newPlant;
    }

    @Override
    public Plant renamePlant(int plantId, String newPlantName) {
        String query = "update plants set plantName = ? where plantid = ?";
        jdbcTemplate.update(query, newPlantName, plantId);
        return getPlantById(plantId);
    }

    @Override
    public Plant deletePlant(Plant deletePlant) {
        String query = "delete from plants where plantid = ?";
        jdbcTemplate.update(query, deletePlant.getPlantId());
        return deletePlant;
    }

    @Override
    public List<Plant> getPlants() {
        return jdbcTemplate.query("select * from plants", new PlantMapper());
    }

    @Override
    public Plant flowerPlant(int plantId) {
        return null;
    }

    @Override
    public Plant getPlantById(int plantId) {
        return jdbcTemplate.query("select * from plants where plantid = " + plantId, new PlantMapper()).get(0);
    }
}
