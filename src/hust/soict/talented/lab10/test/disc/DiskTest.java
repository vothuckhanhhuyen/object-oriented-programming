package hust.soict.talented.lab10.test.disc;

import hust.soict.talented.lab10.disc.DigitalVideoDisc;

public class DiskTest {
	public static void main(String[] args) {
		DigitalVideoDisc disk1 = new DigitalVideoDisc("Harry Potter");
		System.out.println(disk1.search("hotter"));
	}
}
