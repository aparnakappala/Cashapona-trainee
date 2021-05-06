package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
	// some booking repository methods

	@Query(value = "SELECT * FROM bookings bs WHERE "
			+ "EXISTS (SELECT 1 FROM customer c WHERE bs.customer_id = c.id AND c.phone = :phone) "
			+ "AND EXISTS (SELECT 1 FROM books b WHERE b.id = bs.book_id AND b.author IN :authors)", nativeQuery = true)
	List<Booking> queryBy(@Param("phone") String phone, @Param("authors") List<String> authors);
}