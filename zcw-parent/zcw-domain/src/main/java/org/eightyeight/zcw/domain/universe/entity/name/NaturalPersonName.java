package org.eightyeight.zcw.domain.universe.entity.name;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity(label = "NaturalPersonName")
public class NaturalPersonName extends PersonName {
    
    public NaturalPersonName() {
    
    }
}
