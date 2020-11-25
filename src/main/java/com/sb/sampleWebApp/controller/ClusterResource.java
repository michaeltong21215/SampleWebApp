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
@RequestMapping("/v1")
public class ClusterResource {
    @Autowired
    ClusterService clusterService;

    @GetMapping("/hello")
    public String hello(){
        return "you are hitting endpoint";
    }

    //@PostMapping("/cluster")
    @RequestMapping(value = "/cluster", method=RequestMethod.POST)
    public ResponseEntity<List<Cluster>> createClusters(@RequestBody List<Cluster> clusters){
        return new ResponseEntity<List<Cluster>>(clusterService.createClusters(clusters), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/cluster", method=RequestMethod.GET)
    public List<Cluster> retrieveClusters(){
        return clusterService.retrieveClusters();
    }

    @RequestMapping(value= "/cluster", method=RequestMethod.DELETE)
    public List<Cluster> deleteClusters(@RequestBody List<Integer> ids) {
        return clusterService.deleteClusters(ids);
    }

}
