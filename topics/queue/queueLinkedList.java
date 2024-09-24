

public class queueLinkedList {
    class QueueNode {
        int data;
        QueueNode next;
        QueueNode(int a)
        {
            data = a;
            next = null;
        }
    }
    
    QueueNode front, rear;
    
	void push(int a)
	{
        // Your code here
        QueueNode node = new QueueNode(a);
        if(front == null) {
            front = node;
            rear = node;
            return;
        }
        rear.next = node;
        rear = node;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front == null) return -1;
        int x = front.data;
        front = front.next;
        if (front == null) {
            rear = null; 
        }
        return x;
	}
}