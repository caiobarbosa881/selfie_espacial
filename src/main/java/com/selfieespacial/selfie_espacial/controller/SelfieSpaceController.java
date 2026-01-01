package com.selfieespacial.selfie_espacial.controller;

import com.selfieespacial.selfie_espacial.dto.SelfieSpaceResponse;
import com.selfieespacial.selfie_espacial.service.SelfieSpaceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/selfie-space")
public class SelfieSpaceController {

    private final SelfieSpaceService service;

    public SelfieSpaceController(SelfieSpaceService service) {
        this.service = service;
    }

    @GetMapping("/notify")
    public SelfieSpaceResponse notify(@RequestParam String city) {
        return service.notifyPassage(city);
    }
}
