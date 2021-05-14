/**
 * 
 */
package hust.soict.talented.lab09.gui.javafx;

import javafx.beans.property.*;
/**
 * @author vothuckhanhhuyen
 *
 */
public class S06MyNumber {
	private DoubleProperty number = new SimpleDoubleProperty();
	

	/**
	 * @return the number
	 */
	public DoubleProperty getNumber() {
		return number;
	}


	/**
	 * @param the number to set
	 */
	public void setNumber(DoubleProperty number) {
		this.number = number;
	}


	/**
	 * 
	 */
	public S06MyNumber() {
		// TODO Auto-generated constructor stub
	}

}
