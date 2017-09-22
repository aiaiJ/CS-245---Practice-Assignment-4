import java.util.Arrays; 
public class ArrayQueue implements Queue{

	private int head = 0;
	private int tail = 0;
	private int count = 0;
	private Object[] array = new Object[10];

	public ArrayQueue(){

	}

	public Object dequeue(){

		if(!empty()){

			Object item = array[head];
			array[head]=null;
			head = (head+1)%array.length;
			count--;
			return item;
		}
		return null;
		
	}
	public void enqueue(Object item){

		if(full()){

			grow_queue();

		}

		array[tail] = item;
		tail = (tail+1)%array.length;
		count++;
	}
	private void grow_queue(){
		
		Object[] newArray = new Object[array.length *2];
		for(int i = 0; i < array.length; i++){

			newArray[i] = array[i];
		}
		array = newArray;

	}
	public boolean empty(){

		if(count==0){
			
			head = 0;
			tail = 0;
			return true;
		}
		return false;

	}
	public boolean full(){

		if(count==array.length){
			return true;
		}
		return false;
	}

}