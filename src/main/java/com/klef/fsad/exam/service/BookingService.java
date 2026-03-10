package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Booking;
import com.klef.fsad.exam.repository.BookingRepository;

@Service
public class BookingService 
{
    @Autowired
    BookingRepository bookingRepository;

    public Booking addBooking(Booking booking)
    {
        return bookingRepository.save(booking);
    }

    public String deleteBooking(int id)
    {
        bookingRepository.deleteById(id);
        return "Booking Deleted Successfully";
    }
}