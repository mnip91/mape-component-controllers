package org.objectweb.proactive.extra.component.mape.utils;

import java.io.Serializable;

public class Wrapper<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private T t;

	public Wrapper(T element) {
		t = element;
	}

	public T get() {
		return t;
	}

}
