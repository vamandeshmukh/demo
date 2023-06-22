package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class HelloTests {

	@Test
	public void testHello() {
		Hello obj = new Hello();
		assertEquals("Hello world!", obj.hello());
	}

	@Test
	public void testHello2() {
		Hello obj = new Hello();
		assertNotEquals("abcd", obj.hello());
	}

	@Test
	public void test1() {
		assertEquals(10, 5 + 5);
	}

	@Test
	public void test2() {
		assertNotEquals(11, 5 + 5);
	}

}
