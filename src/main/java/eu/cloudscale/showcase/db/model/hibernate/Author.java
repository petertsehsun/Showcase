package eu.cloudscale.showcase.db.model.hibernate;

// Generated May 16, 2013 3:07:18 PM by Hibernate Tools 4.0.0

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import eu.cloudscale.showcase.db.model.IAuthor;
import eu.cloudscale.showcase.db.model.IItem;

/**
 * Author generated by hbm2java
 */
@Entity
@Table( name = "author", catalog = "tpcw" )
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Author implements IAuthor, Serializable
{

    private static final long serialVersionUID = 1L;

	private Integer      aId;

	private String      AFname;

	private String      ALname;

	private String      AMname;

	private Date        ADob;

	private String      ABio;

	private Set<IItem> items = new HashSet<IItem>( 0 );

	public Author()
	{
	}

	public Author(String AFname, String ALname, String AMname, Date ADob,
	        String ABio, Set<IItem> items)
	{
		this.AFname = AFname;
		this.ALname = ALname;
		this.AMname = AMname;
		this.ADob = ADob;
		this.ABio = ABio;
		this.items = items;
	}

	@Id
	@GeneratedValue( strategy = IDENTITY )
	@Column( name = "A_ID", unique = true, nullable = false )
	@Override
	public Integer getAId()
	{
		return this.aId;
	}

	@Override
	public void setAId(Integer AId)
	{
		this.aId = AId;
	}

	@Column( name = "A_FNAME", length = 20 )
	@Override
	public String getAFname()
	{
		return this.AFname;
	}

	@Override
	public void setAFname(String AFname)
	{
		this.AFname = AFname;
	}

	@Column( name = "A_LNAME", length = 20 )
	@Override
	public String getALname()
	{
		return this.ALname;
	}

	@Override
	public void setALname(String ALname)
	{
		this.ALname = ALname;
	}

	@Column( name = "A_MNAME", length = 20 )
	@Override
	public String getAMname()
	{
		return this.AMname;
	}

	@Override
	public void setAMname(String AMname)
	{
		this.AMname = AMname;
	}

	@Temporal( TemporalType.TIMESTAMP )
	@Column( name = "A_DOB", length = 19 )
	@Override
	public Date getADob()
	{
		return this.ADob;
	}

	@Override
	public void setADob(Date ADob)
	{
		this.ADob = ADob;
	}

	@Column( name = "A_BIO", length = 65535 )
	@Override
	public String getABio()
	{
		return this.ABio;
	}

	@Override
	public void setABio(String ABio)
	{
		this.ABio = ABio;
	}

	@OneToMany( targetEntity=Item.class, fetch = FetchType.LAZY, mappedBy = "author" )
	public Set<IItem> getItems()
	{
		return this.items;
	}

	public void setItems(Set<IItem> items)
	{
		this.items = items;
	}

}
