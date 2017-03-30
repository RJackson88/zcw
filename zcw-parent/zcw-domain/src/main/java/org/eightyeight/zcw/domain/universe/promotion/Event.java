package org.eightyeight.zcw.domain.universe.promotion;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.eightyeight.zcw.domain.universe.entity.Person;
import org.neo4j.ogm.annotation.NodeEntity;
import java.util.List;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity(label = "event")
public class Event extends MetaNodeEntity {
    private String name;
    private List<Promotion> promotions;
    private List<Promotion> brands;
    private List<String> taglines;
    private List<String> themeSongs;
    private List<Person> sponsors;
    private int year;
    private int month;
    private int day;
    private String venue;
    private String city;
    
    public Event() {
    
    }
}
