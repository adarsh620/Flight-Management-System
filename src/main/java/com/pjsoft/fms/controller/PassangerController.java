package com.pjsoft.fms.controller;

import com.pjsoft.fms.model.Airport;
import com.pjsoft.fms.model.Passanger;
import com.pjsoft.fms.service.PassangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/passengers")
public class PassangerController {
    @Autowired
    private PassangerService passangerService;

    @GetMapping
    public List<Passanger> getAllPassangers() {
        return passangerService.getAllPassangers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getPassangerById(@PathVariable Long id) {
        Passanger passanger= passangerService.getPassangerById(id);
        return ResponseEntity.ok(passanger);
        //return flightService.getFlightById(id);
    }

    @PostMapping
    public Passanger createAirport(@RequestBody Passanger passanger) {
        return passangerService.savePassanger(passanger);
    }

    @PutMapping("/{id}")
    public Passanger updateAirport(@PathVariable Long id, @RequestBody Passanger passanger) {
        passanger.setId(id);
        return passangerService.savePassanger(passanger);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable Long id) {
        passangerService.deletePassanger(id);
    }
}
