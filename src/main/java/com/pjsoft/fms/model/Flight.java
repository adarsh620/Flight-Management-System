package com.pjsoft.fms.model;

import jakarta.persistence.*;
import java.math.BigInteger;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Enforcing unique constraint for flightNo to prevent duplicate entries
    @Column(nullable = false, unique = true)
    private BigInteger flightNo;

    @Column(nullable = false)
    private String carrierName;

    @Column(nullable = false)
    private String flightModel;

    @Column(nullable = false)
    private int seatCapacity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airport_id", nullable = false)
    private Airport airport;


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(BigInteger flightNo) {
        this.flightNo = flightNo;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getFlightModel() {
        return flightModel;
    }

    public void setFlightModel(String flightModel) {
        this.flightModel = flightModel;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public void setAirport(Airport airport) { this.airport = airport; }
}
