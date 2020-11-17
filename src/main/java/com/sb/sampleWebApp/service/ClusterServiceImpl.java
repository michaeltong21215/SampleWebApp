package com.sb.sampleWebApp.service;

import com.sb.sampleWebApp.dao.ClusterDao;
import com.sb.sampleWebApp.model.Cluster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClusterServiceImpl implements ClusterService{
    @Autowired
    private ClusterDao clustersDao;
    @Override
    public List<Cluster> createClusters(List<Cluster> newClusters) {
        // dao to call create clusters
        clustersDao.createClusters(newClusters);
        return newClusters;
    }

    @Override
    public List<Cluster> deleteClusters(List<Integer> ids) {
        List<Cluster> clusters = new ArrayList<Cluster>();
        for(int i = 0; i < ids.size(); i++){
            clusters.add(retrieveClusterById(ids.get(i)));
        }
        return clustersDao.deleteClusters(ids);
    }

    @Override
    public List<Cluster> retrieveClusters() {
        return clustersDao.retrieveClusters();
    }

    public Cluster retrieveClusterById(int id) {
        return clustersDao.retrieveClusterById(id);
    }
}