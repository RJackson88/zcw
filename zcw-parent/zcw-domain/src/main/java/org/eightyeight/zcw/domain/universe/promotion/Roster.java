package org.eightyeight.zcw.domain.universe.promotion;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by rickjackson on 3/29/17.
 */
@NodeEntity(label = "roster")
public class Roster extends MetaNodeEntity {
    
    public Roster() {
    
    }
}
