package searlization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClass {

	public static void main(String[] args) throws Exception {
		SeralizableTest obj = new SeralizableTest();
		System.out.println(obj.getTest());

		FileOutputStream fileOutputStream = new FileOutputStream("c:\\temp\\fileS.txt");
		// BufferedOutputStream buffer = new
		// BufferedOutputStream(fileOutputStream);

		ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

		oos.writeObject(obj);

		oos.flush();
		oos.close();

		FileInputStream fileInputStream = new FileInputStream("c:\\temp\\fileS.txt");

		// BufferedInputStream bufferedInputStream=new
		// BufferedInputStream(fileInputStream);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		SeralizableTest obj1 = (SeralizableTest) objectInputStream.readObject();

		System.out.println(obj1.getTest());
		objectInputStream.close();

	}
}
