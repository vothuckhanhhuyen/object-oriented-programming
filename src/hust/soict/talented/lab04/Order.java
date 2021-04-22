package hust.soict.talented.lab04;

class Order {
	public static final int MAX_LIMITED_ORDERS = 5;
	public static int nbOrders = 0;
	private MyDate dateOrdered;
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public Order() {
		if (nbOrders == MAX_LIMITED_ORDERS) {
			System.out.println("You can't add a order");
		} else {
			nbOrders += 1;
		}
	}
	
	public MyDate getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full");
		} else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("The disc (" + disc.getTitle() + ", "
											+ disc.getCategory() + ", "
											+ disc.getDirector() + ", "
											+ disc.getLength() + ", "
											+ disc.getCost() + ") has been added");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full if you added");
		} else {
			for (int i = 0; i < dvdList.length; i++) {
				this.addDigitalVideoDisc(dvdList[i]);
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full if you added");
		} else {
			this.addDigitalVideoDisc(dvd1);
			this.addDigitalVideoDisc(dvd2);
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (disc.getCategory() == itemsOrdered[i].getCategory() &&
					disc.getDirector() == itemsOrdered[i].getDirector() &&
					disc.getTitle() == itemsOrdered[i].getTitle() &&
					disc.getCost() == itemsOrdered[i].getCost() &&
					disc.getLength() == itemsOrdered[i].getLength()) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j].setCategory(itemsOrdered[j + 1].getCategory());
					itemsOrdered[j].setDirector(itemsOrdered[j + 1].getDirector());
					itemsOrdered[j].setTitle(itemsOrdered[j + 1].getTitle());
					itemsOrdered[j].setCost(itemsOrdered[j + 1].getCost());
					itemsOrdered[j].setLength(itemsOrdered[j + 1].getLength());
				}
				qtyOrdered -= 1;
				System.out.println("The disc (" + disc.getTitle() + ", "
												+ disc.getCategory() + ", "
												+ disc.getDirector() + ", "
												+ disc.getLength() + ", "
												+ disc.getCost() + ") has been removed");
			}
		}
	}
	
	public float totalCost() {
		float tCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			tCost += itemsOrdered[i].getCost();
		}
		return tCost;
	}
	
	public void printOrder() {
		System.out.println("***********************Order***********************");
		System.out.println("Date: [" + this.dateOrdered.getDay() + " - " + this.dateOrdered.getMonth()+ " - " + this.getDateOrdered().getYear() + "]");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println((i + 1) + ". DVD - [" + itemsOrdered[i].getTitle() + "] - ["
													+ itemsOrdered[i].getCategory() + "] - ["
													+ itemsOrdered[i].getDirector() + "] - ["
													+ itemsOrdered[i].getLength() + "]: ["
													+ itemsOrdered[i].getCost() + "] $");
		}
		System.out.println("Total cost: [" + this.totalCost() + "]");
		System.out.println("***************************************************");
	}
}
