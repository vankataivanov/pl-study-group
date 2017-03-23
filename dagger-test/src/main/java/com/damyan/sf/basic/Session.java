package com.damyan.sf.basic;

import javax.inject.Inject;

/**
 * @author Damyan Damyanov <damyan.damyanov@scalefocus.com>
 */
public class Session {

    /*
     * If your class has @Inject-annotated fields but no @Inject-annotated constructor,
     * Dagger will inject those fields if requested, but will not create new instances.
     */
    @Inject
    public Data data;

}
