import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest
{
	
	Person f;
	Person m;
	Person a;

	@BeforeEach
	void setUp() throws Exception {
		f = new Person("Old", "Fart", 81);
		m = new Person("TOO", "YOUNG", 16);
		a = new Person("Grown", "Up", 39);
	}
	
	// TEST GIT
	
	@Test
	void testMakePerson() {
		Person child1 = f.makePerson(m);
		assertNull(child1);
		
		Person child2 = f.makePerson(f);
		assertNull(child2);
		
		Person child3 = a.makePerson(f);
		assertEquals(a.getFname(),child3.getFname());
		assertEquals(f.getLname(),child3.getLname());
		assertEquals(0, child3.getAge());
	}

	@Test
	void testToString() {
		// fail("Not yet implemented");
		assertEquals(f.toString(), "[Person] Old Fart (81)");
	}

}
