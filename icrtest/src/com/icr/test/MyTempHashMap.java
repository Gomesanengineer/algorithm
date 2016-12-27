package com.icr.test;

public class MyTempHashMap<K,V> { 
	
	Entry<K,V>[] bucket;
	int capacity = 4;
	
	
	MyTempHashMap() {
		bucket = new Entry[capacity];
	}
	
	int hash(K key) {
		return Math.abs(key.hashCode()) % capacity; 
	}
	
	 public void display(){
	       
	       for(int i=0;i<capacity;i++){
	           if(bucket[i]!=null){
	                  Entry<K, V> entry=bucket[i];
	                  while(entry!=null){
	                        System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
	                        entry=entry.next;
	                  }
	           }
	       }             
	    
	    }
	
	public void put(K newKey, V newValue) {
		
		if(newKey == null) {
			return;
		}
		
		Entry<K,V> newData = new Entry(newKey, newValue);
		
		
		int position = hash(newKey);
		
		if(bucket[position] == null ){
			bucket[position]= newData;
		} else {
			Entry<K,V> current = bucket[position];

			while(current.next != null) {
				current = current.next;
			}
			
			current.next = newData;
			
		}
		
	}
	
	public static void main(String[] arg) {
		
		MyTempHashMap<Integer, Integer> hashMapCustom = new MyTempHashMap<Integer,Integer>();
	    hashMapCustom.put(21, 12);
        hashMapCustom.put(21, 121);
        hashMapCustom.put(30, 151);
        hashMapCustom.put(33, 15);
        hashMapCustom.put(35, 89);

        hashMapCustom.display();
		
	}
	
/*	void put(K newKey, V newValue) {
		
		if(newKey == null) {
			return;
		}

		Entry<K,V> data = new Entry(newKey, newValue);		
		
		int position = hash(newKey);
		
		if(bucket[position]==null) {
			bucket[position] = data;
		} else {
			
			Entry<K,V> previous = null;
			Entry<K,V> current = bucket[position];
			
			while(current!=null) {
				if(current.key.equals(newKey)) {
					if(previous == null) {
									
					}
				}
			}
		}	
	}*/
	
	static class Entry<K,V> {
		K key;
		V value;
		Entry<K,V> next;
		
		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
	}
	

}


