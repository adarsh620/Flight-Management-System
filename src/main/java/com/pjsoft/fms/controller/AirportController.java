package com.pjsoft.fms.controller;

import com.pjsoft.fms.model.Airport;
import com.pjsoft.fms.model.Flight;
import com.pjsoft.fms.service.AirportService;
import com.pjsoft.fms.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airports")
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getAirportById(@PathVariable Long id) {
        Airport airport= airportService.getAirportById(id);
        return ResponseEntity.ok(airport);
        //return flightService.getFlightById(id);
    }

    @PostMapping
    public Airport createAirport(@RequestBody Airport airport) {
        return airportService.saveAirport(airport);
    }

    @PutMapping("/{id}")
    public Airport updateAirport(@PathVariable Long id, @RequestBody Airport airport) {
        airport.setId(id);
        return airportService.saveAirport(airport);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable Long id) {
        airportService.deleteAirport(id);
    }

    @PostMapping("/{airportId}/flights")
    public Flight addFlightToAirport(@PathVariable Long airportId, @RequestBody Flight flight) {
        return airportService.addFlightToAirport(airportId, flight);
    }

    @GetMapping("/{airportId}/flights")
    public List<Flight> getFlightsByAirport(@PathVariable Long airportId) {
        return airportService.getFlightsByAirport(airportId);
    }

}
