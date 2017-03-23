package com.damyan.sf.coffee;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * @author Damyan Damyanov <damyan.damyanov@scalefocus.com>
 */
@Module(includes = PumpModule.class)
class DripCoffeeModule {

    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}