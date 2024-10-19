public class Queue {
    int front;
    int rear;
    int queueMaxSize;
    int[] queueItems;
    int currentSize;

    Queue(int maxSize){
        this.queueMaxSize = maxSize;
        queueItems = new int[queueMaxSize];
        currentSize = 0;
        front = -1;
        rear = -1;
    }
    boolean isEmpty(){
            if(front == -1)
            return true;
            else
            return false;
            }
    boolean isFull(){
            if(front == 0 && rear == queueMaxSize - 1){
            return true;
            }
            if(front == rear + 1){
            return true;
            }
            return false;
            }
    void enQueue(int element){
            if(isFull()) {
            System.out.println("Invalid, Queue is full");
            }else{
            if(front == -1)
                front = 0;
            rear = (rear + 1) % queueMaxSize;
            queueItems[rear] = element;
            currentSize++;
            }
            }
    int deQueue(){
            int element;
            if(isEmpty()){
            System.out.println("Invalid, Queue is empty");
            return (-1);
            }else{
            element = queueItems[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }else{
                front = (front + 1) % queueMaxSize;
            }
            return (element);
            }
            }
    void queueDisplay(){
            int i;
            if(isEmpty()){
            System.out.println("Queue is empty");
            }else{
            for(i = front; i != rear; i = (i + 1) % queueMaxSize)
                System.out.print(queueItems[i] + " ");
                System.out.println(queueItems[i]);

            }
            }
    boolean checkDup(int element){
            for(int i = 0; i < currentSize; i++){
            if(queueItems[(front + i) % queueMaxSize] == element){
                return true;
            }
            }
            return false;
            }
    public int peekFront(){
            return queueItems[front];
            }
}
