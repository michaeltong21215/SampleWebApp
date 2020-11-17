package com.sb.sampleWebApp.dao;

import com.sb.sampleWebApp.model.Cluster;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ClusterDaoImpl implements ClusterDao {
    public List<Cluster> createClusters(List<Cluster> newClusters){
        return null;
    }

    public List<Cluster> deleteClusters(List<Integer> ids){
        return null;
    }

    public List<Cluster> retrieveClusters(){
        return null;
    }

    @Override
    public Cluster retrieveClusterById(int id) {
        return null;
    }
}
