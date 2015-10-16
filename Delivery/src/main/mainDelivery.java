package main;

import java.util.ArrayList;
import java.util.TreeMap;

import clases.*;

public class mainDelivery {

	public static void main(String[] args) {
		// Creando la coleccion de Allergen
		String[] values = { "Gluten", "shellfish", "eggs", "fish", "peanuts", "soy", "dairy", "nuts", "celery",
				"mustard", "sesame", "sulphites", "mollusk", "lupin" };
		int key = 0;
		
		//TrepMap de Allergen
		TreeMap<Integer, String> listAllergen = new TreeMap<Integer, String>();
		for (String str : values) {
			listAllergen.put(key, str);
			key++;
		}
		//ArrayList de los alergicos del pan rallado
		ArrayList<Allergen> elementAlergPan = new ArrayList<Allergen>();
		
		Ingredient panRallado = new Ingredient(3, 
		"Gallo Breadcrumbs", "grams", 395, 71.98, 13.35, 5.3, 2, elementAlergPan);
	}
	

}
