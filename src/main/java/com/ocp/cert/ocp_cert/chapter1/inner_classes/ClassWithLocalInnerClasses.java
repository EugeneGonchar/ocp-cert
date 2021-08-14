package com.ocp.cert.ocp_cert.chapter1.inner_classes;

public class ClassWithLocalInnerClasses {

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

	public void methodWithLocalInnerClass() {

		// effectively final or final values can be used in local inner class
		Integer x = 12;
		final Integer y = 78;
		// x = 13;// after that x will not be effectively final variable because
		// reference will be changed

		// cannot have access modifiers
		// cannot have static modifier
		// cannot declare static fields and methods
		// cannot have access to not final variables declared in method
		// have access to all fields and methods of outer class
		final class LocalInnerClass {

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
				System.out.println(x);
				System.out.println(y);
			}

		}
		new LocalInnerClass().checkAccess();
	}

	public static void main(String[] args) {
		ClassWithLocalInnerClasses classWithLocalInnerClasses = new ClassWithLocalInnerClasses();
		classWithLocalInnerClasses.methodWithLocalInnerClass();
	}

}
