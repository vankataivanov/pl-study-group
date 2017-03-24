package com.damyan.sf.coffee;

import javax.inject.Inject;

/**
 * @author Damyan Damyanov <damyan.damyanov@scalefocus.com>
 */
class Thermosiphon implements Pump {
    private final Heater heater;

    /*
     * Use @Inject to annotate the constructor that Dagger should use to create instances of a class.
     * When a new instance is requested, Dagger will obtain the required parameters values and invoke this constructor.
     */
    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}