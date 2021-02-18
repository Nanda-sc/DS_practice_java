package LinkelistStack;

public class Stack<T> {
	
	private Node<T> root;
	private int count;
	
	public void push(T data) {
		count++;
		if(root==null) {
			root = new Node<>(data);
		}else {
			Node<T> prevNode = root;
			root = new Node<>(data);
			root.setNextNode(prevNode);
		}
	}
	
	public T pop() {
		if (this.isEmpty()) return null;
		
		T item = root.getData();
		root = root.getNextNode();
		count--;
		
		return item;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public int size() {
		return count;
	}

}
