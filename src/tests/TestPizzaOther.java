/**
 * @author Elijah Edlund - ezedlund
 * CIS175 - Fall 2021
 * Sep 2, 2022
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Pizza;

public class TestPizzaOther {

	@Before
	public void setUp() throws Exception {
	}

	// test setters and getters
	@Test
	public void testSet() {
		Pizza pizza = new Pizza();

		// SIZE
		// small
		pizza.setPizzaSize("S");
		assertEquals("S", pizza.getPizzaSize());
		// medium
		pizza.setPizzaSize("M");
		assertEquals("M", pizza.getPizzaSize());
		// large
		pizza.setPizzaSize("L");
		assertEquals("L", pizza.getPizzaSize());

		// TOPPING
		// none
		pizza.setTopping("none");
		assertEquals("none", pizza.getTopping());
		// pepperoni
		pizza.setTopping("pepperoni");
		assertEquals("pepperoni", pizza.getTopping());
		// bacon
		pizza.setTopping("bacon");
		assertEquals("bacon", pizza.getTopping());

		// SAUCE
		// true
		pizza.setSauce(true);
		assertTrue(pizza.isSauce());
		// false
		pizza.setSauce(false);
		assertFalse(pizza.isSauce());
	}

	// Test printing
	@Test
	public void testPrint() {
		Pizza pizza = new Pizza("S", "pepperoni", true);

		// with sauce
		assertEquals("S pepperoni pizza with sauce.", pizza.printInfo());

		// without sauce
		pizza.setPizzaSize("M");
		pizza.setTopping("bacon");
		pizza.setSauce(false);
		assertEquals("M bacon pizza without sauce.", pizza.printInfo());
	}

}
