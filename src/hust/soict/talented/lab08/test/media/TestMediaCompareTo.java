/**
 * 
 */
package hust.soict.talented.lab08.test.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hust.soict.talented.lab08.disc.DigitalVideoDisc;

/**
 * @author vothuckhanhhuyen
 *
 */
public class TestMediaCompareTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<DigitalVideoDisc> collection = new ArrayList<DigitalVideoDisc>();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("B", 130, "The Lion King", "C", 1500);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("B1", 150, "Star Wars", "C1", 1300);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("B2", 98, "Aladdin", "C2", 1400);
		
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		
		Iterator<DigitalVideoDisc> iterator = collection.iterator();
		
		System.out.println("------------------------------------");
		System.out.println("The DVDS currently in the order are: ");
		
		while (iterator.hasNext()) {;
			System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
		}
		
		java.util.Collections.sort(collection);
		
		iterator = collection.iterator();
		
		System.out.println("------------------------------------");
		System.out.println("The DVDS currently in sorted order are: ");
		
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
		}
		
		System.out.println("------------------------------------");
	}

}
