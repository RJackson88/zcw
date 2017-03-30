package org.eightyeight.zcw.domain.universe;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * Created by rickjackson on 3/29/17.
 */
@NodeEntity(label = "universalDateTime")
public final class UDateTime extends MetaNodeEntity {
    @Property(name = "uYear")
    public static int YEAR;
    @Property(name = "uMonth")
    public static int MONTH;
    @Property(name = "uDay")
    public static int DAY;
    @Property(name = "uEra")
    public static int ERA;
    
    public UDateTime() {
    
    }
    
    
}
