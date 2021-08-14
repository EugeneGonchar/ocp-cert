package com.ocp.cert.chapter1.inner_classes;

import java.awt.List;
import java.io.Serializable;

public class ClassWithStaticNestedClasses {

	public int a = 1;
	protected int b = 2;
	int c = 3;
	@SuppressWarnings("unused")
	private int d = 4;

	public void doA() {
		System.out.println("doA");
	}

	protected void doB() {
		System.out.println("doB");
	}

	void doC() {
		System.out.println("doC");
	}

	@SuppressWarnings("unused")
	private void doD() {
		System.out.println("doD");
	}

	public static void doStaticA() {
		System.out.println("doStaticA");
	}

	protected static void doStaticB() {
		System.out.println("doStaticB");
	}

	static void doStaticC() {
		System.out.println("doStaticC");
	}

	private static void doStaticD() {
		System.out.println("doStaticD");
	}

	// access modifiers
	public static class PublicNestedClass {

	}

	protected static class ProtectedNestedClass {

	}

	static class DefaultNestedClass {

	}

	@SuppressWarnings("unused")
	private class PrivateNestedClass {

	}

	// extending and implementing
	static class ExtendableNestedClass extends List {
		private static final long serialVersionUID = 1L;
	}

	static class ImplementableNestedClass implements Serializable {
		private static final long serialVersionUID = 1L;
	}

	// final, abstract
	final static class FinalNestedClass {

	}

	abstract static class AbstractNestedClass {

	}

	// can declare static fields and methods
	static class NestedClassWithStaticMembers {
		static int a = 1;

		public static void a() {

		}
	}

	// access to outer fields and methods
	// has access only to static fields and methods
	static class AccessToOuterMembers {

		public void checkAccess() {
//			System.out.println(a);// no
//			System.out.println(b);// no
//			System.out.println(c);// no
//			System.out.println(d);// no
//			doA();// no
//			doB();// no
//			doC();// no
//			doD();// no
			doStaticA();
			doStaticB();
			doStaticC();
			doStaticD();
		}

	}

	// it's possible to import static class using usual import as well as static
	// import
}
