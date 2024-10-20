public class LinkedList {
        Node first;
        Node last;
        int mSize;
        public LinkedList(int mSize){
        first = null;
        this.mSize = mSize;
        }
    public boolean isEmpty(){
        return (first == null);
        }
    public void insertLast(int data){
        Node Node = new Node(data);
        if(isEmpty()){
            first = Node;
        }else{
            last.next = Node;
        }
        last = Node;
        }
    public boolean dupCheck(int data){
        Node current = first;
        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
        }
    public int find(int key){
        int count = 0;
        Node current = first;

        while(current != null){
            if(current.data == key){
                return count;
            }
            current = current.next;
            ++count;
        }
        return -1;
        }
    public void displayList(){
        Node current = first;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        }
    public void insertAfter(int key, int data){
        Node current = first;
        int counter = 0;
        int size = counter();
        if(data > mSize){
            System.out.println("Can't insert element invalid position.");
            return;
        }
        boolean checker = false;
        if(size != mSize){
            while(current != null){
                if(counter == data){
                    Node Node = new Node(key);
                    if(current == first){
                        Node.next = first;
                        first = Node;
                        break;
                    }
                    Node.next = current.next;
                    current.next = Node;
                    System.out.println("Element inserted.");
                    checker = true;
                    break;
                }
                current = current.next;
                ++counter;
            }
            if(!checker){
                System.out.println("Element inserted.");
            }
        }else{
            System.out.println("Invalid, storage full.");
        }
        }
    public int counter(){
        int counter = 0;
        Node current = first;
        while(current != null){
            ++counter;
            current = current.next;
        }
        return counter;
        }
    public int deleteNa(int data){
        Node current = first;
        Node previous = first;
        while(current != null){
            if(current.data == data){
                if(current == first){
                    first = current.next;
                }else{
                    previous.next = current.next;
                }
                return 1;
            }
            previous = current;
            current = current.next;

        }
        return -1;
        }
    public int[] eleData(int size){
        int arr[] = new int[size];
        int counter = 0;
        Node current = first;
        while(current != null){
            arr[counter] = current.data;
            current = current.next;
            ++counter;
        }

        return arr;
        }
    public void bubbleSortForLastEle(int arr[]){
        for(int x = 0; x < arr.length - 1; x++){
            for(int y = 0; y < arr.length -x-1; y++){
                if(arr[y] > arr[y + 1]){
                    int temp = arr[y + 1];
                    arr[y + 1] = arr[y];
                    arr[y] = temp;
                }

            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
        }
    public void sortingNa(){
        int x = 0;
        int y = 0;
        int size = counter();
        int arr[] = eleData(size);
        int mid = arr.length / 2;

        int left[] = new int[mid];
        int right[] = new int[arr.length - mid];
        for(int i = 0; i < arr.length; i++){
            if(i < mid){
                left[x] = arr[i];
                ++x;
            }else{
                right[y] = arr[i];
                y++;
            }
        }
        System.out.println("Displaying the first set of elements: ");
        for(int i : left){
            System.out.print(i + " ");
        }
        bubbleSort(left);
        System.out.println("\nDiplaying the second set of elements: ");
        for(int j : right){
            System.out.print(j + " ");
        }
        bubbleSort(right);
        System.out.println("\nSorting the two set of elements: ");

        bubbleSortForLastEle(arr);
        System.out.println();

        }
    public void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nSorting the elements: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        }
}
