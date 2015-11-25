package clases;

import java.util.ArrayList;

public class Recipe_v1 {

	int code;
	String name;
	int quantity;
	ArrayList<Ingredient_v1> ingredients;
	double kcal;
	double carbohidrates;
	double proteines;
	int fat;
	int salt;

	/*
	 * Method which returns the recipe code
	 */
	public int getCode() {
		return code;
	}

	/*
	 * Method to set the code of our recipe
	 * 
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/*
	 * Method which returns the recipe name
	 */

	public String getName() {
		return name;
	}

	/*
	 * Method which sets the recipe name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * Method which returns the recipe quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/*
	 * Method to set the quantity of our recipe
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ArrayList<Ingredient_v1> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<Ingredient_v1> ingredients) {
		this.ingredients = ingredients;
	}

	public double getKcal() {
		return kcal;
	}

	public void setKcal(double kcal) {
		this.kcal = kcal;
	}

	public double getCarbohidrates() {
		return carbohidrates;
	}

	public void setCarbohidrates(double carbohidrates) {
		this.carbohidrates = carbohidrates;
	}

	public double getProteines() {
		return proteines;
	}

	public void setProteines(double proteines) {
		this.proteines = proteines;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getSalt() {
		return salt;
	}

	public void setSalt(int salt) {
		this.salt = salt;
	}

	/*
	 * Metodo que verifica si la receta tiene alergicos
	 */
	public boolean verifyAllergen() {
		for (Ingredient_v1 ing : ingredients) {
			if (ing.getAllergens().size() != 0){
				return true;
			}
		}
		return false;
		
	}
	
}
