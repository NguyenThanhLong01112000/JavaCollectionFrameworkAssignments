package bai15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Bai15 {
	public static void main(String[] args) {
		Set<Integer> hashSet1 = new HashSet<>();
		Set<Integer> hashSet2 = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		// nhập và đọc phần tử của 2 hash set
		System.out.println("Nhap phan tu cua hashSet1: ");
		String hashSet1Input = "";
		if (sc.hasNextLine())
		{
			hashSet1Input = sc.nextLine();
		}
		System.out.println("Nhap phan tu cua hashSet2: ");
		String hashSet2Input = "";
		if (sc.hasNextLine())
		{
			hashSet2Input = sc.nextLine();
		}
		
		String[] hashSet1Element = hashSet1Input.split("\\s+");
		for (int i = 0; i < hashSet1Element.length; i++)
		{
			hashSet1.add(Integer.parseInt(hashSet1Element[i]));
		}
		
		String[] hashSet2Element = hashSet2Input.split("\\s+");
		for (int i = 0; i < hashSet2Element.length; i++)
		{
			hashSet2.add(Integer.parseInt(hashSet2Element[i]));
		}
		
		// hợp của hashSet1 và hashSet2
		Set<Integer> hashSetUnion = new HashSet<>();
		hashSetUnion.addAll(hashSet1);
		hashSetUnion.addAll(hashSet2);
		
		// in ra màn hình hợp của 2 hash set
		System.out.println("Union of 2 hashSet: ");
		Iterator<Integer> it = hashSetUnion.iterator();
		while (it.hasNext())
		{
			Integer element = it.next();
			System.out.print(element + " ");
		}
	}
}
