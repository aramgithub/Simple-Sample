package test;
import main.App;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class AppTest {

	@Test
	public void test1() {
		byte[] command = new String("report\nexit").getBytes();
		InputStream inputStream = new ByteArrayInputStream(command);
		OutputStream outputStream = new ByteArrayOutputStream();
		App.controlLoop(inputStream, outputStream);
		String actual = outputStream.toString();
		assertEquals("> Not placed yet!\n> ", actual);	
	}
	@Test
	public void test2() {
		byte[] command = new String("place 4,4,west\nreport\nexit").getBytes();
		InputStream inputStream = new ByteArrayInputStream(command);
		OutputStream outputStream = new ByteArrayOutputStream();
		App.controlLoop(inputStream, outputStream);
		String actual = outputStream.toString();
		assertEquals("> > OUTPUT: 4,4,WEST\n> ", actual);	
	}
}
