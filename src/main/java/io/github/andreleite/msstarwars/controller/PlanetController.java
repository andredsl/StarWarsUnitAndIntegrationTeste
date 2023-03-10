package io.github.andreleite.msstarwars.controller;

import io.github.andreleite.msstarwars.domain.Planet;
import io.github.andreleite.msstarwars.domain.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planets")
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @PostMapping
    public ResponseEntity<Planet> create(@RequestBody Planet planet){
        planetService.create(planet);
        return ResponseEntity.status(HttpStatus.CREATED).body(planet);
    }

}
