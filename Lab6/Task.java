public class Task implements Priority 
{
	// Fields
	String name;
	private int priority;

	// Methods
	// Constructors
	public Task()
	{
		name = "";
		priority = Priority.MIN_PRIORITY;
	}
	public Task(String name, int priority) 
	{
		this.name = name;
		this.priority = priority;
	}

	// Implement Priority interface methods
	public void setPriority(int value) 
	{
		priority = value;
	}
	public int getPriority() 
	{
		return priority;
	}

	// toString
	public String toString() 
	{
		String result = name;
		result += " \tpriority: ";
		result += priority;
		return result;
	}

	// Getter/setter for name
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
}