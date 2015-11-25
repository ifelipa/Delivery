package clases;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

import org.joda.time.DateTime;


public class Recipe {



	int code;
	String name;
	int quantity;
	ArrayList<String> ingredients;
	double kcal;
	double carbohidrates;
	double proteines;
	int fat;
	int salt;
	ArrayList<Allergen> allergens;
	String cuisine;
	//TreeSet <String> cuisine;
	Date dataCreacion;
	
	//	TreeSet <Recipe> llista();
	
	
	//constructors
	public Recipe(int code, String name, int quantity, ArrayList<String> ingredients, double kcal,
			double carbohidrates, double proteines, int fat, int salt, ArrayList<Allergen> allergens,
			String cuisine) {
		super();
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.ingredients = ingredients;
		this.kcal = kcal;
		this.carbohidrates = carbohidrates;
		this.proteines = proteines;
		this.fat = fat;
		this.salt = salt;
		this.allergens = allergens;
		this.cuisine = cuisine;
		this.dataCreacion = new Date();
	}
	
	
	public Recipe() {
		super();
	}


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
	 *	Method which sets the recipe name 
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
	
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<String> ingredients) {
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
	public ArrayList<Allergen> getAllergens() {
		return allergens;
	}
	public void setAllergens(ArrayList<Allergen> allergens) {
		this.allergens = allergens;
	}
	
	
	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public Date getDataCreacion() {
		return dataCreacion;
	}

	public void setDataCreacion(Date dataCreacion) {
		this.dataCreacion = dataCreacion;
	}
	public TreeSet<Recipe> getLlista() {
		return llista;
	}

	public void setLlista(TreeSet<Recipe> llista) {
		this.llista = llista;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allergens == null) ? 0 : allergens.hashCode());
		long temp;
		temp = Double.doubleToLongBits(carbohidrates);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + code;
		result = prime * result + ((cuisine == null) ? 0 : cuisine.hashCode());
		result = prime * result + ((dataCreacion == null) ? 0 : dataCreacion.hashCode());
		result = prime * result + fat;
		result = prime * result + ((ingredients == null) ? 0 : ingredients.hashCode());
		temp = Double.doubleToLongBits(kcal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(proteines);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		result = prime * result + salt;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		if (allergens == null) {
			if (other.allergens != null)
				return false;
		} else if (!allergens.equals(other.allergens))
			return false;
		if (Double.doubleToLongBits(carbohidrates) != Double.doubleToLongBits(other.carbohidrates))
			return false;
		if (code != other.code)
			return false;
		if (cuisine == null) {
			if (other.cuisine != null)
				return false;
		} else if (!cuisine.equals(other.cuisine))
			return false;
		if (dataCreacion == null) {
			if (other.dataCreacion != null)
				return false;
		} else if (!dataCreacion.equals(other.dataCreacion))
			return false;
		if (fat != other.fat)
			return false;
		if (ingredients == null) {
			if (other.ingredients != null)
				return false;
		} else if (!ingredients.equals(other.ingredients))
			return false;
		if (Double.doubleToLongBits(kcal) != Double.doubleToLongBits(other.kcal))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(proteines) != Double.doubleToLongBits(other.proteines))
			return false;
		if (quantity != other.quantity)
			return false;
		if (salt != other.salt)
			return false;
		return true;
	}
	
	/*
	 * Print recipe
	 */
	@Override
	public String toString(){
		return this.code + this.name + this.quantity + this.ingredients + this.kcal + this.carbohidrates + this.proteines + this.fat + this.salt + this.allergens;
	}
	//canviar els paramtres de sortida i els parametres de entrada
	//crear llista dev receptes segons pais(atribut cuisine)
	public static void llistaCuisine(TreeMap<String, Recipe> map) {
		//public static void llistaCuisine (TreeSet <String> set){ 
		 SortedMap<String,ArrayList<Recipe>> arrayReceptes = new TreeMap<String,ArrayList<Recipe>>();
		
		 ArrayList<String> llistaCountry =new ArrayList<String>();
		 Recipe r= new Recipe();
		 for (Map.Entry entry : map.entrySet()){
			 ArrayList <Recipe> llistaReceptes = new ArrayList<Recipe>();
			 r= (Recipe)entry.getValue(); 
			 String country=(String)entry.getKey();
			 llistaCountry.add(country);
			 String pais=r.getCuisine().toString();
			 llistaReceptes.add(r);
			 arrayReceptes.put(pais,llistaReceptes);
			 //llegir el array de marques
			 for(Map.Entry entry4 : arrayReceptes.entrySet()){
				 if(entry4.getKey().equals(pais)){ 
			    	llistaReceptes.add(r);
			    		
			    }
			
			 }
		 }

	     for(Map.Entry entry3 : arrayReceptes.entrySet()){
		 System.out.println(entry3.getKey());
		 System.out.println(entry3.getValue()+"\n");
		 }	     
	}
	//creacio d'una estructura que guardi les receptes segons l'ordre de creacio
	public TreeSet<Recipe> AfegirLlistaCreacio(Recipe r,TreeSet <Recipe> llista){
		this.llista=llista.add(r);
		return llista;
		
	}
	//creacio de la llista amb al les receptes segon data creacio
	public TreeSet<Recipe> creacioLlista (){
		TreeSet <Recipe> llista =new TreeSet<Recipe>(new ComparaData());
		this.llista=llista;
		return llista;
	}

	
}
