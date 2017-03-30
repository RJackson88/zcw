package org.eightyeight.zcw.domain.universe.entity;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 3/23/17.
 */
public class OldNameTest {
    private OldName constructor;
    private OldName oldName;
    private StringBuilder blank;
    private StringBuilder sb;
    private List<StringBuilder> list;
    
    @Before
    public void setup() {
        this.oldName = new OldName();
        this.sb = new StringBuilder("");
        this.list = new ArrayList<>(3);
        this.list.add(new StringBuilder("First"));
        this.list.add(new StringBuilder("Second"));
        this.list.add(new StringBuilder("Third"));
    }
    
    @Test
    public void constructorTest_default() {
        assertNotNull(new OldName());
    }
    
    @Test
    public void nameTest() {
        oldName = new OldName(this.list);
        blank = oldName.name();
        assertEquals("First Second Third", blank.toString());
    }
    
    @Test
    public void getComponentsTest() {
        // TODO
    }
    
    @Test
    public void setComponentsTest() {
        // TODO
    }
}
