package org.eightyeight.zcw.domain.universe.promotion;

import org.eightyeight.zcw.domain.meta.MetaNodeEntity;
import org.eightyeight.zcw.domain.universe.entity.Person;
import org.neo4j.ogm.annotation.NodeEntity;
import java.util.List;

/**
 * Created by rickjackson on 3/28/17.
 */
@NodeEntity(label = "eventSeries")
public class EventSeries extends MetaNodeEntity {
    private List<Promotion> promotions;
    private List<String> names;
    private List<Person> creators;
    private List<PromotionBrand> brands;
    private List<Event> chronology;
    private List<String> gimmicks;
    
    public EventSeries() {
    
    }
}
