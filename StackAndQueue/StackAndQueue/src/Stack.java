public class Stack {
                    int top;
                    int stckMaxSize;
                    int[] stckItems;
                    int currentSize;
        Stack(int maxSize){
                    this.stckMaxSize = maxSize;
                    stckItems = new int[stckMaxSize];
                    top = -1;
                    currentSize = 0;
                    }
        boolean isEmpty(){
                    return (top == -1);
                    }
        boolean isFull(){
                    return (top == stckMaxSize - 1);
                    }
        void push(int element){
                    stckItems[++top] = element;
                    currentSize++;
                    }
        public int pop(){
                    return stckItems[top--];
                    }
        public int peek(){
                    return stckItems[top];
                    }
        boolean checkDup(int element){
                    for(int i = 0; i <= top; i++){
                        if(stckItems[i] == element){
                            return true;
                        }
                    }
                    return false;
                    }
        void displayStack(){
                    if(isEmpty()){
                    System.out.println("Stack is empty");
                    }else{
                    for(int i = 0; i <= top; i++){
                        System.out.print(stckItems[i] + " ");
                    }
                    }
                    }

}
