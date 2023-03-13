/**
*@author Tyler Lericos
*@version 1.0
*Interfaces 
*Spring Semester/Freshman
*/
public interface Priority {

	
	int MED_PRIORITY = 5; 
	int MIN_PRIORITY = 1;
	int MAX_PRIORITY = 10;
	
	/*
	 * setter for priority
	 */
	public void setPriority(int priority);
	
	/*
	 * getter for priority
	 */
	public int getPriority();
	
	
	
}
