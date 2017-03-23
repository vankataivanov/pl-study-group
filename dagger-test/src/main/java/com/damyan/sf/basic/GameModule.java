package com.damyan.sf.basic;

import dagger.Module;
import dagger.Provides;

/**
 * Module specifies all the providers of the injection, in our case, we define a Provider that provides a new Data().
 *
 * @author Damyan Damyanov <damyan.damyanov@scalefocus.com>
 */
@Module
public class GameModule {

    @Provides
    Data providesData() {
        return new Data();
    }

}
