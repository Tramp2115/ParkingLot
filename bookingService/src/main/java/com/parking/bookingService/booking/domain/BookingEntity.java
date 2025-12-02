package com.parking.bookingService.booking.domain;

import com.parking.bookingService.booking.domain.user.UserId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class BookingEntity {

	@Id
	private Long id;

	private BookingStatus status;

	private UserId userId;

}
