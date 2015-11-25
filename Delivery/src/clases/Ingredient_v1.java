package clases;

import java.util.HashSet;
import java.util.List;

public class Ingredient_v1 {

	int code;
	String name;
	String measuring;
	double kcal;
	double carbohidrates;
	double proteines;
	double fat;
	double salt;
	HashSet<Allergen_v1> allergens;

	/*
	 * constructor
	 */
	public Ingredient_v1(int code, String name, String measuring, double kcal, double carbohidrates, double proteines,
			double fat, double salt, HashSet<Allergen_v1> allergens) {
		super();
		this.code = code;
		this.name = name;
		this.measuring = measuring;
		this.kcal = kcal;
		this.carbohidrates = carbohidrates;
		this.proteines = proteines;
		this.fat = fat;
		this.salt = salt;
		this.allergens = allergens;
	}

	public Ingredient_v1() {
	}

	// Setter's and Getter's
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMeasuring() {
		return measuring;
	}

	public void setMeasuring(String measuring) {
		this.measuring = measuring;
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

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getSalt() {
		return salt;
	}

	public void setSalt(double salt) {
		this.salt = salt;
	}

	public HashSet<Allergen_v1> getAllergens() {
		return allergens;
	}

	public void setAllergens(HashSet<Allergen_v1> allergens) {
		this.allergens = allergens;
	}

	@Override
	public String toString() {
		return "Ingredient [code = " + code + ", name = " + name + ", measuring = " + measuring + ", kcal = " + kcal
				+ ", Carbohidrates = " + carbohidrates + ", proteines = " + proteines + ", fat = " + fat + ", salt = "
				+ salt + ", allergens = " + allergens + " ] ";
	}

	/*
	 * searchByCode
	 * 
	 * @param a is a List of Ingredient.
	 * 
	 * @param code is Integer, It's the code to search.
	 * 
	 * @return String, It's full ingredient according to the code.
	 */
	public String searchByCode(HashSet<Ingredient_v1> listIngredient, int code) {
	/*	for (int i = 0; i < listIngredient.size(); i++) {
			if (listIngredient.get(i).getCode() == code) {
				return listIngredient.get(i).toString();
			}
		}
		return ("The code doesn't appear in the list");
*/
		
		for (Ingredient_v1 ing : listIngredient) {
			if (ing.getCode() == code){
				return  ing.toString();
			}
		}
		return null;
	}

	/*
	 * Method which retrieves full ingredient according to the name
	 */
	public String searchByName(HashSet<Ingredient_v1> listIngredient, String name) {
		/*for (int i = 0; i < listIngredient.size(); i++) {
			if (listIngredient.get(i).getName() == name) {
				return listIngredient.get(i).toString();
			}
		}
		return ("The name doesn't appear in the list");
	*/
		
		for (Ingredient_v1 ing : listIngredient) {
			if (ing.getName().equals(name)){
				return ing.toString();
			}
		}
		return null;
	}

	// Method which returns if an ingredient contains one Allergen to verify it
	// //
	public boolean containAllergen(Allergen_v1 aller) {
		if (this.allergens.contains(aller)) {
			return true;
		}
		return false;
	}

}
