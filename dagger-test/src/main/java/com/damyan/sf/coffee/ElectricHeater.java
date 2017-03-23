package com.damyan.sf.coffee;

/**
 * @author Damyan Damyanov <damyan.damyanov@scalefocus.com>
 */
class ElectricHeater implements Heater {
    boolean heating;

    @Override public void on() {
        System.out.println("~ ~ ~ heating ~ ~ ~");
        this.heating = true;
    }

    @Override public void off() {
        this.heating = false;
    }

    @Override public boolean isHot() {
        return heating;
    }
}