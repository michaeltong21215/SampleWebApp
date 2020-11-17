package com.sb.sampleWebApp.service;

import com.sb.sampleWebApp.model.Cluster;

import java.util.List;

public interface ClusterService {
    List<Cluster> createClusters(List<Cluster> newClusters);

    List<Cluster> deleteClusters(List<Integer> ids);

    List<Cluster> retrieveClusters();


}