package com.ocp.cert.chapter3.generics;

public interface GenericInterface<T> {

	public void doSmth(T object);

	// it's possible to create generic class that implements generic interface
	public class GenericClass<U> implements GenericInterface<U> {
		@Override
		public void doSmth(U object) {

		}
	}

	// it's possible to use the same generic name
	public class GenericClassT<T> implements GenericInterface<T> {
		@Override
		public void doSmth(T object) {

		}
	}

	// it's possible to use concrete class
	public class GenericClassString implements GenericInterface<String> {
		@Override
		public void doSmth(String object) {

		}
	}

	// old way to implements generic interface
	public class GenericClassOld implements GenericInterface {
		@Override
		public void doSmth(Object object) {

		}
	}

}
