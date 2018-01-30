package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 6
 *  returns their name and a
 *  modified string 
 *  
 *  @author Joshua
 *  @version 1.1
 */
public class Person6 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person6(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 1 put your implementation here
		String result = "";
		for (int i = 2; i < input.length; i++) {
			result = result + input.charAt(i);
		}
		result = result + input.charAt(0);
		result = result + input.charAt(1);
	  return result;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
