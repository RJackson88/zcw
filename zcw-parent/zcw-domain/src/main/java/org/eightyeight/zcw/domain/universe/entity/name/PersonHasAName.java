package org.eightyeight.zcw.domain.universe.entity.name;

import org.eightyeight.zcw.domain.universe.entity.Person;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * Created by rickjackson on 3/28/17.
 */
@RelationshipEntity(type = "HAS_A")
public class PersonHasAName {
    @GraphId private Long id;
    @StartNode private Person person;
    @EndNode private Name name;
    @Property private int year;
    @Property private int month;
    @Property private int dayOfMonth;
    
    public PersonHasAName() {
    
    }
    
    
}
