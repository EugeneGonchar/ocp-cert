package com.ocp.cert.ocp_cert.chapter1.inner_class;

import java.awt.List;
import java.io.Serializable;

public class ClassWithInnerClasses {

	public int a = 1;
	protected int b = 2;
	int c = 3;
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

	private void doD() {
		System.out.println("doD");
	}

	public void doStaticA() {
		System.out.println("doStaticA");
	}

	protected void doStaticB() {
		System.out.println("doStaticB");
	}

	void doStaticC() {
		System.out.println("doStaticC");
	}

	private void doStaticD() {
		System.out.println("doStaticD");
	}

	// access modifiers
	public class PublicInnerClass {

	}

	protected class ProtectedInnerClass {

	}

	class DefaultInnerClass {

	}

	private class PrivateInnerClass {

	}

	// extending and implementing
	class ClassThatExtendAnotherClass extends List {

		private static final long serialVersionUID = 1L;

	}

	class ClassThatImplementsInterface implements Serializable {

	}

	// abstract and final
	abstract class AbstractClass {

	}

	final class FinalClass {

	}

	// declaring static fields and methods
	class ClassWithStaticMembers {

		// compile error
		// public static String a = "a";

		// compile error
//		public static void staticMethod() {
//			
//		}

	}

	// access to members of outer class
	class AccessToOuterMembers {

		public void checkAccess() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			doA();
			doB();
			doC();
			doD();
			doStaticA();
			doStaticB();
			doStaticC();
			doStaticD();
		}

	}

	public static void main(String... strings) {
		AccessToOuterMembers accessToOuterMembers = new ClassWithInnerClasses().new AccessToOuterMembers();
		accessToOuterMembers.checkAccess();
	}
}
