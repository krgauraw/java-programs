package dev.coll.inv;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Find maximum element inside list
 * 
 * @author gauraw
 *
 */
public class P11 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(90);
		list.add(20);
		list.add(40);
		list.add(8);
		list.add(50);
		System.out.println("list::::" + list);
		System.out.println("Max Element in list:::::" + Collections.max(list));

	}
}
