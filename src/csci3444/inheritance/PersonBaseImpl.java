/**
 * 
 */
package csci3444.inheritance;

/**
 * @author tcont
 *
 */
public abstract class PersonBaseImpl implements Person 
{
	public String name;
	
	public PersonBaseImpl(String _name)
	{
		name = _name;
	}
	
	public String getName()
	{
		return name;
	}
}
