package com.spring.smart_stay_hotel.repository;


import com.spring.smart_stay_hotel.model.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookedRoom, Long> {


    List<BookedRoom> findByRoomId(Long roomId);

    void deleteById(Long bookingId);

    List<BookedRoom> findAll();

    BookedRoom findByBookingConfirmationCode(String confirmationCode);
}
