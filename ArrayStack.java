/**

@author Aiai Jin

**/
import java.util.Arrays; 

public class ArrayStack implements Stack{

	private int top = 0;
	private Object[] array= new Object[10];

	public ArrayStack(){

	}

	public void push(Object item){

		if(top==array.length){
			grow_stack();
		}

		array[top]=item;
		top++;

	}

	private void grow_stack(){

		Object[] newArray = new Object[array.length *2];
		for(int i = 0; i < array.length; i++){

			newArray[i] = array[i];
		}
		array = newArray;
	}

	public Object pop(){

		if(!empty()){
			
			top--;
			Object result = array[top];
			array[top] = null; 
			return result;
		}
		
		return null;

	}
	public Object peek(){


		if(!empty()){
			
			return array[top-1];
		}
		
		return null;
	}
	
	public boolean empty(){

		if(top==0){
			return true;
		}
		return false;
	}

}