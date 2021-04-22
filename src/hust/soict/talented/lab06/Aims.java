package hust.soict.talented.lab06;

import java.util.*;

class Aims {
	private static boolean status = true;
	private static ArrayList<Order> listOrder = new ArrayList<Order>();
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		int orderId;
		int mediaId;
		while (status) {
			showMenu();
			id = Integer.parseInt(sc.next());;
			switch (id) {
				case 1:
					Order newOrder = new Order();
					listOrder.add(newOrder);
					break;
				case 2:
					if (Order.nbOrders == 0) {
						System.out.println("There is no order!");
					} else {
						System.out.println("Choose index of order from 0 to " + (listOrder.size() - 1) + ": ");
						orderId = Integer.parseInt(sc.next());;
						System.out.println("Enter media title: ");
						String title = sc.next();
						System.out.println("Enter media category: ");
						String category = sc.next();
						System.out.println("Enter media cost: ");
						float cost = Float.parseFloat(sc.next());;
						Media med = new Media(title, category, cost);
						listOrder.get(orderId).addMedia(med);
					}
					break;
				case 3:
					if (Order.nbOrders == 0) {
						System.out.println("There is no order!");
					} else {
						System.out.println("Choose index of order from 0 to " + (listOrder.size() - 1) + ": ");
						orderId = Integer.parseInt(sc.next());;
						if (listOrder.get(orderId).nbMedias == 0) {
							System.out.println("There is no media in this order!");
						} else {
							System.out.println("Choose index of media from 0 to " + (listOrder.get(orderId).nbMedias - 1) + ": ");
							mediaId = Integer.parseInt(sc.next());;
							listOrder.get(orderId).removeMedia(mediaId);
						}
					}
					break;
				case 4:
					if (Order.nbOrders == 0) {
						System.out.println("There is no order!");
					} else {
						for (int i = 0; i < Order.nbOrders; i++) {
							System.out.println("Information of order " + (i + 1));
							listOrder.get(i).printOrder();
						}
					}
					break;
				case 0:
					status = false;
					break;
			}
		}
		sc.close();
	}
}
