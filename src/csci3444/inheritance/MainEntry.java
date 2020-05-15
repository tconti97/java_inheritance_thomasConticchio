/**
 * 
 */
package csci3444.inheritance;

/**
 * @author tcont
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Person p1, p2;
		Teacher t = new TeacherImpl("ilker", "java");
		Student s = new StudentImpl("Thomas", "java");
		
		p1 = t;
		p2 = s;
		
		System.out.println("p1: " + p1.getName());
		System.out.println("p2: " + p2.getName());
	}

}
