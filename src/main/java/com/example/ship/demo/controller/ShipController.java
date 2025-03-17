package com.example.ship.demo.controller;

import com.example.ship.demo.service.ShipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ship")
public class ShipController {
    private final ShipService shipService;

    public ShipController(ShipService shipService) {
        this.shipService = shipService;
    }

    @GetMapping("/getCurrentCordinates")
    public List<Integer> getCurrentCordinate() {
        return shipService.getCordinates();
    }

    @GetMapping("/moveShip")
    public List<Integer> getCurrentCordinate(@RequestParam String action) {
        return shipService.moveShip(action);
    }

}
