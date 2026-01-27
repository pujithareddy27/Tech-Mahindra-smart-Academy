package product.inventory;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

	List<Product> inventory = null;

	public ProductService() {
		inventory = new ArrayList<Product>();
	}
	void addProduct(Product p)
	{
		inventory.add(p);
	}
	void removeProduct(int pid)
	{
		inventory.remove(pid);
	}
	void findProduct(String n)
	{
		for(Product x: inventory)
		{
			if(n.equals(x.getName()))
			{
				System.out.print(x);
			}
		}
	}
	void displayProducts()
	{
		for(Product x: inventory)
		{
			System.out.println(x.toString());
		}
	}
}
