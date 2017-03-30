package org.eightyeight.zcw.domain.universe;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by rickjackson on 3/29/17.
 */
@NodeEntity(label = "universalTime")
public final class UTime extends MetaNodeEntity {
    
    public UTime() {
    
    }
    
    public UTime(int year, int month, int day) {
    
    }
}
