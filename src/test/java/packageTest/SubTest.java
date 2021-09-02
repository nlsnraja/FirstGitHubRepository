package packageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import package1.MyClass1;

class SubTest {
	MyClass1 obj = new MyClass1();
	@Test
	void test() {
		assertEquals(5, obj.sub(10, 5));
	}
	@Test
	void test1() {
		assertNotEquals(6, obj.sub(10, 5));
	}
}