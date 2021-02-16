package com.practice.DS;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	private Node<T> root;
	private int numOfItems;

	@Override
	public void insert(T data) {
		if (root == null) {
			root = new Node<>(data);
		} else {
			//insertBegining(data);
			insertEnd(data, root);
		}

	}

	private void insertBegining(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		root = newNode;

	}
	
	//start with root node and find the last node
	private void insertEnd(T data, Node<T> node) {
		//recursive calls till the last node is found
		if(node.getNextNode() != null) {
			insertEnd(data, node.getNextNode());
		}else {
			//last node found
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void remove(T data) {
		
		if(root == null) return;
		
		if(root.getData().compareTo(data)== 0) {
			root = root.getNextNode();
		}else {
			remove(data, root, root.getNextNode());
		}
	}

	private void remove(T data, Node<T> prevNode, Node<T> actualNode) {
		
		while(actualNode != null) {
			if(actualNode.getData().compareTo(data)== 0) {
				numOfItems--;
				prevNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			
			prevNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
		
	}

	@Override
	public void traverse() {
		
		if(root == null) return;
		
		Node<T> actualNode = root;
		
		while(actualNode != null) {
			System.out.println(actualNode);
			actualNode = actualNode.getNextNode();
		}

	}

	@Override
	public int size() {
		return numOfItems;
	}

}
