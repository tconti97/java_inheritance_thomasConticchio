/**
 * 
 */
package csci3444.inheritance;

/**
 * @author tcont
 *
 */
public class TeacherImpl extends PersonBaseImpl implements Teacher
{
	String thoughtCourseTitle;
	
	public TeacherImpl(String _name, String _thoughtCourseTitle)
	{
		super(_name);
		thoughtCourseTitle = _thoughtCourseTitle;
	}
	
	@Override
	public String teachesFor()
	{
		return thoughtCourseTitle;
	}
	
	@Override
	public String getDetails()
	{
		return "teacher";
	}
}
