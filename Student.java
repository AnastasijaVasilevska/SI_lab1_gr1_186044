import sun.font.TrueTypeGlyphMapper;

import java.util.ArrayList;
import java.util.Arrays;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints = new ArrayList<Integer>(10)

	//TODO constructor

	public Student() {
	}


	//TODO seters & getters


	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public double getAverage() {
		//TODO
		suma=0
		for(int i=0;i<getLabPoints().length;i++){
			suma+=getLabPoints()
		}
		return suma/getLabPoints().length
	}

	public boolean hasSignature() {
		//TODO
		if(getLabPoints().length>8){
			return true
		}
		else
			return false
	}
}
