package bai8;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Moi chon chuc nang:");
			System.out.println("1 - Them san pham");
			System.out.println("2 - Hien thi danh sach san pham");
			System.out.println("3 - Tim thong tin san pham");
			System.out.println("4 - Xoa san pham");
			System.out.println("5 - Cap nhat thong tin san pham");
			System.out.println("6 - Thoat khoi chuong trinh");

			int input = readUserInput();

			if (input == -1) {
				System.out.println("Input khong hop le!");
				continue;
			}

			if (input == 6)
				break;

			switch (input) {
			case 1:
				addProduct();
				break;
			case 2:
				showAllProductInfo();
				break;
			case 3:
				findProduct();
				break;
			case 4:
				deleteProduct();
				break;
			case 5:
				changeProductInfo();
				break;
			}

		}
	}

	private static int readUserInput() {
		if (!sc.hasNextInt()) {
			sc.next();
			return -1;
		}

		int input = sc.nextInt();

		if (input < 1 || input > 6) {
			return -1;
		}

		return input;

	}

	private static void addProduct() {
		System.out.println("Nhap thong tin san pham:");

		System.out.println("Nhap code:");
		String code = sc.next();

		System.out.println("Nhap ten:");
		String name = sc.next();

		int price;
		System.out.println("Nhap gia:");
		if (!sc.hasNextInt() || (price = sc.nextInt()) < 0) {
			System.out.println("Nhap gia khong hop le!");
			return;
		}

		int quantity;
		System.out.println("Nhap so luong:");
		if (!sc.hasNextInt() || (quantity = sc.nextInt()) <= 0) {
			System.out.println("Nhap so luong khong hop le!");
			return;
		}

		ProductManager manager = ProductManager.getInstance();
		manager.addProduct(new Product(code, name, price, quantity));
		System.out.println("San pham vua them:");
		Product product = manager.findProduct(code);
		product.showProductInfo();
	}

	private static void showAllProductInfo() {
		System.out.println("Danh sach san pham: ");
		ProductManager manager = ProductManager.getInstance();
		manager.showAllProductInfo();
	}

	private static void findProduct() {
		System.out.println("Nhap code san pham can tim: ");
		String code = sc.next();
		ProductManager manager = ProductManager.getInstance();
		Product product = manager.findProduct(code);
		if (product != null) {
			System.out.println("Ket qua: ");
			product.showProductInfo();
		} else {
			System.out.println("Khong ton tai san pham co code nhu vay!");
		}
	}

	private static void deleteProduct() {
		System.out.println("Nhap code san pham can xoa: ");
		String code = sc.next();
		ProductManager manager = ProductManager.getInstance();
		Product product = manager.deleteProduct(code);
		if (product != null) {
			System.out.println("Thong tin san pham vua xoa: ");
			product.showProductInfo();
		} else {
			System.out.println("Khong ton tai san pham co code nhu vay!");
		}
	}

	private static void changeProductInfo() {
		System.out.println("Nhap thong tin san pham:");

		System.out.println("Nhap code:");
		String code = sc.next();

		System.out.println("Nhap ten:");
		String name = sc.next();

		int price;
		System.out.println("Nhap gia:");
		if (!sc.hasNextInt() || (price = sc.nextInt()) < 0) {
			System.out.println("Nhap gia khong hop le!");
			return;
		}

		int quantity;
		System.out.println("Nhap so luong:");
		if (!sc.hasNextInt() || (quantity = sc.nextInt()) <= 0) {
			System.out.println("Nhap so luong khong hop le!");
			return;
		}

		ProductManager manager = ProductManager.getInstance();
		Product product = manager.changeProductInfo(new Product(code, name, price, quantity));
		if (product != null) {
			System.out.println("Thong tin san pham sau khi sua: ");
			product.showProductInfo();
		} else {
			System.out.println("Khong ton tai san pham co code nhu vay!");
		}
	}
}
