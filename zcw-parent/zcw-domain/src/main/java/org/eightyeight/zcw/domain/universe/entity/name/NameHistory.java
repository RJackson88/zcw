package org.eightyeight.zcw.domain.universe.entity.name;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Labels;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import java.util.List;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity
public class NameHistory {
    @GraphId private Long id;
    @Labels private List<String> labels;
    @Relationship(type = "HAS_A", direction = "INCOMING")
    private List<Name> names;
    
    public NameHistory() {
    
    }
}
