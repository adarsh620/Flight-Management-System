package com.pjsoft.fms.controller;

import com.pjsoft.fms.model.Airport;
import com.pjsoft.fms.model.Booking;
import com.pjsoft.fms.service.AirportService;
import com.pjsoft.fms.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getBookingById(@PathVariable Long id) {
        Booking booking= bookingService.getBookingById(id);
        return ResponseEntity.ok(booking);
        //return flightService.getFlightById(id);
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }

    @PutMapping("/{id}")
    public Booking updateBooking(@PathVariable Long id, @RequestBody Booking booking) {
        booking.setId(id);
        return bookingService.saveBooking(booking);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable Long id) {
        bookingService.deleteBooking(id);
    }
}
