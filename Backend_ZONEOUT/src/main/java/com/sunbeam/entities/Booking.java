package com.sunbeam.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter 
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "booking")
public class Booking extends BaseEntity{
	@Column(name = "booking_date")
	private LocalDate bookingDate;
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "turf_id")
    private Turf turf;
    @ManyToOne
    @JoinColumn(name = "slot_id")
    private Slot slot;
    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL, orphanRemoval = true)
    private Payment payment;
}
