package dto;

/**
 * メンバー情報を表すDTO.
 * 
 * @author igamasayuki
 *
 */
public class Member
{
	private Integer id ;
	private String name ;
	private Integer age ;
	private Integer depId ;

	public Member() {}

	public Member( Integer id, String name, Integer age, Integer depId )
	{
		setId( id ) ;
		setName( name ) ;
		setAge( age ) ;
		setDepId( depId ) ;
	}

		public Member( String name, Integer age, Integer depId )
	{
		setName( name ) ;
		setAge( age ) ;
		setDepId( depId ) ;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId( Integer id )
	{
		this.id = id ;
	}

	public String getName()
	{
		return this.name ;
	}

	public void setName( String name )
	{
		this.name = name ;
	}

	public Integer getAge()
	{
		return this.age ;
	}

	public void setAge( Integer age )
	{
		this.age = age ;
	}

	public Integer getDepId()
	{
		return this.depId ;
	}

	public void setDepId( Integer depId )
	{
		this.depId = depId ;
	}

	@Override
	public String toString()
	{
		return ( "Member [id=" + getId() + ", name=" + getName() + ", age=" + getAge() + ", depId=" + getDepId() + "]" ) ;
	}
}
