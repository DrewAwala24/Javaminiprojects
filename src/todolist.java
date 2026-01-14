import java.util.ArrayList;
import java.util.Scanner;

public class todolist {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();

        while (true){
            System.out.println("----SIMPLE TO DO LIST----");
            System.out.println("1. Enter Task: ");
            System.out.println("2. View Task: ");
            System.out.println("3. Remove Task: ");
            System.out.println("4. Exit!");
            System.out.println("--Choose Option--");

            int choice = scanner.nextInt();
            scanner.next();

            if (choice==1){
                System.out.println("enter task: ");
                String task = scanner.nextLine();
                tasks.add(task);
                System.out.println("task added!");
            } else if (choice==2) {
                if (tasks.isEmpty()){
                    System.out.println("No Task Added");
                }else {
                    System.out.println("Task:");
                    int i;
                    for (i = 0; i < tasks.size(); i++) ;
                    System.out.println((i + 1) + " " + tasks.get(i));
                }
            } else if (choice==3) {
                if (tasks.isEmpty()){
                    System.out.println("no tasks to remove");
                }else {
                    System.out.println("enter task number to be removed");
                    int taskNumber = scanner.nextInt();
                    if(taskNumber >= 1 && taskNumber >= tasks.size()){
                        tasks.remove(taskNumber - 1);
                        System.out.println("Task Removed!");
                    }else {
                        System.out.println("Invalid Task Number!");
                    }
                }
            } else if (choice==4) {
                System.out.println("Are you sure you want to Exit");
                String option = scanner.nextLine();
                if (option.equalsIgnoreCase("Y")){
                    System.out.println("GoodBye");
                } else if (option.equalsIgnoreCase("N")) {
                    System.out.println("Returning to Menu");
                }
                else {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}