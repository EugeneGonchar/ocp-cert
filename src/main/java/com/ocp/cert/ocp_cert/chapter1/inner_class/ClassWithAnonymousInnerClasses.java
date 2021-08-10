package com.ocp.cert.ocp_cert.chapter1.inner_class;

public class ClassWithAnonymousInnerClasses {

	abstract class AbstractClass {
		public abstract void doSmth();
	}

	interface InterfaceClass {
		void doSmth();
	}

	public void methodWithAnonymousClasses() {
		// effectively final or final values can be used in local inner class
		AbstractClass abstractClass = new AbstractClass() {
			@Override
			public void doSmth() {
				System.out.println("Anonymous abstractClass");
			}
		};
		abstractClass.doSmth();

		InterfaceClass interfaceClass = new InterfaceClass() {
			@Override
			public void doSmth() {
				System.out.println("Interface class");
			}
		};
		interfaceClass.doSmth();
	}

	public void methodForCallingWithAbstractClass(AbstractClass abstractClass) {
		abstractClass.doSmth();
	}

	public static void main(String[] args) {
		ClassWithAnonymousInnerClasses classWithAnonymousInnerClasses = new ClassWithAnonymousInnerClasses();
		classWithAnonymousInnerClasses.methodWithAnonymousClasses();
		classWithAnonymousInnerClasses
				.methodForCallingWithAbstractClass(classWithAnonymousInnerClasses.new AbstractClass() {
					@Override
					public void doSmth() {
						System.out.println("Anonymous abstractClass");
					}
				});
	}

}
