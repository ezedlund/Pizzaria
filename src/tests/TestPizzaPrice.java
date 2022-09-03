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

public class TestPizzaPrice {

	@Before
	public void setUp() throws Exception {
	}

	// test size pricing
	@Test
	public void testSizePrice() {
		Pizza pizza = new Pizza("S", "pepperoni", true);

		// Test small pizza
		assertEquals(8, pizza.calcPrice(), 0.0);

		// Test medium pizza
		pizza.setPizzaSize("M");
		assertEquals(9, pizza.calcPrice(), 0.0);

		// Test large pizza
		pizza.setPizzaSize("L");
		assertEquals(10, pizza.calcPrice(), 0.0);
	}

	// test topping pricing
	@Test
	public void testToppingPrice() {
		Pizza pizza = new Pizza("S", "none", true);

		// no topping
		assertEquals(7, pizza.calcPrice(), 0.0);

		// pepperoni
		pizza.setTopping("pepperoni");
		assertEquals(8, pizza.calcPrice(), 0.0);

		// bacon
		pizza.setTopping("bacon");
		assertEquals(10, pizza.calcPrice(), 0.0);
	}

	// test sauce pricing
	@Test
	public void testSaucePrice() {
		Pizza pizza = new Pizza("S", "none", true);

		// sauce
		assertEquals(7, pizza.calcPrice(), 0.0);

		// no sauce
		pizza.setSauce(false);
		assertEquals(6, pizza.calcPrice(), 0.0);
	}

}
