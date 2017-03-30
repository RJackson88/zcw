package org.eightyeight.zcw.domain.meta;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity(label = "propertyMapRoot")
public abstract class PropertyMapRoot extends MetaNodeEntity {
    
    public PropertyMapRoot() {
    
    }
    
}
