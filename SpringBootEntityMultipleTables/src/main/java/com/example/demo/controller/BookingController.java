package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Booking;
import com.example.demo.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	@Autowired
	BookingService bookingService;

	// some booking apis which return Booking objects

	@GetMapping("/get")
	public List<Booking> getAllBookingsBy(@RequestParam("phone") String phone,
			@RequestParam("authors") List<String> authors) {
		return bookingService.getAllBy(phone, authors);
	}

	@PostMapping("/post")
	public Booking addBooking(@RequestBody Booking booking) {
		bookingService.saveBooking(booking);
		return booking;
	}
}