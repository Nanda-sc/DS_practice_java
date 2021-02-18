package com.practice.DS;

public interface List<T> {
	
	public Node middleNode();
	public void insert(T data);
	public void remove(T data);
	public void traverse();
	public int size();

}
