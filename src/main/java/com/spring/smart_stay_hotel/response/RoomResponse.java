package com.spring.smart_stay_hotel.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
public class RoomResponse {

    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private String roomDescription;
    private boolean isBooked = false;

    private String photo;

    private List<BookingResponse> bookings;


    public RoomResponse(Long id, String roomType, BigDecimal roomPrice) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }


    public RoomResponse(Long id, String roomType, BigDecimal roomPrice,
                        String roomDescription, boolean isBooked, byte [] photoBytes) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomDescription = roomDescription;
        this.isBooked = isBooked;
        this.photo = null != photoBytes ? Base64.encodeBase64String(photoBytes) : null;
        //this.bookings = bookings;
    }

}
