package org.eightyeight.zcw.domain.universe.entity.name;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity(label = "name")
public class Name extends MetaNodeEntity {
    @Property(name = "name")
    private String name;
    
    public Name() {
    
    }
}
