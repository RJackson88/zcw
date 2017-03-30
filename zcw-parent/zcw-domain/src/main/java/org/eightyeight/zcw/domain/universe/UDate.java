package org.eightyeight.zcw.domain.universe;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * Created by rickjackson on 3/29/17.
 */
@NodeEntity(label = "universalDate")
public final class UDate extends MetaNodeEntity {
    @Property(name = "uYear")
    public static int YEAR;
    @Property(name = "uMonth")
    public static int MONTH;
    @Property(name = "uDay")
    public static int DAY;
    
    public UDate() {
    
    }
    
}
