package List_XY;

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
		this.people.add("Xav�r");
		this.people.add("Barbara");
	}
	@Test
	public void testSize() {
		assertEquals("M�ret Ellen�rz�s", 5, this.people.size());
		}
	@Test
	public void testEmpty() {
		assertFalse(this.people.isEmpty());
	}
	@Test
	public void testAdd() {
		this.people.add("Vilma");
		assertEquals("�j n�v hozz�ad�s�nak ellen�rz�se",6,this.people.size());
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
