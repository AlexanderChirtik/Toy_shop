package org.example;

import org.example.Interfaces.WeightChoose;

import java.util.List;

class RandomToyChooser implements WeightChoose {
    public Toy chooseOnWeight(List<Toy> toys) {
        double completeWeight = 0.0;
        for (Toy toy : toys)
            completeWeight += toy.getWeight();
        double r = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (Toy toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight >= r)
                return toy;
        }
        throw new RuntimeException("Should never be shown");
    }
}
