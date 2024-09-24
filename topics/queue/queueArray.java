

public class queueArray {

    int front, rear;
	int arr[] = new int[100005];

    queueArray()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    arr[rear] = x;
	    rear = rear+1;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(front == rear) return -1;
		int x = arr[0];
		for(int i = 0; i <= rear; i++) {
		    arr[i] = arr[i+1];
		}
		rear = rear - 1;
		return x;
	} 
}