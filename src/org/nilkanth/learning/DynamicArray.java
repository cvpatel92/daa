package org.nilkanth.learning;

public class DynamicArray {
	
	private Object[] data;
	private int initialCapacity;
	private int size;
	
	public DynamicArray(int initialCapacity) {
		this.initialCapacity = initialCapacity;
		data = new Object[initialCapacity];
	}
	
	public String getData(int index) {
		return (String) data[index];
	}
	
	public void setData(int index, String value) {
		data[index] = value;
	}
	
	public void insert(int index, String value) {
		//check size
		if(size == initialCapacity) {
			resize();
		}
		
		//adding an element
		for(int j=size; j>index; j--) {
			data[j] = data[j-1];			
		}
		
		data[index] = value;
		size++;
	}
	
	public void delete(int index) {
		for(int j=index; j < size-1; j++) {
			data[j] = data[j+1];			
		}
		size--;
	}
	
	public boolean contains(String value) {
		for(int i=0;i<size;i++) {
			if(data[i].equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	public void resize() {
		Object[] newData = new Object[initialCapacity * 2];
		for (int i=0;i<size;i++){
			newData[i] = data[i];
		}
		data = newData;
		initialCapacity = initialCapacity * 2;
	}

	public void add(String value) {
		if(size == initialCapacity){
			resize();
		}
		
		data[size] = value;
		size++;
	}

}
