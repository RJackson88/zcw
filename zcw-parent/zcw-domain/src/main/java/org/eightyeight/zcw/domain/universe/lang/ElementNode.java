package org.eightyeight.zcw.domain.universe.lang;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Labels;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import java.util.List;

/**
 * Created by rickjackson on 3/24/17.
 */
@NodeEntity
public class ElementNode<S extends LanguageElement, E extends LanguageElement>
    implements LanguageElement {
    
    @GraphId
    private long id;
    
    @Labels
    private List<String> labels;
    
    @Relationship(type = "SEQUENCE", direction = Relationship.UNDIRECTED)
    private S sequence;
    
    @Relationship(type = "ELEMENT", direction = Relationship.UNDIRECTED)
    private E element;
    
    
    
    public ElementNode() {
    
    }
    
    // Label Modification Operations
    
    public String getLabel(int index) {
        return labels.get(index);
    }
    
    public void setLabel(int index, String label) {
        this.labels.set(index, label);
    }
    
    public boolean addLabel(String label) {
        return this.labels.add(label);
    }
    
    public void addLabel(int index, String label) {
        this.labels.add(index, label);
    }
    
    public String removeLabel(int index) {
        return labels.remove(index);
    }
    
    public boolean removeLabel(String label) {
        return this.labels.remove(label);
    }
    
    public void clearLabels() {
        labels.clear();
    }
    
    // Getters and Setters
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public List<String> getLabels() {
        return labels;
    }
    
    public void setLabels(List<String> setLabels) {
        this.labels = labels;
    }
    
    public LanguageElement getElementSequence() {
        return sequence;
    }
    
    public void setElementSequence(S elementSequence) {
        this.sequence = elementSequence;
    }
    
    public LanguageElement getElement() {
        return element;
    }
    
    public void setElement(E element) {
        this.element = element;
    }
}
