package org.eightyeight.zcw.domain.universe.structure;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Labels;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import java.util.List;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity(label = "Magazine")
public class Magazine {
    @GraphId
    Long id;
    @Labels
    List<String> labels;
    @Property
    SourceStructureNodesTypes type = SourceStructureNodesTypes.MAGAZINE;
    @Property
    String name = type.toString();
    
    public Magazine() {
    
    }
}
