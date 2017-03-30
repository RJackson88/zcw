package org.eightyeight.zcw.domain.meta;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import java.util.Objects;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity(label = "MetaProperty")
public class MetaProperty<K extends String, V> {
    @Property(name = "key")
    protected K key;
    @Property(name = "value")
    protected V value;
    
    public MetaProperty() {
    
    }
    
    public MetaProperty(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    protected static <K extends String,V> MetaProperty<K,V> with(K key,
                                                                 V value) {
        return new MetaProperty<K, V>(key, value);
    }
    
    protected K getKey() {
        return key;
    }
    
    protected void setKey(K key) {
        this.key = key;
    }
    
    protected V getValue() {
        return value;
    }
    
    protected void setValue(V value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return key + " : " + value.toString();
    }
    
    protected Object asParameter() {
        return this;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(this.getClass().isInstance(o))) return false;
        return this.value.equals(this.getClass().cast(o).getValue());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this);
    }
}
