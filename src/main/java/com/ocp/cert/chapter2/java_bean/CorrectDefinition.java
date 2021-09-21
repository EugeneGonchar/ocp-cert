package com.ocp.cert.chapter2.java_bean;

public class CorrectDefinition {

	private String stringField;

	private boolean boolField;

	private Boolean boolObjectField;

	// public empty constructor is mandatory
	public CorrectDefinition() {

	}

	public String getStringField() {
		return stringField;
	}

	public void setStringField(String stringField) {
		this.stringField = stringField;
	}

	// also can be defined as getBoolField()
	public boolean isBoolField() {
		return boolField;
	}

	public void setBoolField(boolean boolField) {
		this.boolField = boolField;
	}

	public Boolean getBoolObjectField() {
		return boolObjectField;
	}

	// not isBoolObjectField since Boolean is object
	public void setBoolObjectField(Boolean boolObjectField) {
		this.boolObjectField = boolObjectField;
	}

	// mandatory
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (boolField ? 1231 : 1237);
		result = prime * result + ((boolObjectField == null) ? 0 : boolObjectField.hashCode());
		result = prime * result + ((stringField == null) ? 0 : stringField.hashCode());
		return result;
	}

	// mandatory
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CorrectDefinition other = (CorrectDefinition) obj;
		if (boolField != other.boolField)
			return false;
		if (boolObjectField == null) {
			if (other.boolObjectField != null)
				return false;
		} else if (!boolObjectField.equals(other.boolObjectField))
			return false;
		if (stringField == null) {
			if (other.stringField != null)
				return false;
		} else if (!stringField.equals(other.stringField))
			return false;
		return true;
	}

	// mandatory
	@Override
	public String toString() {
		return "CorrectDefinition [stringField=" + stringField + ", boolField=" + boolField + ", boolObjectField="
				+ boolObjectField + "]";
	}

}
