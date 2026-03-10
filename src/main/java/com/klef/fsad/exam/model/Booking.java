package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name="booking_table")

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Booking
{
    @Id
    private int bookingId;

    private String name;
    private String date;
    private String status;
    private String location;
}