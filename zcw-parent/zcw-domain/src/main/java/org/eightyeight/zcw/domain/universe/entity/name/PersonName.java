package org.eightyeight.zcw.domain.universe.entity.name;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Labels;
import java.util.List;

/**
 * Created by rickjackson on 3/28/17.
 */
public abstract class PersonName extends Name {
    @GraphId private Long id;
    @Labels private List<String> labels;
    
    public PersonName() {
    
    }
}
