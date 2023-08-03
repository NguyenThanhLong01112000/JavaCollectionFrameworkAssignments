package bai4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bai4 {
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
		System.out.println("");
		
		// sort ascending
		Comparator<Integer> ascending = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		};
		arrayList.sort(ascending);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println("");
		
		// sort descending, use lambda
		arrayList.sort((o1, o2) -> {return o2 - o1;});
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
	}
}
