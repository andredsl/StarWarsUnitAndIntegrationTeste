package io.github.andreleite.msstarwars.controller;

import io.github.andreleite.msstarwars.domain.Planet;
import io.github.andreleite.msstarwars.domain.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

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

    @GetMapping("/{id}")
    public ResponseEntity<Planet> get(@PathParam("id") Long id){
        return planetService.get(id).map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
