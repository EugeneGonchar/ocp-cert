package com.ocp.cert.ocp_cert.chapter2.polymorphism;

public class PolymorphismExample {

	public class Parent {

	}

	public class Child extends Parent {

	}

	public class ChildOfChild extends Child {

	}

	public class EnoughClassesPlease extends ChildOfChild {

	}

	public class SiblingOfChild extends Parent {

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Parent parent = new PolymorphismExample().new ChildOfChild();
		Child child = (Child) parent;
		ChildOfChild childOfChild = (ChildOfChild) child;

		// compile error since Sibling exists in another branch of hierarchy
		// SiblingOfChild siblingOfChild = (SiblingOfChild) child;

		// runtime exception
		EnoughClassesPlease enoughClassesPlease = (EnoughClassesPlease) child;
	}

}
