package com.singtel.assignment.service;

import com.singtel.assignment.model.AnimalType;
import com.singtel.assignment.model.Bird;
import com.singtel.assignment.model.Fish;
import com.singtel.assignment.model.Parent;
import com.singtel.assignment.model.animals.*;
import com.singtel.assignment.model.birds.Chicken;
import com.singtel.assignment.model.birds.Duck;
import com.singtel.assignment.model.birds.Parrot;
import com.singtel.assignment.model.birds.Rooster;
import com.singtel.assignment.model.fish.Clownfish;
import com.singtel.assignment.model.fish.Dolphin;
import com.singtel.assignment.model.fish.Shark;
import com.singtel.assignment.utils.CountAnimals;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    public int getAnimalWalkableCount(String animals){
        if(StringUtils.isNotEmpty(animals) && animals.contains(",")){
            Parent[] vertebrates = populateAnimals(animals);
            return CountAnimals.walkableCount(vertebrates);
        }
        return 0;
    }

    private Parent[] populateAnimals(String animals) {
        String[] animalArray = animals.split(",");
        Parent[] vertebrates = new Parent[animalArray.length];
        for(int i = 0; i < animalArray.length; i++){
            switch(AnimalType.valueOf(animalArray[i].toUpperCase())) {
                case BUTTERFLY:
                    vertebrates[i] = new Butterfly();
                    break;
                case CAT:
                    vertebrates[i] = new Cat();
                    break;
                case CATERPILLAR:
                    vertebrates[i] = new Caterpillar();
                    break;
                case DOG:
                    vertebrates[i] = new Dog();
                    break;
                case FROG:
                    vertebrates[i] = new Frog();
                    break;
                case CHICKEN:
                    vertebrates[i] = new Chicken();
                    break;
                case DUCK:
                    vertebrates[i] = new Duck();
                    break;
                case PARROT:
                    vertebrates[i] = new Parrot();
                    break;
                case ROOSTER:
                    vertebrates[i] = new Rooster();
                    break;
                case CLOWNFISH:
                    vertebrates[i] = new Clownfish();
                    break;
                case DOLPHIN:
                    vertebrates[i] = new Dolphin();
                    break;
                case SHARK:
                    vertebrates[i] = new Shark();
                    break;
                case BIRD:
                    vertebrates[i] = new Bird();
                    break;
                case FISH:
                    vertebrates[i] = new Fish();
                    break;
                default:
                    break;
            }
        }
        return vertebrates;
    }

}
