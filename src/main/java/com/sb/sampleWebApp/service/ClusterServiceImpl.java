package com.sb.sampleWebApp.service;

import com.sb.sampleWebApp.dao.ClusterDao;
import com.sb.sampleWebApp.model.Cluster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClusterServiceImpl implements ClusterService{
    private static final Logger logger = LoggerFactory.getLogger(ClusterServiceImpl.class);

    @Autowired
    private ClusterDao clustersDao;
    @Override
    public List<Cluster> createClusters(List<Cluster> newClusters) {
        // dao to call create clusters
        return clustersDao.createClusters(newClusters);
    }

    @Override
    public List<Cluster> deleteClusters(List<Integer> ids) {
        return clustersDao.deleteClusters(ids);
    }

    @Override
    public List<Cluster> retrieveClusters() {
        return clustersDao.retrieveClusters();
    }

    @Override
    public Cluster updateCluster(Cluster updateCluster) {
        return clustersDao.updateCluster(updateCluster);
    }

    @Override
    public Cluster retrieveClusterById(int id) {
        return clustersDao.retrieveClusterById(id);
    }
}