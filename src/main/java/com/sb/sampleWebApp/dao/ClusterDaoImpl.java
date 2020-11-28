package com.sb.sampleWebApp.dao;

import com.sb.sampleWebApp.model.Cluster;
import com.sb.sampleWebApp.model.ClusterMapper;
import com.sb.sampleWebApp.service.ClusterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ClusterDaoImpl implements ClusterDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ClusterDaoImpl.class);

    public List<Cluster> createClusters(List<Cluster> newClusters){
        for(int i = 0; i < newClusters.size(); i++) {
            int id = newClusters.get(i).getId();
            String name = newClusters.get(i).getName();
            String query = "INSERT INTO clustertest(id, name) VALUES (?,?)";
            jdbcTemplate.update(query, id, name);
        }
        return newClusters;
    }

    public List<Cluster> deleteClusters(List<Integer> ids){
        List<Cluster> oldClusters = new ArrayList<Cluster>();
        for(int i = 0; i < ids.size(); i++) {
            logger.info("id: " + retrieveClusterById(ids.get(i)));
            oldClusters.add(retrieveClusterById(ids.get(i)));
            String query = "delete from clustertest where id = ?";
            jdbcTemplate.update(query, ids.get(i));
        }
        return oldClusters;
    }

    public List<Cluster> retrieveClusters(){
        // return null;
        return jdbcTemplate.query("select * from clustertest", new ClusterMapper());
    }

    @Override
    public Cluster retrieveClusterById(int id) {
        return jdbcTemplate.query("select * from clustertest where id = " + id, new ClusterMapper()).get(0);
    }

    @Override
    public Cluster updateCluster(Cluster updateCluster) {
        jdbcTemplate.update("update clustertest set name = ? where id = ?", updateCluster.getName(), updateCluster.getId());
        return updateCluster;
    }
}
