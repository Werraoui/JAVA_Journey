import java.util.ArrayList;
import java.util.Scanner;


public class todolist
{
    //ArrayList object is type of array that is not static but dynamic where you can specify the size after declaration
    //its methods 
    //.size() ==> TO GET THE LENGTH .add() ===> TO ADD AN ELEMENT .remove() ==> TO REMOVE AN ELEMENT 
    //.get()==> TO GET .. // .set() ===> TO SET


    private static ArrayList<String> tasks = new ArrayList<String>();
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
         while(true)
        {
            displayMenu();

            int n_choice = in.nextInt();
            in.nextLine();//used to clean the buffer from the next line that 
            // is empty that was stored when clicking enter when entering the n_choice

            switch(n_choice)
            {
                case 1 -> displayTasks() ;
                case 2 -> addTask();
                case 3 -> removeTask();
                case 4 -> markTask();
                case 5 -> System.err.println("Exiting .... ");
                default -> System.err.println("invalid choice");
            }
        }
    }
    public static void displayMenu()
    {
        System.out.println("------ To do list menu --------");
        System.out.println("1-view the tasks you have.");
        System.out.println("2-add a task.");
        System.out.println("3-remove a task.");
        System.out.println("4-mark a task as done.");
        System.out.println("5-Exit.");
        System.out.println("-------------------------------");
        System.out.println("Choose what you want by the numbers provided :");

    }
    public static void displayTasks()
    {
        if (tasks.isEmpty())
        {
            System.out.println("there is no tasks available yet");
        }
        else
        {
            System.out.println("Here is your tasks :");
            for (int i=0;i < tasks.size() ;i++)
            {
                System.out.println((i + 1)+ "-" + tasks.get(i));
            }
        }
        

    }
    public static void addTask()
    {
        System.out.println("Enter the task :");
        String task;
        task = in.nextLine();

        tasks.add(task);
        System.out.println("Task added succesfully!!");

    }
    public static void removeTask()
    {
        displayTasks();
        System.out.println("Enter the number of the task you want to delete :");
        int n_task = in.nextInt();
        in.nextLine();

        if (n_task < 0 || n_task > tasks.size())
        {
            System.err.println("invalid number!!!");
        }
        else
        {
            tasks.remove(n_task-1);
        }
    }
    public static void markTask()
    {
        displayTasks();
        System.out.println("Enter the number of the completed task :");
        int n_task = in.nextInt();
        in.nextLine();


        if (n_task < 0 || n_task > tasks.size())
        {
            System.err.println("invalid number!!!");
        }
        else
        {
            for(int i=0;i < tasks.size();i++)
            {
                if (i+1 == n_task)
                {
                    tasks.set(i,tasks.get(i) + "***done***");
                    
                } 
            }

        }
        
    }
    
}   