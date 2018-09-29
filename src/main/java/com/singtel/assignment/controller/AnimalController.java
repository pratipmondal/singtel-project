package com.singtel.assignment.controller;

import com.singtel.assignment.service.AnimalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animal/api/v1/")
@Api(value = "Services for Animals")
public class AnimalController {
    private AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping(
            path = "walkableCount",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    @ApiOperation(value = "Get all walkableCount of animals")
    public int getAnimalWalkableCount(@RequestParam(value = "animals", required = true) String animals) {
        return animalService.getAnimalWalkableCount(animals);
    }
}
