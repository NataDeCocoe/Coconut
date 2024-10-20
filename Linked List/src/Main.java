import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean menu = false;
        int choice = 0;
        String con;
        System.out.print("Set the maximum size of linked list: ");
        int mSize = in.nextInt();

        LinkedList list = new LinkedList(mSize);
        System.out.print("Enter elements [Press 0 to stop]: ");
        for(int i = 0; i < mSize; i++){
            boolean repeat = true;
            boolean control = false;
            while(repeat){
                int data = in.nextInt();
                if(data == 0){
                    control = true;
                    break;
                }
                if(!list.dupCheck(data)){
                    list.insertLast(data);
                    repeat = false;
                }else{
                    System.out.println("Data duplicated, please try again.");
                }
            }
            if(control == true){
                break;
            }
        }

        while(!menu){
            System.out.println();
            System.out.println("\t\tMenu");
            System.out.println("1. Search");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Sort");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            if(choice == 1){

                System.out.print("Enter element to search: ");
                int ele = in.nextInt();
                int position = list.find(ele);
                if(position == -1){
                    System.out.println("Cannot find element.");
                }else{
                    System.out.println("Found at index "+ position);
                }

                System.out.print("\nDo you want to continue? (Y/N) ");
                con = in.next();
                if(con.equalsIgnoreCase("y")){
                    continue;
                }else if(con.equalsIgnoreCase("n")){
                    break;
                }

            }else if(choice ==2){
                System.out.print("Enter the position of your element: ");
                int ele = in.nextInt();
                System.out.print("Enter the element: ");
                int insEle = in.nextInt();
                if(!list.dupCheck(insEle)){
                    list.insertAfter(insEle, ele);
                }else{
                    System.out.println("Invalid, element already exist.");
                }

                System.out.print("\nDo you want to continue? (Y/N) ");
                con = in.next();
                if(con.equalsIgnoreCase("y")){
                    continue;
                }else if(con.equalsIgnoreCase("n")){
                    break;
                }

            }else if(choice == 3) {
                System.out.print("Enter element to delete: ");
                int delEle = in.nextInt();
                if(list.deleteNa(delEle) == -1){
                    System.out.println("Element doesnt exist.");
                }else{
                    System.out.println("Element successfully deleted.");
                }

                System.out.print("\nDo you want to continue? (Y/N) ");
                con = in.next();
                if(con.equalsIgnoreCase("y")){
                    continue;
                }else if(con.equalsIgnoreCase("n")){
                    break;
                }

            }else if(choice == 4) {
                System.out.print("Displaying the elements: ");
                list.displayList();

                System.out.print("\nDo you want to continue? (Y/N) ");
                con = in.next();
                if(con.equalsIgnoreCase("y")){
                    continue;
                }else if(con.equalsIgnoreCase("n")){
                    break;
                }
            } else if (choice == 5) {
                list.sortingNa();

                System.out.print("\nDo you want to continue? (Y/N) ");
                con = in.next();
                if(con.equalsIgnoreCase("y")){
                    continue;
                }else if(con.equalsIgnoreCase("n")){
                    break;
                }
            } else if (choice == 6) {
                System.exit(0);
            }else{
                System.out.println("Invalid, please try again.");
            }
        }

    }
}