package org.eightyeight.zcw.domain.universe.entity;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity(label = "ownership")
public class Ownership extends MetaNodeEntity {
    @Relationship(type = "OWNER_OF", direction = "INCOMING")
    private Person parent;
    @Relationship(type = "OWNER_OF")
    private Person child;
    @Property(name = "startYear")
    private int startYear;
    @Property(name = "startMonth")
    private int startMonth;
    @Property(name = "startDay")
    private int startDay;
    @Property(name = "endYear")
    private int endYear;
    @Property(name = "endMonth")
    private int endMonth;
    @Property(name = "endDay")
    private int endDay;
    
    public Ownership() {
    
    }
    
}
