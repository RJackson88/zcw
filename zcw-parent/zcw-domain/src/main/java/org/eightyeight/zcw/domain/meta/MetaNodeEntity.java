package org.eightyeight.zcw.domain.meta;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Labels;
import org.neo4j.ogm.annotation.NodeEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity(label = "META")
public class MetaNodeEntity {
    @GraphId
    protected Long id;
    @Labels
    protected List<String> labels = new ArrayList<>();
    
    public MetaNodeEntity() {
    
    }
    
    public long getId() {
        return id;
    }
    
    public void delete() {
    
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public List<String> getLabels() {
        return labels;
    }
    
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
}
