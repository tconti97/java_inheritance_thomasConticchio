/**
 * 
 */
package csci3444.inheritance;

/**
 * @author tcont
 *
 */
public class StudentImpl extends PersonBaseImpl implements Student
{
	String takenCourseTitle;
	public StudentImpl(String _name, String _takenCourseTitle)
	{
		super(_name);
		takenCourseTitle = _takenCourseTitle;
	}
	@Override
	public String getDetails() 
	{
		return "student";
	}
	
	@Override
	public String studiesFor() 
	{
		return takenCourseTitle;
	}
	
	
}
