package com.java.generic;

class Store<T>{
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return this.item;
	}
}

class Hashtable<K,V>{
	private K key;
	private V value;
	
	public Hashtable(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Hashtable [key=" + key + ", value=" + value + "]";
	}
	
	 
}

public class First {

	public static void main(String[] args) {
		 Store<String> store = new Store<>();
		 store.setItem("Hello");
		 String item = store.getItem();
		 System.out.println(item);
		 
		 Hashtable<String,Integer> hashtable = new Hashtable("Hello", 30);
		 System.out.println(hashtable);
	}

}
