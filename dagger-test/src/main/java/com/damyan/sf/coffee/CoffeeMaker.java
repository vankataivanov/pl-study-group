package com.damyan.sf.coffee;

import dagger.Lazy;

import javax.inject.Inject;

/**
 * @author Damyan Damyanov <damyan.damyanov@scalefocus.com>
 */
class CoffeeMaker {
    private final Lazy<Heater> heater; // Create a possibly costly heater only when we use it.
    private final Pump pump;

    /*
     * Use @Inject to annotate the constructor that Dagger should use to create instances of a class.
     * When a new instance is requested, Dagger will obtain the required parameters values and invoke this constructor.
     */
    @Inject
    CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.get().on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.get().off();
    }
}