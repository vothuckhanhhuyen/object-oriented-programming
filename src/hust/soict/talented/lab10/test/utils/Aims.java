package hust.soict.talented.lab10.test.utils;

import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.LimitExceededException;

import hust.soict.talented.lab10.disc.Book;
import hust.soict.talented.lab10.disc.CompactDisc;
import hust.soict.talented.lab10.disc.DigitalVideoDisc;
import hust.soict.talented.lab10.disc.Track;
import hust.soict.talented.lab10.exception.PlayerException;
import hust.soict.talented.lab10.order.Order;
import hust.soict.talented.lab10.utils.MemoryDaemon;

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
	
	public static void main(String[] args) throws PlayerException, LimitExceededException {
		MemoryDaemon md = new MemoryDaemon();
		Thread th = new Thread(md);
		th.setDaemon(true);
		th.start();
		Scanner sc = new Scanner(System.in);
		while (status) {
			showMenu();
			int id = Integer.parseInt(sc.next());;
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
						int orderId = Integer.parseInt(sc.next());
						System.out.println("Select type 1.Book 2.DVD 3.CD: ");
						int type = Integer.parseInt(sc.next());
						switch (type) {
							case 1:
								System.out.println("Enter book title: ");
								String title = sc.next();
								System.out.println("Enter book category: ");
								String category = sc.next();
								System.out.println("Enter book cost: ");
								float cost = Float.parseFloat(sc.next());
								Book bok = new Book(title, category, cost);
								while (true) {
									System.out.println("Enter book author: ");
									String author = sc.next();
									bok.addAuthor(author);
									System.out.println("Do you want to continue entering author (Y/N)?");
									String key = sc.next();
									if (key.equals("Y")) {
										continue;
									} else {
										break;
									}
								}
								listOrder.get(orderId).addMedia(bok);
								break;
							case 2:
								System.out.println("Enter DVD title: ");
								String title2 = sc.next();
								System.out.println("Enter DVD category: ");
								String category2 = sc.next();
								System.out.println("Enter DVD cost: ");
								float cost2 = Float.parseFloat(sc.next());
								System.out.println("Enter DVD director: ");
								String director2 = sc.next();
								System.out.println("Enter DVD length: ");
								int length2 = Integer.parseInt(sc.next());
								DigitalVideoDisc dv = new DigitalVideoDisc(director2, length2, title2, category2, cost2);
								listOrder.get(orderId).addMedia(dv);
								System.out.println("Do you want to play DVD (Y/N)?");
								String key2 = sc.next();
								if (key2.equals("Y")) {
									dv.play();
								} 
								break;
							case 3:
								System.out.println("Enter CD title: ");
								String title3 = sc.next();
								System.out.println("Enter CD category: ");
								String category3 = sc.next();
								System.out.println("Enter CD cost: ");
								float cost3 = Float.parseFloat(sc.next());
								System.out.println("Enter CD artist: ");
								String artist3 = sc.next();
								System.out.println("Enter CD director: ");
								String director3 = sc.next();
								System.out.println("Enter CD length: ");
								int length3 = Integer.parseInt(sc.next());
								CompactDisc cd = new CompactDisc(artist3, director3, length3, title3, category3, cost3);
								while (true) {
									System.out.println("Add track title: ");
									String title4 = sc.next();
									System.out.println("Add track length: ");
									int length4 = Integer.parseInt(sc.next());
									Track tr = new Track(title4, length4);
									cd.addTrack(tr);
									System.out.println("Do you want to continue adding track (Y/N)?");
									String key3 = sc.next();
									if (key3.equals("Y")) {
										continue;
									} else {
										break;
									}
								}
								System.out.println("Do you want to play CD (Y/N)?");
								String key4 = sc.next();
								if (key4.equals("Y")) {
									cd.play();
								} 
								break;
						}
					}
					break;
				case 3:
					if (Order.nbOrders == 0) {
						System.out.println("There is no order!");
					} else {
						System.out.println("Choose index of order from 0 to " + (listOrder.size() - 1) + ": ");
						int orderId = Integer.parseInt(sc.next());;
						if (listOrder.get(orderId).getNoMedias() == 0) {
							System.out.println("There is no media in this order!");
						} else {
							System.out.println("Choose index of media from 0 to " + (listOrder.get(orderId).getNoMedias() - 1) + ": ");
							int mediaId = Integer.parseInt(sc.next());;
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
