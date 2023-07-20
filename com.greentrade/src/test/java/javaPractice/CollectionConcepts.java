package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;


public class CollectionConcepts {
	@Test
	public void test() {
		Map m = new HashMap<>();
		m.put(20, 60);
		m.put(50, 77);
		System.out.println(m);
	}
	@Test
	public void arraList() {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add("Hi");
		al.add(null);
		al.add('A');
		System.out.println(al);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(5);
		al1.add(80);
		al1.add(70);
		Collections.sort(al1);
		System.out.println(al1);
		
		al.addAll(al1);
		for (Object data : al) {
			System.out.println(data);
		}
		
		System.out.println(al.contains("Hi"));
		System.out.println(al.indexOf("Hi"));
		System.out.println(al.remove(2));
		System.out.println(al);
	}
	
	@Test
	public void stack() {
		Stack<Object> s = new Stack<Object>();
		s.push(10);
		s.push(20);
		s.add(20);
		System.out.println(s.add(20));
		System.out.println(s.add(20));
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}
	@Test
	public void linkedList() {
		//-	Data structure is DoubliLinkedList
		LinkedList<Object> l =  new LinkedList<Object>();
		l.add(20);
		l.add(60);
		l.add("Hi");
		l.add(null);
		l.add(10);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.addFirst(999);
		l.addLast(111);
		System.out.println(l);
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
	}
	@Test
	public void queue() {
		PriorityQueue<Object> q = new PriorityQueue<Object>();
		q.add(20);
		q.add(50);
		q.add(80);
		q.add(60);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
	}
	@Test
	public void set() {
		HashSet<Object> set = new HashSet<Object>();
		set.add(20);
		set.add("Hi");
		set.add(null);
		set.add(null);
		System.out.println(set);
		ArrayList<Object> al = new ArrayList<Object>(set);
		al.add(null);
		al.add(50);
		System.out.println(al);
		
	}
	@Test
	public void linkedHashSet() {
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		set.add(10);
		set.add(50);
		set.add(null);
		set.add(90);
		set.add(70);
		System.out.println(set);
	
	}
	@Test
	public void treeSet() {
		TreeSet<Object> set = new TreeSet<Object>();
		set.add(10);
		set.add(90);
		set.add(50);
		set.add(70);
		System.out.println(set);
		
		Iterator<Object> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	@Test
	public void map() {
		Hashtable<Integer, Object> map = new Hashtable<Integer, Object>();
		map.put(30, "Hi");
		map.put(60, "Hello");
		map.put(70, 'A');
		map.put(20, 20);
		System.out.println(map);
	}
	@Test
	public void map1() {
		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
		map.put(30, "Hi");
		map.put(60, "Hello");
		map.put(70, 'A');
		map.put(20, 20);
		System.out.println(map);
		
		for (Entry<Integer, Object> m : map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
	@Test
	public void map2() {
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
		map.put(30, "Hi");
		map.put(60, "Hello");
		map.put(70, 'A');
		map.put(20, 20);
		System.out.println(map);
		
		for (Entry<Integer, Object> m : map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
	@Test
	public void map3() {
		TreeMap<Integer, Object> map = new TreeMap<Integer, Object>();
		map.put(30, "Hi");
		map.put(60, "Hello");
		map.put(70, 'A');
		map.put(20, 20);
		map.put(99, null);
		
		System.out.println(map);
		
		for (Entry<Integer, Object> m : map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
	
}
