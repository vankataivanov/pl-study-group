package com.damyan.sf.coffee;

import dagger.Component;

import javax.inject.Singleton;

/**
 * @author Damyan Damyanov <damyan.damyanov@scalefocus.com>
 */
public class CoffeeApp {

    // Singleton "bean" that has a maker() method which will return an instance of CoffeeMaker
    // with dependencies satisfied by the DripCoffeeModule module.
    @Singleton
    @Component(modules = { DripCoffeeModule.class })
    public interface Coffee {
        CoffeeMaker maker();
    }

    public static void main(String[] args) {
        Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
        coffee.maker().brew();
    }
}