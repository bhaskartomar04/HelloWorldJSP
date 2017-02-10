package models;

import java.io.Serializable;
import java.util.ArrayList;

public class CarsList implements Serializable {
    private static final long serialVersionUID = -1914796470469476183L;
	private ArrayList<Car> cars;
	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	
}
