// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * A repository contains the information needed for establishing
 * connections with
 *         remote repository.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class RepositoryBase
    implements java.io.Serializable, java.lang.Cloneable, org.apache.maven.model.InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *             
     *             A unique identifier for a repository. This is
     * used to match the repository
     *             to configuration in the
     * <code>settings.xml</code> file, for example. Furthermore,
     * the identifier is
     *             used during POM inheritance and profile
     * injection to detect repositories that should be merged.
     *             
     *           
     */
    private String id;

    /**
     * Human readable name of the repository.
     */
    private String name;

    /**
     * 
     *             
     *             The url of the repository, in the form
     * <code>protocol://hostname/path</code>.
     *             
     *           
     */
    private String url;

    /**
     * 
     *             
     *             The type of layout this repository uses for
     * locating and storing artifacts -
     *             can be <code>legacy</code> or
     * <code>default</code>.
     *             
     *           
     */
    private String layout = "default";

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return RepositoryBase
     */
    public RepositoryBase clone()
    {
        try
        {
            RepositoryBase copy = (RepositoryBase) super.clone();

            if ( copy.locations != null )
            {
                copy.locations = new java.util.LinkedHashMap( copy.locations );
            }

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- RepositoryBase clone()

    /**
     * Method equals.
     * 
     * @param other
     * @return boolean
     */
    public boolean equals( Object other )
    {
        if ( this == other )
        {
            return true;
        }

        if ( !( other instanceof RepositoryBase ) )
        {
            return false;
        }

        RepositoryBase that = (RepositoryBase) other;
        boolean result = true;

        result = result && ( getId() == null ? that.getId() == null : getId().equals( that.getId() ) );

        return result;
    } //-- boolean equals( Object )

    /**
     * Get a unique identifier for a repository. This is used to
     * match the repository
     *             to configuration in the
     * <code>settings.xml</code> file, for example. Furthermore,
     * the identifier is
     *             used during POM inheritance and profile
     * injection to detect repositories that should be merged.
     * 
     * @return String
     */
    public String getId()
    {
        return this.id;
    } //-- String getId()

    /**
     * Get the type of layout this repository uses for locating and
     * storing artifacts -
     *             can be <code>legacy</code> or
     * <code>default</code>.
     * 
     * @return String
     */
    public String getLayout()
    {
        return this.layout;
    } //-- String getLayout()

    /**
     * 
     * 
     * @param key
     * @return InputLocation
     */
    public InputLocation getLocation( Object key )
    {
        return ( locations != null ) ? locations.get( key ) : null;
    } //-- InputLocation getLocation( Object )

    /**
     * Get human readable name of the repository.
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get the url of the repository, in the form
     * <code>protocol://hostname/path</code>.
     * 
     * @return String
     */
    public String getUrl()
    {
        return this.url;
    } //-- String getUrl()

    /**
     * Method hashCode.
     * 
     * @return int
     */
    public int hashCode()
    {
        int result = 17;

        result = 37 * result + ( id != null ? id.hashCode() : 0 );

        return result;
    } //-- int hashCode()

    /**
     * Set a unique identifier for a repository. This is used to
     * match the repository
     *             to configuration in the
     * <code>settings.xml</code> file, for example. Furthermore,
     * the identifier is
     *             used during POM inheritance and profile
     * injection to detect repositories that should be merged.
     * 
     * @param id
     */
    public void setId( String id )
    {
        this.id = id;
    } //-- void setId( String )

    /**
     * Set the type of layout this repository uses for locating and
     * storing artifacts -
     *             can be <code>legacy</code> or
     * <code>default</code>.
     * 
     * @param layout
     */
    public void setLayout( String layout )
    {
        this.layout = layout;
    } //-- void setLayout( String )

    /**
     * 
     * 
     * @param key
     * @param location
     */
    public void setLocation( Object key, InputLocation location )
    {
        if ( location != null )
        {
            if ( this.locations == null )
            {
                this.locations = new java.util.LinkedHashMap<Object, InputLocation>();
            }
            this.locations.put( key, location );
        }
    } //-- void setLocation( Object, InputLocation )

    /**
     * Set human readable name of the repository.
     * 
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set the url of the repository, in the form
     * <code>protocol://hostname/path</code>.
     * 
     * @param url
     */
    public void setUrl( String url )
    {
        this.url = url;
    } //-- void setUrl( String )

    /**
     * Method toString.
     * 
     * @return String
     */
    public java.lang.String toString()
    {
        StringBuilder buf = new StringBuilder( 128 );

        buf.append( "id = '" );
        buf.append( getId() );
        buf.append( "'" );

        return buf.toString();
    } //-- java.lang.String toString()

}
