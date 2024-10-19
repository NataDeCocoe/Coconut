import java.util.*;

public class Main{
    public static int queueMaxSize;
    public static int[] queueItems;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stckMaxSize;
        int[] stckItems;
        int queueMaxSize;
        int[] queueItems;
        boolean repeatMenu = false;
        boolean menuStck = false;
        boolean menuQueue = false;
        boolean repeat = true;
        boolean con = false;
        int iChoice = 0;
        String sChoice;



        while(!repeatMenu){
            System.out.println("Please choose the data structure you want to implement: ");
            System.out.println("A. Stack");
            System.out.println("B. Queue");
            System.out.print("Enter your choice: ");
            sChoice = in.next();

            if(sChoice.equalsIgnoreCase("A")){
                System.out.println();
                System.out.print("Set the maximum size of stack (Press 0 to stop): ");
                stckMaxSize = in.nextInt();
                Stack s = new Stack(stckMaxSize);
                stckItems = new int[stckMaxSize];

                System.out.print("Enter elements: ");
                for(int i = 0; i < stckMaxSize; i++){
                    repeat = true;
                    boolean trigger = false;
                    while(repeat){
                        int insEle = in.nextInt();
                        if(insEle == 0){
                            trigger = true;
                            break;
                        }
                        if(!s.checkDup(insEle)) {
                            s.push(insEle);
                            repeat = false;
                            repeatMenu = true;
                        }else{
                            System.out.println("Element duplicated.");
                        }
                    }
                    if(trigger == true){
                        break;
                    }
                }//for
                    s.displayStack();
                    while(!menuStck){
                        System.out.println();
                        System.out.println("\t\tMenu");
                        System.out.println("1. Peek");
                        System.out.println("2. Push");
                        System.out.println("3. Pop");
                        System.out.println("4. Display");
                        System.out.println("5. Exit");
                        System.out.print("Enter your choice: ");
                        iChoice = in.nextInt();

                        if(iChoice == 1){
                                    if(!s.isEmpty()){
                                        System.out.println("Element at top " + s.peek());
                                    }else{
                                        System.out.println("Stack is empty");
                                    }
                                    con = false;
                        }else if(iChoice == 2){
                                    while(true) {
                                        System.out.print("Enter element to push: ");
                                        int nEle = in.nextInt();
                                        if(s.isFull()){
                                            System.out.println("Stack is full cannot insert.");
                                            con = false;
                                            break;
                                        }
                                        if (!s.checkDup(nEle)) {
                                            s.push(nEle);
                                            break;
                                        } else {
                                            System.out.println("Cannot insert, element duplicated.");
                                            continue;
                                        }
                                    }
                        }else if(iChoice == 3){
                                    System.out.println("Deleting element...");
                                    s.pop();
                                    con = false;
                        }else if(iChoice == 4){
                                    s.displayStack();
                                    con = false;
                        }else if(iChoice == 5){
                                    System.out.println();
                                    System.out.println("The program will now exit...");
                                    repeatMenu = false;
                                    break;
                        }
                        while(!con){
                            System.out.println();
                            System.out.print("Do you want to continue? (Y/N): ");
                            sChoice = in.next();
                            if(sChoice.equalsIgnoreCase("y")){
                                menuStck = false;
                                break;
                            }else if(sChoice.equalsIgnoreCase("N")){
                                System.exit(0);
                                break;
                            }else{
                                System.out.println("Invalid choice, please try again.");
                                continue;
                            }
                        }

                    }//menuStck
            } else if(sChoice.equalsIgnoreCase("B")){
                System.out.println();
                System.out.print("Set the maximum size of stack (Press 0 to stop): ");
                queueMaxSize = in.nextInt();
                Queue q = new Queue(queueMaxSize);
                queueItems = new int[queueMaxSize];

                System.out.print("Enter elements: ");
                for(int i = 0; i < queueMaxSize; i++){
                    repeat = true;
                    boolean trigger = false;
                    while(repeat){
                        int insEle = in.nextInt();
                        if(insEle == 0){
                            trigger = true;
                            break;
                        }
                        if(!q.checkDup(insEle)) {
                            q.enQueue(insEle);
                            repeat = false;
                            repeatMenu = true;
                        }else{
                            System.out.println("Element duplicated.");
                        }
                    }
                    if(trigger == true){
                        break;
                    }
                }
                q.queueDisplay();
                while(!menuQueue){
                    System.out.println();
                    System.out.println("\t\tMenu");
                    System.out.println("1. Peek");
                    System.out.println("2. enQueue");
                    System.out.println("3. deQueue");
                    System.out.println("4. Display");
                    System.out.println("5. Exit");
                    System.out.print("Enter your choice: ");
                    iChoice = in.nextInt();

                    if(iChoice == 1){
                        if(!q.isEmpty()){
                            System.out.println("Element at the front: " + q.peekFront());
                        }else{
                            System.out.println("Queue is empty");
                        }
                        con = false;
                    }else if(iChoice == 2) {
                        while (true) {
                            System.out.print("Enter element to insert: ");
                            int insEle = in.nextInt();
                            if (q.isFull()) {
                                System.out.println("Queue is full, please delete delete element first.");
                                con = false;
                                break;
                            }
                            if (!q.checkDup(insEle)) {
                                q.enQueue(insEle);
                                break;
                            } else {
                                System.out.println("Cannot insert, element duplicated.");
                                continue;
                            }
                        }

                    }else if(iChoice == 3){
                        System.out.println("Deleting element...");
                        q.deQueue();
                        con = false;
                    }else if(iChoice == 4){
                        System.out.println("Displaying the elements: ");
                        q.queueDisplay();
                        con = false;
                    }else if(iChoice == 5){
                        System.out.println();
                        System.out.println("The program will now exit...");
                        repeatMenu = false;
                        break;
                    }
                    while(!con){
                        System.out.println();
                        System.out.print("Do you want to continue? (Y/N): ");
                        sChoice = in.next();
                        if(sChoice.equalsIgnoreCase("y")){
                            menuStck = false;
                            break;
                        }else if(sChoice.equalsIgnoreCase("N")){
                            System.exit(0);
                            break;
                        }else{
                            System.out.println("Invalid choice, please try again.");
                            continue;
                        }
                    }
                }//menuQueue

            }else{
                System.out.println("Invalid choice, please try again.");
                repeatMenu = false;
            }
        }//while



    }
}