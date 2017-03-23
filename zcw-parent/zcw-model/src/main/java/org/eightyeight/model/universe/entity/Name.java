package org.eightyeight.model.universe.entity;

/**
 * Created by rickjackson on 3/22/17.
 */
public class Name {
    private StringBuilder name;
    
    public Name() {
        this.name = new StringBuilder();
    }
    
    public Name(String str) {
        this.name = new StringBuilder(str);
    }
    
    public Name(CharSequence seq) {
        this.name = new StringBuilder(seq);
    }
}
