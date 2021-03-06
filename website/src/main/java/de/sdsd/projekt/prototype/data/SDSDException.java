package de.sdsd.projekt.prototype.data;

/**
 * SDSD application exceptions to report to the user.
 *
 * @author <a href="mailto:48514372+julianklose@users.noreply.github.com">Julian Klose</a>
 */
public class SDSDException extends Exception {

	private static final long serialVersionUID = -6292892240964590528L;

	public SDSDException(String message) {
		super(message);
	}
	
	public SDSDException(String message, Throwable cause) {
		super(message, cause);
	}
}