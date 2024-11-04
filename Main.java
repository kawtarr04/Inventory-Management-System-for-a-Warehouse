package InventoryManagementSystemforaWarehouse;

public class Main {

	public static void main(String[] args) {
		Product item = new Product("pencil", 100, 6);
		Product pc = new Electronics("PC", 200, 3, "Dell", 2);
		Product apple = new Food("Apple", 60, 10, "16/11/2024");
		Product.welcomeMessage();
		item.displayInfo();
		pc.displayInfo();
		apple.displayInfo();
		item.updateQuantity(50);
		pc.updateQuantity(10, true);
		apple.updateQuantity(40, false);
		item.displayInfo();
		pc.displayInfo();
		apple.displayInfo();
		System.out.println("the price of the pencil is : "+ item.getPrice());
		
	}

}
