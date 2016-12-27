package com.icr.test;

public class MyCustomHashMap<K,V> {

	Entry<K,V>[] bucket;
	int capacity = 4;
	
	MyCustomHashMap() {
		bucket = new Entry[capacity];
	}
	
	static class Entry<K, V> {
		
	  K key;
	  V value;
	  Entry<K,V> next;
	  
	  Entry(K key, V value, Entry<K,V > next) {
		  this.key = key;
		  this.value = value;
		  this.next = next;
	  }
	  
	  public String toString() {
		  return "{"+this.key+"="+this.value+"}";
	  }
	  
	}
	
	private int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }
	
	public V get(K key) {
		int hash = hash(key);
		if(bucket[hash] == null) {
			return null;
		} else {
			Entry<K,V> data = bucket[hash];
			while(data != null) {
				if(data.key.equals(key)) {
					return data.value;
				} 
				data = data.next;
			}
			return null;
		}
	}
	
	public void add() {
		
	}
	
	public void display() {
	       
	       for(int i=0;i<capacity;i++){
	           if(bucket[i]!=null){
	                  Entry<K, V> entry=bucket[i];
	                  
	                  while(entry!=null){
	                        System.out.print(entry);
	                        entry=entry.next;
	                  }
	           }
	       }
	}
	
	
}
