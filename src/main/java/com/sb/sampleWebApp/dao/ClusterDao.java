package com.sb.sampleWebApp.dao;

import com.sb.sampleWebApp.model.Cluster;

import java.util.List;

public interface ClusterDao {
    public List<Cluster> createClusters(List<Cluster> newClusters);

    public List<Cluster> deleteClusters(List<Integer> ids);

    public List<Cluster> retrieveClusters();

    Cluster retrieveClusterById(int id);
}
