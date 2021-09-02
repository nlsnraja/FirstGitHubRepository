package packageTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import package1.MyClass;

class AddTest {
	MyClass obj = new MyClass();
	@Test
	void test() {
		assertEquals(5, obj.add(2, 3));
	}
	@Test
	void test1() {
		assertNotEquals(6, obj.add(2, 3));
	}
}
