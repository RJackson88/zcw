package org.eightyeight.zcw.domain.meta;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Labels;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import java.util.List;

/**
 * Created by rickjackson on 3/28/17.
 */
@RelationshipEntity(type = "META")
public abstract class MetaRelationshipEntity<S, E> {
    @GraphId
    protected Long id;
    @Labels
    protected List<String> labels;
    @StartNode
    protected S startNode;
    @EndNode
    protected E endNode;
    
    
    public MetaRelationshipEntity() {
    
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    protected S getStartNode() {
        return startNode;
    }
    
    protected void setStartNode(S startNode) {
        this.startNode = startNode;
    }
    
    protected E getEndNode() {
        return endNode;
    }
    
    protected void setEndNode(E endNode) {
        this.endNode = endNode;
    }
    
    protected List<String> getLabels() {
        return labels;
    }
    
    protected void setLabels(List<String> labels) {
        this.labels = labels;
    }
}
