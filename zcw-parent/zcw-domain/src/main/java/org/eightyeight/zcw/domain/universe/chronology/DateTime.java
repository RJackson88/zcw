package org.eightyeight.zcw.domain.universe.chronology;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by rickjackson on 3/30/17.
 */
@NodeEntity(label = "dateTime")
public class DateTime extends MetaNodeEntity {
    
    public DateTime() {
    
    }
}
