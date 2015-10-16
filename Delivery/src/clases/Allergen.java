package clases;

import java.util.Map;

public class Allergen {
	private int code;
	private String name;

	/*
	 * Constructor
	 */
	public Allergen(int code, String name) {
		this.code = code;
		this.name = name;
	}

	/*
	 * Sacar un elemento por el codigo
	 */
	public String getElement(Map<Integer, String> listAller, int code) {
		if (listAller.containsKey(code)) {
			for (Map.Entry<Integer, String> entry : listAller.entrySet()) {
				if (entry.getKey() == code) {
					return entry.getValue();
				}
			}
		}
		return null;
	}

}
