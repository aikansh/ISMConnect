/**
 * 
 */
package com.ismconnect.util;

import com.google.appengine.repackaged.com.google.api.client.util.Strings;

/**
 * @author aikanshg
 *
 */
public class Validation {

	/**
	 * @param o
	 */
	public static void validateNotNull(Object o) {
		if (o == null) {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * @param o
	 */
	public static String validateString(String o) {
		if (Strings.isNullOrEmpty(o)) {
			throw new IllegalArgumentException();
		}
		return o;
	}

}
