package bai2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bai2 {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		
		// Thêm các tên quốc gia vào HashSet.
		hashSet.add("Vietnam");
		hashSet.add("Laos");
		hashSet.add("Campuchia");
		hashSet.add("China");
		hashSet.add("South-Korea");
		
		// Hiển thị danh sách các quốc gia đã thêm vào.
		Iterator<String> it = hashSet.iterator();
		while (it.hasNext()) {
			String nation = (String) it.next();
			System.out.print(nation + " ");
		}
		
		// Kiểm tra xem một quốc gia có tồn tại trong HashSet hay không.
		boolean isContainVie = hashSet.contains("Vietnam");
		boolean isContainUsa = hashSet.contains("America");
		System.out.println("\nContain Vietnam: " + isContainVie);
		System.out.println("Contain America: " + isContainUsa);
		
		// Xóa một quốc gia cụ thể khỏi HashSet.
		hashSet.remove("China");
		it = hashSet.iterator();
		System.out.print("hashSet after remove: ");
		while (it.hasNext()) {
			String nation = (String) it.next();
			System.out.print(nation + " ");
		}
		
		// Tính số lượng các quốc gia có trong HashSet.
		System.out.println("\nSo luong quoc gia trong hashSet = " + hashSet.size());
		
	}
}
