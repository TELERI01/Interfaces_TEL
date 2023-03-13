/**
*@author Tyler Lericos
*@version 1.0
*Interfaces 
*Spring Semester/Freshman
*/

public class Task implements Priority {
	/*
	 * Enumerated type Status with.
	 */
	enum Status
	{
		NOT_STARTED,
		IN_PROCESS,
		COMPLETE
	}
	
	Status status;
	public String name;
	public int priority;
	
	/*
	 * Empty Constructor
	 */
	public Task() 
	{}
	/*
	 * Constuctor with parameters for name and priority
	 */
	public Task(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}
	/*
	 * Setter for Status
	 */
	public void setStatus(Status status) 
	{
		this.status = status;
	}
	/*
	 * getter for Status
	 */
	public Task.Status getStatus() 
	{
		return this.status;
		
	}
	/*
	 * Getter for name
	 */
	public String getName() {
		return name;
	}
	/*
	 * Setter for name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * getter for priority
	 */
	public int getPriority() {
		return priority;
	}
	
	/*
	 * setter from Priority Interface
	 */
	@Override
	public void setPriority(int priority) {
		this.priority = priority;
		
	}
	/*
	 * toString method, returns name, priority and Status
	 */
	@Override
	public String toString() {
		return "Task [Name: " + name + ", Priority:" + priority + ", Status: " + status+ "]";
	}
	/*
	 * Override for Comparable interface
	 */
	public int compareTo(Task o) 
	{
		int finalresult = 0;
		
		if (o.priority == this.priority) 
		{
			finalresult = 1;
		}
		else
			finalresult = 0;
		
		return finalresult;
	}
	
	
	
}
