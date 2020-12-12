package List_XY; // https://www.youtube.com/watch?v=TpvEqvSx4aI&list=PLyriihBWoulxmMv3x05WHs8R12WfCdqfH&index=3 videó alapján

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;


public class ListTest {

	private List people= new List();
	@Before
	public void init() {
		this.people.add("Andor");
		this.people.add("Elza");
		this.people.add("Vivien");
		this.people.add("Xavér");
		this.people.add("Barbara");
	}
	@Test
	public void testSize() {
		assertEquals("Méret Ellenõrzés", 5, this.people.size());
		}
	@Test
	public void testEmpty() {
		assertFalse(this.people.isEmpty());
	}
	@Test
	public void testAdd() {
		this.people.add("Vilma");
		assertEquals("Új név hozzáadásának ellenõrzése",6,this.people.size());
	}
	@Test
	public void testremoveAll() {
		this.people.removeAll();
		assertTrue(this.people.isEmpty());
		}
	@After
	public void destroy(){
		this.people.removeAll();
	}
}
