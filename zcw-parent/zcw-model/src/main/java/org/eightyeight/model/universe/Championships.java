package org.eightyeight.model.universe;

import org.eightyeight.model.universe.feat.Championship;
import org.eightyeight.model.universe.feat.Feat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 3/22/17.
 */
public class Championships {
    private List<Feat> championships;
    
    public Championships() {
        this.championships = new ArrayList<>();
    }
    
    public Championships(int initialCapacity) {
        this.championships = new ArrayList<>(initialCapacity);
    }
    
    public int total() {
        return championships.size();
    }
    
    public boolean hasChampionships() {
        return !championships.isEmpty();
    }
    
    public boolean has(Championship championship) {
        return this.championships.contains(championship);
    }
    
    public Feat get(int index) {
        return championships.get(index);
    }
    
    public Feat get(Championship championship) {
        int i = this.championships.indexOf(championship);
        return this.championships.get(i);
    }
    
    public void add(Championship championship) {
        this.championships.add(championship);
    }
    
    public void remove(Championship championship) {
        this.championships.remove(get(championship));
    }
    
    public void clear() {
        championships.clear();
    }
}
