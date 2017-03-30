package org.eightyeight.zcw.domain.universe.entity;

import org.eightyeight.zcw.domain.universe.entity.name.NameComponent;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 3/23/17.
 */
public class OldNameComponentTest {
    private NameComponent cmp1;
    private NameComponent cmp2;
    private NameComponent cmp3;
    private String str;
    
    @Before
    public void setup() {
        this.str = "String";
        this.cmp1 = new NameComponent();
        this.cmp2 = new NameComponent(str);
    }
    
    @Test
    public void getComponentTest() {
        assertEquals("String", cmp2.getComponent().toString());
    }
    
    @Test
    public void appendTest_usingNameComponent() {
        assertEquals("StringCharSequence", cmp1.append(cmp2).toString());
    }
    
    @Test
    public void appendTest_usingObject() {
    
    }
    
    @Test
    public void appendTest_usingString() {
        assertEquals("String", cmp1.append(str).toString());
    }
    
    @Test
    public void appendTest_usingStringBuffer() {
        assertEquals("sb", cmp1.append(new StringBuffer("sb")).toString());
    }
    
    @Test
    public void appendTest_usingCharSequence() {
        assertEquals("String", cmp1.append(str).toString());
    }
    
    @Test
    public void appendCodePointTest() {
        assertEquals("a", cmp1.appendCodePoint(97).toString());
    }
    
    @Test
    public void deleteTest_indexes1to3() {
        assertEquals("Sing", cmp2.delete(1,3).toString());
    }
    
    @Test
    public void deleteCharAtTest_index0() {
        assertEquals("tring", cmp2.deleteCharAt(0).toString());
    }
    
    @Test
    public void replaceTest_replaceIndex1to4() {
        assertEquals("Snewng", cmp2.replace(1,4, "new").toString());
    }
    
    // TODO
    // insert() methods
    
    @Test
    public void indexOfTest_usingString() {
        assertEquals(2, cmp2.indexOf("ring"));
    }
    
    @Test
    public void indexOfTest_usingFromIndex() {
        cmp1.append("aabaa");
        assertEquals(3, cmp1.indexOf("aa", 1));
    }
    
    @Test
    public void lastIndexOfTest_usingString() {
        cmp1.append("aabaa");
        assertEquals(3, cmp1.lastIndexOf("aa"));
    }
    
    @Test
    public void lastIndexOfTest_fromIndex() {
        cmp1.append("aabaa");
        assertEquals(0, cmp1.lastIndexOf("aa", 2));
    }
    
    @Test
    public void reverseTest() {
        assertEquals("gnirtS", cmp2.reverse().toString());
    }
    
    @Test
    public void toStringTest() {
        assertEquals("String", cmp2.toString());
    }
    
    @Test
    public void lengthTest() {
        assertEquals(6, cmp2.length());
    }
    
    @Test
    public void capacityTest_expectDefault16() {
        assertEquals(16, cmp1.capacity());
    }
    
    @Test
    public void ensureCapacityTest() {
        assertEquals(16, cmp1.capacity());
        cmp1.ensureCapacity(20);
        assertEquals(34, cmp1.capacity());
    }
    
    @Test
    public void trimToSizeTest() {
        assertEquals(22, cmp2.capacity());
        cmp2.trimToSize();
        assertEquals(6, cmp2.capacity());
    }
    
    @Test
    public void setLengthTest() {
        assertEquals(0, cmp1.length());
        cmp1.setLength(2);
        assertEquals(2, cmp1.length());
    }
    
    @Test
    public void charAtTest() {
        assertEquals('S', cmp2.charAt(0));
    }
    
    @Test
    public void codePointAtTest() {
        assertEquals(83, cmp2.codePointAt(0));
    }
    
    @Test
    public void codePointBeforeTest() {
        assertEquals(83, cmp2.codePointBefore(1));
    }
    
    @Test
    public void codePointCountTest() {
        assertEquals(6, cmp2.codePointCount(0, cmp2.length()));
    }
    
    @Test
    public void offsetByCodePointsTest() {
        assertEquals(1, cmp2.offsetByCodePoints(0, 1));
    }
    
    @Test
    public void getCharsTest() {
    
    }
    
    @Test
    public void setCharAtTest() {
        cmp2.setCharAt(0, 's');
        assertEquals("string", cmp2.toString());
    }
    
    @Test
    public void substringTest_withIndex() {
        assertEquals("ring", cmp2.substring(2));
    }
    
    @Test
    public void subSequenceTest() {
        assertEquals("rin", cmp2.subSequence(2, 5));
    }
    
    @Test
    public void substringTest_withStartAndEnd() {
        assertEquals("rin", cmp2.substring(2, 5));
    }
    
    @Test
    public void charsTest() {
        // TODO
    }
    
    @Test
    public void codePointsTest() {
        // TODO
    }
}
