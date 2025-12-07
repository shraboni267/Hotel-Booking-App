package com.spring.smart_stay_hotel.service;

import com.spring.smart_stay_hotel.exception.InternalServerException;
import com.spring.smart_stay_hotel.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface RoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws SQLException, IOException;

    List<String> getAllRoomTypes();

    List<Room> getAllRooms();

    byte[] getRoomPhotoByRoomId(Long roomId) throws SQLException;

    void deleteRoom(Long roomId);

    Room update(Long roomId, String roomType, BigDecimal roomPrice, byte[] photoBytes) throws InternalServerException;

    Optional<Room> getRoomById(Long roomId);
}
