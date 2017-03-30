package org.eightyeight.zcw.domain.universe.lang;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Labels;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 3/23/17.
 */
@NodeEntity
public class ElementSequence<E extends ElementNode> implements
    LanguageElement {
    
    @GraphId
    private long id;
    
    @Labels
    private List<String> labels = new ArrayList<>();
    
    @Relationship(type = "NODE", direction = Relationship.UNDIRECTED)
    private List<E> nodes;
    
    public ElementSequence(int initialCapacity) {
        this.nodes = new ArrayList<>(initialCapacity);
    }
    
    public ElementSequence() {
        this.nodes = new ArrayList<>();
    }
    
    // Query Operations
    
    public LanguageElement getElement(int index) {
        return nodes.get(index).getElement();
    }
    
    public void setElement(int index, LanguageElement element) {
        nodes.get(index).setElement(element);
    }
    
    public E getNode(int index) {
        return nodes.get(index);
    }
    
    public void setNode(int index, E node) {
        this.nodes.set(index, node);
    }
    
    public boolean addNode(E node) {
        return this.nodes.add(node);
    }
    
    public void addNode(int index, E node) {
        this.nodes.add(node);
    }
    
    public E removeNode(int index) {
        return this.nodes.remove(index);
    }
    
    public boolean removeNode(E node) {
        return this.nodes.remove(node);
    }
    
    public void clearNodes() {
        nodes.clear();
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
    
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
    
    public List<E> getNodes() {
        return nodes;
    }
    
    public void setNodes(List<E> nodes) {
        this.nodes = nodes;
    }
    
    // Query Operations
    
    public int elementsSize() {
        return nodes.size();
    }

    // Comparison and Hashing

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(this.getClass().isInstance(o))) return false;
        return id == ((ElementSequence) o).id;
    }

    @Override
    public int hashCode() {
        return Long.valueOf(id) == null ? System.identityHashCode(this)
                                        : Long.valueOf(id).hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elementsSize(); i++) {
            sb.append(nodes.get(i));
        }
        return sb.toString();
    }
}
