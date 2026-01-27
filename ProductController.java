package product.inventory;

import java.util.*;

public class ProductController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService inventory = new ProductService();

		System.out.println("Choose from the options:");
		System.out.println("1: add product");
		System.out.println("2: remove product");
		System.out.println("4: display all products");
		System.out.println("3: find product");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Enter number of Products to be added:");
			int a = sc.nextInt();
			for (int i = 0; i < a; i++) {
				System.out.println("Enter product id,name,quantity,price:");
				int pid = sc.nextInt();
				sc.nextLine();
				String pn = sc.nextLine();
				int q = sc.nextInt();
				double price = sc.nextDouble();
				Product p = new Product(pid, pn, q, price);
				inventory.addProduct(p);
			}
			break;
		case 2:
			System.out.println("Enter id of Product to be removed:");
			int pid = sc.nextInt();
			inventory.removeProduct(pid);
			break;
		case 3:
			System.out.println("Enter name of Product to be found:");
			String na = sc.nextLine();
			inventory.findProduct(na);
			break;
		case 4:
			System.out.println(inventory);
		}
		sc.close();
	}

}
