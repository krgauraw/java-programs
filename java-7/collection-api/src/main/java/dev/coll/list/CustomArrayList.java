package dev.coll.list;

/**
 * Program No : 125. Custom ArrayList Class 
 * @author gauraw
 *
 */
public class CustomArrayList {

	private Object elements[];
	private int size,capacity;
	
	public CustomArrayList(){
		capacity=10;
		elements=new Object[capacity];
	}
	
	public void add(Object obj){
		
		if(size==capacity){
			alterCapacity();
		}
		elements[size++]=obj;
	}
	
	private void alterCapacity(){
		Object[] temp=elements;
		capacity=capacity*2;
		elements=new Object[capacity];
		for(int i=0;i<temp.length;i++){
			elements[i]=temp[i];
		}
	}
	
	public Object get(int index){
		
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException("Index must be between 0 to "+(size-1));
		}
		return elements[index];
	}
	
	public int size(){
		return size;
	}
	
	public String toString(){
		StringBuffer sb=new StringBuffer("[");
		
		for (int i = 0; i < size; i++) {
			sb.append(elements[i]+",");
			
		}
		return sb.substring(0, sb.length()-1)+"]";
		
	}
}
