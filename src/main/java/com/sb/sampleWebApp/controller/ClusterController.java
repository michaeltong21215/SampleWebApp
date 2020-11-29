package com.sb.sampleWebApp.controller;

import com.sb.sampleWebApp.model.Cluster;
import com.sb.sampleWebApp.service.ClusterService;
import com.sb.sampleWebApp.service.ClusterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1/clusters")
public class ClusterController {
    @Autowired
    ClusterService clusterService;

    @PostMapping
    public ResponseEntity<List<Cluster>> createClusters(@RequestBody List<Cluster> clusters){
        return new ResponseEntity<List<Cluster>>(clusterService.createClusters(clusters), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Cluster> retrieveClusters(){
        return clusterService.retrieveClusters();
    }

    @DeleteMapping
    public List<Cluster> deleteClusters(@RequestBody List<Integer> ids) {
        return clusterService.deleteClusters(ids);
    }

    @PutMapping
    public ResponseEntity<Cluster> updateCluster(@RequestBody Cluster updateCluster){
        return new ResponseEntity<Cluster>(clusterService.updateCluster(updateCluster), HttpStatus.CREATED);
    }

}
