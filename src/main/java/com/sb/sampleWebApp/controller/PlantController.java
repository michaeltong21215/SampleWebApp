package com.sb.sampleWebApp.controller;

import com.sb.sampleWebApp.model.Plant;
import com.sb.sampleWebApp.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/plants")
public class PlantController {
    @Autowired
    PlantService plantService;

    @PostMapping
    public ResponseEntity<Plant> createPlant(@RequestBody Plant newPlant){
        return new ResponseEntity<Plant>(plantService.createPlant(newPlant), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Plant> renamePlant(@RequestBody Plant renamePlant) {
        return new ResponseEntity<Plant>(plantService.renamePlant(renamePlant.getPlantId(), renamePlant.getPlantName()), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Plant> deletePlant(@RequestBody Plant deletePlant) {
        return new ResponseEntity<Plant>(plantService.deletePlant(deletePlant), HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Plant>> getPlants(){
        return new ResponseEntity<List<Plant>>(plantService.getPlants(), HttpStatus.OK);
    }

    @GetMapping(value="/id")
    public ResponseEntity<Plant> getPlantByIdParam(@RequestParam("id") int id){
        return new ResponseEntity<Plant>(plantService.getPlantById(id), HttpStatus.OK);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Plant> getPlantByIdPathVariable(@PathVariable("id") int id){
        return new ResponseEntity<Plant>(plantService.getPlantById(id), HttpStatus.OK);
    }
}
