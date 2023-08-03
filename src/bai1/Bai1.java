package bai1;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		
		// Thêm các phần tử vào ArrayList
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(5);
		
		// Hiển thị các phần tử trong ArrayList
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		
		// Tính tổng của tất cả các phần tử trong ArrayList
		int sum = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			sum += arrayList.get(i);
		}
		System.out.println("\nsum = " + sum);
		
		// Tìm giá trị lớn nhất và nhỏ nhất trong ArrayList.
		int max = arrayList.get(0);
		int min = arrayList.get(0);
		for (int i = 1; i < arrayList.size(); i++) {
			int ithElement = arrayList.get(i);
			if (max < ithElement)
				max = ithElement;
			if (min > ithElement)
				min = ithElement;
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		// Xóa một phần tử cụ thể khỏi ArrayList.
		arrayList.remove(3);
		System.out.print("arrayList sau khi xoa 1 phan tu: ");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		
		// Kiểm tra một phần tử có tồn tại trong ArrayList hay không.
		boolean isContainFive = arrayList.contains(5);
		boolean isContainSix = arrayList.contains(6);
		System.out.println("\ncontain 5 = " + isContainFive);
		System.out.println("contain 6 = " + isContainSix);
	}
}
