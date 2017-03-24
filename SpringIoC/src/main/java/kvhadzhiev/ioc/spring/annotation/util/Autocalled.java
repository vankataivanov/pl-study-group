package kvhadzhiev.ioc.spring.annotation.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * Annotate callables in your code that injected by DI container, so IntelliJ won't warn you that they are not used.
 * You need to perform one-time setting: select the light bulb around an element under warning and choose:
 * Suppress for classes annotated by kvhadzhiev.ioc.spring.annotation.util.Autocalled
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Autocalled
public @interface Autocalled {

}
