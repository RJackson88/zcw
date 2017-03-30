package org.eightyeight.zcw.domain.universe.entity;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by rickjackson on 3/22/17.
 */
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
//                   property = "id")
@NodeEntity(label = "person")
public abstract class Person extends MetaNodeEntity {
    
    public Person() {
    
    }
}
