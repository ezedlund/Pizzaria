/**
 * @author Elijah Edlund - ezedlund
 * CIS175 - Fall 2021
 * Sep 2, 2022
 */
package model;

public class Pizza {
	private String pizzaSize;
	private String topping;
	private boolean sauce;

	// default constructor
	public Pizza() {
	}

	// constructor
	public Pizza(String pizzaSize, String topping, boolean sauce) {
		this.pizzaSize = pizzaSize;
		this.topping = topping;
		this.sauce = sauce;
	}

	// calculate pizza price
	// size options S, M, L
	// topping options pepperoni, bacon, cheese
	// sauce options yes or no
	public double calcPrice() {
		double total = 0;

		// size price
		if (pizzaSize == "S") {
			total = 6;
		} else if (pizzaSize == "M") {
			total = 7;
		} else {
			total = 8;
		}

		// Add topping price
		if (topping == "pepperoni") {
			total += 1;
		} else if (topping == "bacon") {
			total += 3;
		}

		// sauce price
		if (sauce == true) {
			total += 1;
		}

		return total;
	}

	// print info
	public String printInfo() {
		if (sauce == true) {
			return pizzaSize + " " + topping + " pizza with sauce.";
		} else {
			return pizzaSize + " " + topping + " pizza without sauce.";
		}
	}

	// get size
	public String getPizzaSize() {
		return pizzaSize;
	}

	// set size
	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	// get topping
	public String getTopping() {
		return topping;
	}

	// set topping
	public void setTopping(String topping) {
		this.topping = topping;
	}

	// get sauce
	public boolean isSauce() {
		return sauce;
	}

	// set sauce
	public void setSauce(boolean sauce) {
		this.sauce = sauce;
	}

}
