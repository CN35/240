import java.util.ArrayList;

public class TaskList 
{
	public static void main(String args[]) 
	{
		// Array of tasks
		ArrayList<Task> tasks = new ArrayList<Task>();
		
		// Create tasks
		tasks.add( new Task("Attend class", Priority.MAX_PRIORITY) );
		tasks.add( new Task("Homework", 2) );
		tasks.add( new Task("Exercise", 3) );
		tasks.add( new Task("Eat breakfast", 4) );
		tasks.add( new Task("Eat lunch", Priority.MIN_PRIORITY) );

		// Print task list
		System.out.println("Priority Task List");
		System.out.println("------------------");
		for (Task task : tasks)
		{
			System.out.println(task);
		}
	}
}