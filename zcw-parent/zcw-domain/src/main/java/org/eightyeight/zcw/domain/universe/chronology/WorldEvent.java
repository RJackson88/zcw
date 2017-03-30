package org.eightyeight.zcw.domain.universe.chronology;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Labels;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import java.util.List;

/**
 * Created by rickjackson on 3/25/17.
 */
@RelationshipEntity(type = "WORLD_EVENT")
public abstract class WorldEvent {
    @GraphId private Long id;
    @Labels private List<String> labels;
    private Date date;
    private Time time;
    
    public WorldEvent() {
    
    }
    
    public Long getId() {
        return id;
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
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public Time getTime() {
        return time;
    }
    
    public void setTime(Time time) {
        this.time = time;
    }
    
    public Date date() {
        return date;
    }
    
    public Time time() {
        return time;
    }
    
}
