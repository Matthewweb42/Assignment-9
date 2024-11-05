import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Queue<String> todoList = new Queue<>();
        boolean done = false;
        while(!done) {
            printMenu();
            String input = scanner.nextLine().trim();
            // handle the input here
        }
        System.out.println("Goodbye!");
    }



    private static void printMenu() {
        System.out.println("===========================");
        System.out.println("What would you like to do?");
        System.out.println("(A) Add Todo Item");
        System.out.println("(G) Get Next Todo Item");
        System.out.println("(P) Print list of all Todo Items");
        System.out.println("(C) Clear Todo List");
        System.out.println("(E) Exit");
    }
}
