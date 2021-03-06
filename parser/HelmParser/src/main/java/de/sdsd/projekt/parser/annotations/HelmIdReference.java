package de.sdsd.projekt.parser.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation the be used for referencing ID attributes inside CSV mapping
 * classes.
 * 
 * @author <a href="mailto:andreas.schliebitz@hs-osnabrueck.de">Andreas
 *         Schliebitz</a>
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface HelmIdReference {
	public Class<?> value();
}