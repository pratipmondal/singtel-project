package com.singtel.assignment.controller;

import com.singtel.assignment.service.AnimalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> getAnimalWalkableCount(@RequestParam(value = "animals", required = true) String animals) {
        return ResponseEntity.ok(animalService.getAnimalWalkableCount(animals));
    }

    @GetMapping(
            path = "flyableCount",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    @ApiOperation(value = "Get all flyableCount of animals")
    public ResponseEntity<?> getAnimalFlyableCount(@RequestParam(value = "animals", required = true) String animals) {
        return ResponseEntity.ok(animalService.getAnimalFlyableCount(animals));
    }

    @GetMapping(
            path = "singableCount",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    @ApiOperation(value = "Get all singableCount of animals")
    public ResponseEntity<?> getAnimalSingableCount(@RequestParam(value = "animals", required = true) String animals) {
        return ResponseEntity.ok(animalService.getAnimalSingableCount(animals));
    }

    @GetMapping(
            path = "swimmableCount",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    @ApiOperation(value = "Get all swimmableCount of animals")
    public ResponseEntity<?> getAnimalSwimmableCount(@RequestParam(value = "animals", required = true) String animals) {
        return ResponseEntity.ok(animalService.getAnimalSwimmableCount(animals));
    }
}
