package bai3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bai3 {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		
		// Thêm các cặp key-value vào HashMap.
		hashMap.put("Long", 23);
		hashMap.put("Hien", 32);
		hashMap.put("Manh", 13);
		
		// Hiển thị danh sách tên của tất cả các người trong HashMap.
		Set<String> nameList = hashMap.keySet();
		Iterator<String> it = nameList.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.print(name + " ");
		}
		
		// Tìm tuổi của một người dựa trên tên của họ.
		System.out.println("\nTuoi cua Long = " + hashMap.get("Long"));
		
		// Xóa một người cụ thể khỏi HashMap.
		hashMap.remove("Long");
		System.out.print("Danh sach ten sau khi xoa: ");
		it = nameList.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.print(name + " ");
		}
		
		// Kiểm tra xem một người có tồn tại trong HashMap hay không.
		System.out.println("\nhashMap contain Hien: " + hashMap.containsKey("Hien"));
		System.out.println("hashMap contain Long: " + hashMap.containsKey("Long"));
	}
}
