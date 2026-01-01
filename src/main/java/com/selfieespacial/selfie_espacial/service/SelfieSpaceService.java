package com.selfieespacial.selfie_espacial.service;

import com.selfieespacial.selfie_espacial.dto.SelfieSpaceResponse;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Service
public class SelfieSpaceService {
    private static final String[] DIRECTIONS = {
            "norte", "sul", "leste", "oeste",
            "nordeste", "noroeste", "sudeste", "sudoeste"
    };

    public SelfieSpaceResponse notifyPassage(String city) {
        int minutes = new Random().nextInt(10) + 1;
        String direction = DIRECTIONS[new Random().nextInt(DIRECTIONS.length)];

        LocalTime passageTime = LocalTime.now().plusMinutes(minutes);
        String formattedTime = passageTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        return new SelfieSpaceResponse(
                "🛰️ O satélite vai te ver agora!",
                "Um satélite vai passar sobre " + city + " em " + minutes + " minutos.",
                "Olhe para o céu na direção " + direction + ".",
                formattedTime
        );

    }


    }