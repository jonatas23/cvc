package com.teste.cvc.initializer;

import com.teste.cvc.model.Hotel;
import com.teste.cvc.model.Price;
import com.teste.cvc.model.Room;
import com.teste.cvc.service.HotelService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class DataLoader {

    private final HotelService hotelService;

    @Autowired
    public DataLoader(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostConstruct
    public void initializeData() {
        hotelService.addHotel(createHotel("Hotel Teste 1", 1032L, "Porto Seguro", "Standard", 1372.54, 848.61));
        hotelService.addHotel(createHotel("Hotel Teste 2", 7110L, "Rio de Janeiro", "Deluxe", 2000.0, 1200.0));
        hotelService.addHotel(createHotel("Hotel Teste 3", 9626L, "São Paulo", "Suite", 2500.0, 1500.0));
    }

    private Hotel createHotel(String name, Long cityCode, String cityName, String categoryName, Double adultPrice, Double childPrice) {
        return Hotel.builder()
                .name(name)
                .cityCode(cityCode)
                .cityName(cityName)
                .rooms(Collections.singletonList(
                        Room.builder()
                                .categoryName(categoryName)
                                .price(Price.builder().adult(adultPrice).child(childPrice).build())
                                .build()
                ))
                .build();
    }
}
