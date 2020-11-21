package com.sb.sampleWebApp.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClusterMapper implements RowMapper {
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cluster cluster = new Cluster(rs.getString("name"), rs.getInt("id"));
        return cluster;
    }
}
