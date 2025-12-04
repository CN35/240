public interface Priority 
{
	// Constants for max and min priority levels
	static final int MAX_PRIORITY = 1;
	static final int MIN_PRIORITY = 5;

	// Abstract method that sets an object's priority level
	public void setPriority(int value);

	// Abstract method that returns an object's priority level
	public int getPriority();
}