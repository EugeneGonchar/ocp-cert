package com.ocp.cert.ocp_cert.chapter1.inner_class;

import java.awt.List;
import java.io.Serializable;

import com.ocp.cert.ocp_cert.chapter1.inner_class.ClassWithMemberInnerClasses.NestedA.NestedB.NestedC;

public class ClassWithMemberInnerClasses {

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
	public class PublicInnerClass {

	}

	protected class ProtectedInnerClass {

	}

	class DefaultInnerClass {

	}

	@SuppressWarnings("unused")
	private class PrivateInnerClass {

	}

	// extending and implementing
	class ClassThatExtendAnotherClass extends List {
		private static final long serialVersionUID = 1L;
	}

	class ClassThatImplementsInterface implements Serializable {
		private static final long serialVersionUID = 1L;
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

	// access to fields with the same names in nested classes
	private int x = 1;

	class NestedA {
		private int x = 10;

		class NestedB {
			private int x = 20;

			class NestedC {
				private int x = 30;

				public void getNestedXs() {
					System.out.println(x);// 30
					System.out.println(this.x);// 30
					System.out.println(NestedB.this.x);// 20
					System.out.println(NestedA.this.x);// 10
					System.out.println(ClassWithMemberInnerClasses.this.x);// 1
				}
			}
		}
	}

	public static void main(String... strings) {
		AccessToOuterMembers accessToOuterMembers = new ClassWithMemberInnerClasses().new AccessToOuterMembers();
		accessToOuterMembers.checkAccess();

		NestedC nestedC = new ClassWithMemberInnerClasses().new NestedA().new NestedB().new NestedC();
		nestedC.getNestedXs();
	}
}
