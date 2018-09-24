// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * The conditions within the build runtime environment which will
 * trigger the
 *         automatic inclusion of the build profile. Multiple
 * conditions can be defined, which must
 *         be all satisfied to activate the profile.
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Activation
    implements java.io.Serializable, java.lang.Cloneable, org.apache.maven.model.InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * If set to true, this profile will be active unless another
     * profile in this
     *             pom is activated using the command line -P
     * option or by one of that profile's
     *             activators.
     */
    private boolean activeByDefault = false;

    /**
     * 
     *             
     *             Specifies that this profile will be activated
     * when a matching JDK is detected.
     *             For example, <code>1.4</code> only activates on
     * JDKs versioned 1.4,
     *             while <code>!1.4</code> matches any JDK that is
     * not version 1.4. Ranges are supported too:
     *             <code>[1.5,)</code> activates when the JDK is
     * 1.5 minimum.
     *             
     *           
     */
    private String jdk;

    /**
     * Specifies that this profile will be activated when matching
     * operating system
     *             attributes are detected.
     */
    private ActivationOS os;

    /**
     * Specifies that this profile will be activated when this
     * system property is
     *             specified.
     */
    private ActivationProperty property;

    /**
     * Specifies that this profile will be activated based on
     * existence of a file.
     */
    private ActivationFile file;

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
     * @return Activation
     */
    public Activation clone()
    {
        try
        {
            Activation copy = (Activation) super.clone();

            if ( this.os != null )
            {
                copy.os = (ActivationOS) this.os.clone();
            }

            if ( this.property != null )
            {
                copy.property = (ActivationProperty) this.property.clone();
            }

            if ( this.file != null )
            {
                copy.file = (ActivationFile) this.file.clone();
            }

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
    } //-- Activation clone()

    /**
     * Get specifies that this profile will be activated based on
     * existence of a file.
     * 
     * @return ActivationFile
     */
    public ActivationFile getFile()
    {
        return this.file;
    } //-- ActivationFile getFile()

    /**
     * Get specifies that this profile will be activated when a
     * matching JDK is detected.
     *             For example, <code>1.4</code> only activates on
     * JDKs versioned 1.4,
     *             while <code>!1.4</code> matches any JDK that is
     * not version 1.4. Ranges are supported too:
     *             <code>[1.5,)</code> activates when the JDK is
     * 1.5 minimum.
     * 
     * @return String
     */
    public String getJdk()
    {
        return this.jdk;
    } //-- String getJdk()

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
     * Get specifies that this profile will be activated when
     * matching operating system
     *             attributes are detected.
     * 
     * @return ActivationOS
     */
    public ActivationOS getOs()
    {
        return this.os;
    } //-- ActivationOS getOs()

    /**
     * Get specifies that this profile will be activated when this
     * system property is
     *             specified.
     * 
     * @return ActivationProperty
     */
    public ActivationProperty getProperty()
    {
        return this.property;
    } //-- ActivationProperty getProperty()

    /**
     * Get if set to true, this profile will be active unless
     * another profile in this
     *             pom is activated using the command line -P
     * option or by one of that profile's
     *             activators.
     * 
     * @return boolean
     */
    public boolean isActiveByDefault()
    {
        return this.activeByDefault;
    } //-- boolean isActiveByDefault()

    /**
     * Set if set to true, this profile will be active unless
     * another profile in this
     *             pom is activated using the command line -P
     * option or by one of that profile's
     *             activators.
     * 
     * @param activeByDefault
     */
    public void setActiveByDefault( boolean activeByDefault )
    {
        this.activeByDefault = activeByDefault;
    } //-- void setActiveByDefault( boolean )

    /**
     * Set specifies that this profile will be activated based on
     * existence of a file.
     * 
     * @param file
     */
    public void setFile( ActivationFile file )
    {
        this.file = file;
    } //-- void setFile( ActivationFile )

    /**
     * Set specifies that this profile will be activated when a
     * matching JDK is detected.
     *             For example, <code>1.4</code> only activates on
     * JDKs versioned 1.4,
     *             while <code>!1.4</code> matches any JDK that is
     * not version 1.4. Ranges are supported too:
     *             <code>[1.5,)</code> activates when the JDK is
     * 1.5 minimum.
     * 
     * @param jdk
     */
    public void setJdk( String jdk )
    {
        this.jdk = jdk;
    } //-- void setJdk( String )

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
     * Set specifies that this profile will be activated when
     * matching operating system
     *             attributes are detected.
     * 
     * @param os
     */
    public void setOs( ActivationOS os )
    {
        this.os = os;
    } //-- void setOs( ActivationOS )

    /**
     * Set specifies that this profile will be activated when this
     * system property is
     *             specified.
     * 
     * @param property
     */
    public void setProperty( ActivationProperty property )
    {
        this.property = property;
    } //-- void setProperty( ActivationProperty )

}
