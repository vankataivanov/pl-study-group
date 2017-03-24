package com.damyan.sf.coffee;

/**
 * @author Damyan Damyanov <damyan.damyanov@scalefocus.com>
 */
interface Heater {
    void on();
    void off();
    boolean isHot();
}