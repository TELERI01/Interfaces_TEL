/**
*@author Tyler Lericos
*@version 1.0
*Interfaces 
*Spring Semester/Freshman
*/
public class Process implements Priority,Comparable<Process> {
	
	String processID;
	int priority;
	
	/*
	 * Process Constructor with String parameter
	 */
	public Process(String processID) 
	{
		this.processID = processID;
	}
	
	/*
	 * Setter for priority
	 */
	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}
	/*
	 * Getter for Priority
	 */
	@Override
	public int getPriority() {
		return priority;
	}
	/*
	 * Getter for ProcessID
	 */
	public String getProcessID() 
	{
		return processID;
	}
	/*
	 * toString Method
	 * returns process ID and priority
	 */
	@Override
	public String toString() {
		return "Process [ProcessID =" + processID + ", Priority =" + priority + "]";
	}
	/*
	 * Comparable method
	 */
	@Override
	public int compareTo(Process o) {
		int final_result = 0;
		
		if (o.priority == this.priority) 
		{
			final_result = 1;
		}
		else
			final_result = 0;
		
		return final_result;
	}
	
	

	
}
