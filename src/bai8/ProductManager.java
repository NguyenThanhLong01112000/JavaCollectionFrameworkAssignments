package bai8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class ProductManager {
	private static ProductManager instance;
	private HashMap<String, Product> productMap;

	public ProductManager() {
		productMap = new HashMap<>();
	}

	public static ProductManager getInstance() {
		if (instance == null) {
			instance = new ProductManager();
		}
		return instance;
	}

	public Product addProduct(Product product) {
		return productMap.put(product.getCode(), product);
	}

	public void showAllProductInfo() {
		Collection<Product> productList = productMap.values();
		Iterator<Product> it = productList.iterator();
		while (it.hasNext()) {
			Product product = it.next();
			product.showProductInfo();
		}
	}

	public Product findProduct(String code) {
		return productMap.get(code);
	}

	public Product deleteProduct(String code) {
		return productMap.remove(code);
	}

	public Product changeProductInfo(Product product) {
		String code = product.getCode();
		if (productMap.containsKey(code)) {
			return productMap.put(product.getCode(), product);
		} else {
			return null;
		}
	}
}
