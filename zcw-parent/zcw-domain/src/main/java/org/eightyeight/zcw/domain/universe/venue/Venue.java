package org.eightyeight.zcw.domain.universe.venue;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by rickjackson on 3/29/17.
 */
@NodeEntity(label = "venue")
public class Venue extends MetaNodeEntity {
    
    public Venue() {
    
    }
}
