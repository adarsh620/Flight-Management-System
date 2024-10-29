package com.pjsoft.fms.service;

import com.pjsoft.fms.exception.ResourceNotFoundException;
import com.pjsoft.fms.model.Booking;
import com.pjsoft.fms.model.Passanger;
import com.pjsoft.fms.repository.BookingRepository;
import com.pjsoft.fms.repository.PassangerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassangerService {
    @Autowired
    private PassangerRepository passangerRepository;
    private static final Logger logger = LoggerFactory.getLogger(PassangerService.class);
    public List<Passanger> getAllPassangers() {
        return passangerRepository.findAll();
    }

    public Passanger getPassangerById(Long id) {
        logger.debug("inside getPassangerById");
        return passangerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found with id: " + id));
    }

    public Passanger savePassanger(Passanger passanger) {
        return passangerRepository.save(passanger);
    }

    public void deletePassanger(Long id) {
        passangerRepository.deleteById(id);
    }
}