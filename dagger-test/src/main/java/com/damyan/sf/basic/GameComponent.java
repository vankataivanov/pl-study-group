package com.damyan.sf.basic;

import dagger.Component;

/**
 * Component is an interface that Dagger will use to generate the code that will do the dependency injection for you.
 *
 * @author Damyan Damyanov <damyan.damyanov@scalefocus.com>
 */
// modules = dependencies
@Component(modules = GameModule.class)
public interface GameComponent {
    void inject(Session obj);
}
