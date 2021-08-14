package in.co.sunrays.proj4.exception;

/**
 * ApplicationException is propogated from Service classes when an business
 * logic exception occurred.
 * 
 * @author Proxy
 * @version 1.0
 * Copyright (c) Proxy
 * 
 */
public class ApplicationException extends Exception {

    /**
	 * Default Serial Version ID
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @param msg
     *            : Error message
     */
    public ApplicationException(String msg) {
        super(msg);
    }
}