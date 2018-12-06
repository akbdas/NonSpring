package searlization;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SeralizableTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	String test = "fjkdjfkdsfkdsf";

	public Object readResolve() {
		System.out.println("eTest readResolve");
		return this;

	}

	private void writeObject(ObjectOutputStream s) throws IOException {
		System.out.println("eTest writeObject");
		s.defaultWriteObject();
		// return null;

	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

}
