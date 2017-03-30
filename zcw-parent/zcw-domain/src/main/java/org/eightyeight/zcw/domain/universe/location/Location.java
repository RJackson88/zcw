package org.eightyeight.zcw.domain.universe.location;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by rickjackson on 3/23/17.
 */
@NodeEntity(label = "location")
public class Location extends MetaNodeEntity {
    
    public Location() {
    
    }
}
