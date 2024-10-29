package com.pjsoft.fms.service;

import com.pjsoft.fms.exception.ResourceNotFoundException;
import com.pjsoft.fms.model.Airport;
import com.pjsoft.fms.model.Flight;
import com.pjsoft.fms.repository.AirportRepository;
import com.pjsoft.fms.repository.FlightRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private FlightRepository flightRepository;

    private static final Logger logger = LoggerFactory.getLogger(AirportService.class);

    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    public Airport getAirportById(Long id) {
        logger.debug("Inside getAirportById with id: " + id);
        return airportRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Airport not found with id: " + id));
    }

    public Flight addFlightToAirport(Long airportId, Flight flight) {
        Airport airport = airportRepository.findById(airportId)
                .orElseThrow(() -> new RuntimeException("Airport not found"));
        flight.setAirport(airport);
        return flightRepository.save(flight);
    }

    public List<Flight> getFlightsByAirport(Long airportId) {
        Airport airport = airportRepository.findById(airportId)
                .orElseThrow(() -> new RuntimeException("Airport not found"));
        return airport.getFlights();
    }

    public Airport saveAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    public void deleteAirport(Long id) {
        airportRepository.deleteById(id);
    }
}