/*
 * Empleado.java
 *
 * Generated with Matisse Schema Definition Language 9.1.12
 * Generation date: Wed Jan 13 13:59:23 2021
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

package gest_proyectos;

import com.matisse.reflect.*;

/**
 * <code>Empleado</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class Empleado extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.12
     * Generation Date: Wed Jan 13 13:59:23 2021
     */

    /*
     * Class variables and methods
     */

    /** Class <code>Empleado</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("gest_proyectos.Empleado"));

    /**
     * Gets the <code>Empleado</code> class descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a class descriptor
     */
    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    /**
     * Factory constructor. This constructor is called by <code>MtObjectFactory</code>.
     * It is public for technical reasons but is not intended to be called
     * directly by user methods.
     * @param db a database
     * @param mtOid an existing object ID in the database
     */
    public Empleado(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected Empleado(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(Empleado.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, Empleado.class);
    }

    /**
     * Counts the number of instances of this class (and its subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(Empleado.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, Empleado.class);
    }

    /**
     * Counts the number of own instances of this class (excluding subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    /*
     * Attribute access methods
     */

    /* Attribute 'dni' */

    /** Attribute <code>dni</code> cache ID */
    private static int dniCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("dni",CID));

    /**
     * Gets the <code>dni</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getDniAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(dniCID);
    }


    /**
     * Gets the <code>dni</code> attribute value.
     * @return the value
     *
     * @see #setDni
     * @see #removeDni
     */
    public final String getDni() {
        return getString(getDniAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>dni</code> attribute value.
     * @param val the new value
     *
     * @see #getDni
     * @see #removeDni
     */
    public final void setDni(String val) {
        setString(getDniAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>dni</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getDni
     * @see #setDni
     */
    public final void removeDni() {
        removeValue(getDniAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getDni
     * @see #setDni
     */
    public final boolean isDniDefaultValue() {
        return isDefaultValue(getDniAttribute(getMtDatabase()));
    }


    /* Attribute 'nom_emp' */

    /** Attribute <code>nom_emp</code> cache ID */
    private static int nom_empCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("nom_emp",CID));

    /**
     * Gets the <code>nom_emp</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getNom_empAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(nom_empCID);
    }


    /**
     * Gets the <code>nom_emp</code> attribute value.
     * @return the value
     *
     * @see #setNom_emp
     * @see #removeNom_emp
     */
    public final String getNom_emp() {
        return getString(getNom_empAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>nom_emp</code> attribute value.
     * @param val the new value
     *
     * @see #getNom_emp
     * @see #removeNom_emp
     */
    public final void setNom_emp(String val) {
        setString(getNom_empAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>nom_emp</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getNom_emp
     * @see #setNom_emp
     */
    public final void removeNom_emp() {
        removeValue(getNom_empAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getNom_emp
     * @see #setNom_emp
     */
    public final boolean isNom_empDefaultValue() {
        return isDefaultValue(getNom_empAttribute(getMtDatabase()));
    }


    /*
     * Relationship access methods
     */

    /* Relationship 'asignado_a' */

    /** Relationship <code>asignado_a</code> cache ID */
    private static int asignado_aCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtRelationship.Loader("asignado_a",CID));

    /**
     * Gets the <code>asignado_a</code> relationship descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a relationship descriptor object
     */
    public static com.matisse.reflect.MtRelationship getAsignado_aRelationship(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtRelationship)db.getCachedObject(asignado_aCID);
    }

    /**
     * Gets the <code>asignado_a</code> relationship's successors.
     * @return an array of objects
     *
     * @see #getAsignado_aSize
     * @see #asignado_aIterator
     * @see #setAsignado_a
     * @see #removeAsignado_a
     */
    public final gest_proyectos.Proyecto[] getAsignado_a() {
        return (gest_proyectos.Proyecto[])getSuccessors(getAsignado_aRelationship(getMtDatabase()), gest_proyectos.Proyecto.class);
    }

    /**
     * Counts the <code>asignado_a</code> relationship's successors.
     * @return the number of successors
     *
     * @see #getAsignado_a
     * @see #asignado_aIterator
     * @see #setAsignado_a
     * @see #removeAsignado_a
     */
    public final int getAsignado_aSize() {
        return getSuccessorSize(getAsignado_aRelationship(getMtDatabase()));
    }

    /**
     * Opens an iterator on the <code>asignado_a</code> relationship's successors.
     * @param <E> a MtObject class     * @return an object iterator
     *
     * @see #getAsignado_a
     * @see #getAsignado_aSize
     * @see #setAsignado_a
     * @see #removeAsignado_a
     */
    public final <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> asignado_aIterator() {
        return this.<E>successorIterator(getAsignado_aRelationship(getMtDatabase()), gest_proyectos.Proyecto.class);
    }

    /**
     * Sets the <code>asignado_a</code> relationship's successors.
     * @param succs an array of objects
     *
     * @see #getAsignado_a
     * @see #getAsignado_aSize
     * @see #asignado_aIterator
     * @see #removeAsignado_a
     */
    public final void setAsignado_a(gest_proyectos.Proyecto[] succs) {
        setSuccessors(getAsignado_aRelationship(getMtDatabase()), succs);
    }

    /**
     * Inserts one object at the beginning of the existing <code>asignado_a</code> successors list.
     * @param succ the object to add
     *
     * @see #getAsignado_a
     * @see #getAsignado_aSize
     * @see #asignado_aIterator
     * @see #setAsignado_a
     * @see #removeAsignado_a
     */
    public final void prependAsignado_a(gest_proyectos.Proyecto succ) {
        prependSuccessor(getAsignado_aRelationship(getMtDatabase()), succ);
    }

    /**
     * Adds one object to the end of the existing <code>asignado_a</code> successors list.
     * @param succ the object to add
     *
     * @see #getAsignado_a
     * @see #setAsignado_a
     * @see #removeAsignado_a
     * @see #getAsignado_aSize
     * @see #asignado_aIterator
     */
    public final void appendAsignado_a(gest_proyectos.Proyecto succ) {
        appendSuccessor(getAsignado_aRelationship(getMtDatabase()), succ);
    }
    /** Adds multiple objects to the end of the existing <code>asignado_a</code> successors list.
     * @param succs an array of objects to add
     *
     * @see #getAsignado_a
     * @see #setAsignado_a
     * @see #removeAsignado_a
     * @see #getAsignado_aSize
     * @see #asignado_aIterator
     */
    public final void appendAsignado_a(gest_proyectos.Proyecto[] succs) {
        addSuccessors(getAsignado_aRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes objects from the <code>asignado_a</code> successors list.
     * @param succs an array of objects to remove
     *
     * @see #getAsignado_a
     * @see #setAsignado_a
     * @see #getAsignado_aSize
     * @see #asignado_aIterator
     */
    public void removeAsignado_a(gest_proyectos.Proyecto[] succs) {
        removeSuccessors(getAsignado_aRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes one object from the <code>asignado_a</code> successors list.
     * @param succ the object to remove
     *
     * @see #getAsignado_a
     * @see #setAsignado_a
     * @see #getAsignado_aSize
     * @see #asignado_aIterator
     */
    public void removeAsignado_a(gest_proyectos.Proyecto succ) {
        removeSuccessor(getAsignado_aRelationship(getMtDatabase()), succ);
    }

    /**
     * Removes all <code>asignado_a</code> successors.  When the minimum cardinality
     * is 1, a new successor must be set before commit.
     */
    public final void clearAsignado_a() {
        clearSuccessors(getAsignado_aRelationship(getMtDatabase()));
    }


    /* Relationship 'tiene_datos_prof' */

    /** Relationship <code>tiene_datos_prof</code> cache ID */
    private static int tiene_datos_profCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtRelationship.Loader("tiene_datos_prof",CID));

    /**
     * Gets the <code>tiene_datos_prof</code> relationship descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a relationship descriptor object
     */
    public static com.matisse.reflect.MtRelationship getTiene_datos_profRelationship(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtRelationship)db.getCachedObject(tiene_datos_profCID);
    }

    /**
     * Gets the <code>tiene_datos_prof</code> sucessor object.
     * @return an object 
     *
     * @see #setTiene_datos_prof
     * @see #clearTiene_datos_prof
     */
    public final gest_proyectos.DatosProfesionales getTiene_datos_prof() {
        return (gest_proyectos.DatosProfesionales)getSuccessor(getTiene_datos_profRelationship(getMtDatabase()));
    }

    /**
     * Sets the <code>tiene_datos_prof</code> successor object. It is not necessary to clear the
     * relationship before setting a new successor.
     * @param succ the new successor object
     *
     * @see #getTiene_datos_prof
     * @see #clearTiene_datos_prof
     */
    public final void setTiene_datos_prof(gest_proyectos.DatosProfesionales succ) {
        setSuccessor(getTiene_datos_profRelationship(getMtDatabase()), succ);
    }

    /**
     * Removes all <code>tiene_datos_prof</code> successors.  When the minimum cardinality
     * is 1, a new successor must be set before commit.
     */
    public final void clearTiene_datos_prof() {
        clearSuccessors(getTiene_datos_profRelationship(getMtDatabase()));
    }


    /*
     * Index access methods
     */

    /* Index 'Empleado_pk' */

    /** Index <code>Empleado_pk</code> cache ID */
    private static int empleado_pkIndexCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtIndex.Loader("gest_proyectos.Empleado_pk"));

    /**
     * Gets the <code>Empleado_pk</code> index descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return an index descriptor object
     */
    public static com.matisse.reflect.MtIndex getEmpleado_pkIndex(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtIndex)db.getCachedObject(empleado_pkIndexCID);
    }

    /**
     * Finds one <code>Empleado</code> object in index <code>Empleado_pk</code>.
     * @param db a database
     * @param dni search parameter
     * @return the matching <code>Empleado</code> object or <code>null</code> if none was found
     */
    public static Empleado lookupEmpleado_pk(com.matisse.MtDatabase db, String dni) {
        return (Empleado)getEmpleado_pkIndex(db).lookup(new Object[] {dni}, getClass(db));
    }

    /**
     * Finds <code>Empleado</code> objects in index <code>Empleado_pk</code>.
     * @param db a database
     * @param dni search parameter
     * @return the matching <code>Empleado</code> objects or an empty array if none was found
     */
    public static Empleado[] lookupObjectsEmpleado_pk(com.matisse.MtDatabase db, String dni) {
        return (Empleado[])getEmpleado_pkIndex(db).lookupObjects(new Object[] {dni}, getClass(db), Empleado.class);
    }

    /**
     * Opens an iterator on index <code>Empleado_pk</code> for class <code>Empleado</code>.
     * Each indexed attribute has a pair of "from" and "to" parameters which
     * define the search range for that attribute.  With strings, you may use
     * <code>null</code> to start "from" at the beginning or extend "to" to the end.
     * @param <E> a MtObject class     * @param db a database
     * @param fromDni search parameter
     * @param toDni search parameter
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> empleado_pkIterator(com.matisse.MtDatabase db, String fromDni, String toDni) {
        return getEmpleado_pkIndex(db).<E>iterator(new Object[] {fromDni}, new Object[] {toDni}, getClass(db), com.matisse.reflect.MtIndex.DIRECT, com.matisse.MtDatabase.MAX_PREFETCHING, Empleado.class);
    }

    /**
     * Opens an iterator on index <code>Empleado_pk</code> for class <code>Empleado</code>. 
     * Each indexed attribute has a pair of "from" and "to" parameters which
     * define the search range for that attribute.  With strings, you may use
     * <code>null</code> to start "from" at the beginning or extend "to" to the end.
     * @param <E> a MtObject class     * @param db a database
     * @param fromDni search parameter
     * @param toDni search parameter
     * @param filterClass a subclass; use <code>null</code> not to restrict iterator to a subclass
     * @param direction MtIndex.DIRECT or MtIndex.REVERSE
     * @param numObjPerBuffer maximum number of objects to be retrieved in each request to server
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> empleado_pkIterator(com.matisse.MtDatabase db, String fromDni, String toDni, com.matisse.reflect.MtClass filterClass, int direction, int numObjPerBuffer) {
        return getEmpleado_pkIndex(db).iterator(new Object[] {fromDni}, new Object[] {toDni}, filterClass, direction, numObjPerBuffer, Empleado.class);
    }

    /* Index 'Empleado_i_nom_emp' */

    /** Index <code>Empleado_i_nom_emp</code> cache ID */
    private static int empleado_i_nom_empIndexCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtIndex.Loader("gest_proyectos.Empleado_i_nom_emp"));

    /**
     * Gets the <code>Empleado_i_nom_emp</code> index descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return an index descriptor object
     */
    public static com.matisse.reflect.MtIndex getEmpleado_i_nom_empIndex(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtIndex)db.getCachedObject(empleado_i_nom_empIndexCID);
    }

    /**
     * Finds one <code>Empleado</code> object in index <code>Empleado_i_nom_emp</code>.
     * @param db a database
     * @param nom_emp search parameter
     * @return the matching <code>Empleado</code> object or <code>null</code> if none was found
     */
    public static Empleado lookupEmpleado_i_nom_emp(com.matisse.MtDatabase db, String nom_emp) {
        return (Empleado)getEmpleado_i_nom_empIndex(db).lookup(new Object[] {nom_emp}, getClass(db));
    }

    /**
     * Finds <code>Empleado</code> objects in index <code>Empleado_i_nom_emp</code>.
     * @param db a database
     * @param nom_emp search parameter
     * @return the matching <code>Empleado</code> objects or an empty array if none was found
     */
    public static Empleado[] lookupObjectsEmpleado_i_nom_emp(com.matisse.MtDatabase db, String nom_emp) {
        return (Empleado[])getEmpleado_i_nom_empIndex(db).lookupObjects(new Object[] {nom_emp}, getClass(db), Empleado.class);
    }

    /**
     * Opens an iterator on index <code>Empleado_i_nom_emp</code> for class <code>Empleado</code>.
     * Each indexed attribute has a pair of "from" and "to" parameters which
     * define the search range for that attribute.  With strings, you may use
     * <code>null</code> to start "from" at the beginning or extend "to" to the end.
     * @param <E> a MtObject class     * @param db a database
     * @param fromNom_emp search parameter
     * @param toNom_emp search parameter
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> empleado_i_nom_empIterator(com.matisse.MtDatabase db, String fromNom_emp, String toNom_emp) {
        return getEmpleado_i_nom_empIndex(db).<E>iterator(new Object[] {fromNom_emp}, new Object[] {toNom_emp}, getClass(db), com.matisse.reflect.MtIndex.DIRECT, com.matisse.MtDatabase.MAX_PREFETCHING, Empleado.class);
    }

    /**
     * Opens an iterator on index <code>Empleado_i_nom_emp</code> for class <code>Empleado</code>. 
     * Each indexed attribute has a pair of "from" and "to" parameters which
     * define the search range for that attribute.  With strings, you may use
     * <code>null</code> to start "from" at the beginning or extend "to" to the end.
     * @param <E> a MtObject class     * @param db a database
     * @param fromNom_emp search parameter
     * @param toNom_emp search parameter
     * @param filterClass a subclass; use <code>null</code> not to restrict iterator to a subclass
     * @param direction MtIndex.DIRECT or MtIndex.REVERSE
     * @param numObjPerBuffer maximum number of objects to be retrieved in each request to server
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> empleado_i_nom_empIterator(com.matisse.MtDatabase db, String fromNom_emp, String toNom_emp, com.matisse.reflect.MtClass filterClass, int direction, int numObjPerBuffer) {
        return getEmpleado_i_nom_empIndex(db).iterator(new Object[] {fromNom_emp}, new Object[] {toNom_emp}, filterClass, direction, numObjPerBuffer, Empleado.class);
    }

    // END of Matisse SDL Generated Code

    /*
     * You may add your own code here...
     */

    public float subeSueldoBruto(float incr)
    {
        DatosProfesionales datos = this.getTiene_datos_prof();
        
        if(datos.isSueldo_bruto_anualDefaultValue()!=true)
        {
            float sueldo = datos.getSueldo_bruto_anual();
            sueldo += sueldo*(incr/100);
            datos.setSueldo_bruto_anual(sueldo);
            return sueldo;
        }
        else
        {
            return -1;
        }
    }
    
    /**
     * Default constructor provided as an example.
     * You may delete this constructor or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @param db a database
     */
    public Empleado(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[Empleado]";
    }
}
