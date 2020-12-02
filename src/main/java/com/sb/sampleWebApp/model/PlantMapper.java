package com.sb.sampleWebApp.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlantMapper implements RowMapper<Plant> {
    private Plant plant;

    @Override
    public Plant mapRow(ResultSet resultSet, int i) throws SQLException {
        Plant plant = new Plant(resultSet.getInt("plantid"),
                resultSet.getString("planttype"),
                resultSet.getString("plantname"),
                resultSet.getBoolean("iswatered"));
        return plant;
    }
}
