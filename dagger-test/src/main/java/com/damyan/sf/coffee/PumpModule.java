package com.damyan.sf.coffee;

import dagger.Binds;
import dagger.Module;

/**
 * @author Damyan Damyanov <damyan.damyanov@scalefocus.com>
 */
@Module
abstract class PumpModule {

    // @Binds methods are a drop-in replacement for Provides methods that simply return an injected parameter.
    // Prefer @Binds because the generated implementation is likely to be more efficient.
    @Binds
    abstract Pump providePump(Thermosiphon pump);
}