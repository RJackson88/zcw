package org.eightyeight.zcw.domain.universe.entity.name;

import java.util.stream.IntStream;

/**
 * Created by rickjackson on 3/22/17.
 */
public final class NameComponent {
    private StringBuilder component;
    
    public NameComponent() {
        this.component = new StringBuilder();
    }
    
    public NameComponent(String str) {
        this.component = new StringBuilder(str);
    }
    
    public NameComponent(CharSequence seq) {
        this.component = new StringBuilder(seq);
    }
    
    public StringBuilder getComponent() {
        return this.component;
    }
    
    public void setComponent(StringBuilder component) {
        this.component = component;
    }
    
    public NameComponent append(NameComponent nameComponent) {
        this.component.append(nameComponent.component);
        return this;
    }
    
    public NameComponent append(Object obj) {
        this.component.append(obj);
        return this;
    }
    
    public NameComponent append(String str) {
        this.component.append(str);
        return this;
    }
    
    public NameComponent append(StringBuffer sb) {
        this.component.append(sb);
        return this;
    }
    
    public NameComponent append(CharSequence s) {
        this.component.append(s);
        return this;
    }
    
    public NameComponent append(CharSequence s, int start, int end) {
        this.component.append(s, start, end);
        return this;
    }
    
    public NameComponent append(char[] str) {
        this.component.append(str);
        return this;
    }
    
    public NameComponent append(char[] str, int offset, int len) {
        this.component.append(str, offset, len);
        return this;
    }
    
    public NameComponent append(boolean b) {
        this.component.append(b);
        return this;
    }
    
    public NameComponent append(char c) {
        this.component.append(c);
        return this;
    }
    
    public NameComponent append(int i) {
        this.component.append(i);
        return this;
    }
    
    public NameComponent append(long lng) {
        this.component.append(lng);
        return this;
    }
    
    public NameComponent append(float f) {
        this.component.append(f);
        return this;
    }
    
    public NameComponent append(double d) {
        this.component.append(d);
        return this;
    }
    
    public NameComponent appendCodePoint(int codePoint) {
        this.component.appendCodePoint(codePoint);
        return this;
    }
    
    public NameComponent delete(int start, int end) {
        this.component.delete(start, end);
        return this;
    }
    
    public NameComponent deleteCharAt(int index) {
        this.component.deleteCharAt(index);
        return this;
    }
    
    public NameComponent replace(int start, int end, String str) {
        this.component.replace(start, end, str);
        return this;
    }
    
    public NameComponent insert(int index, char[] str, int offset, int len) {
        this.component.insert(index, str, offset, len);
        return this;
    }
    
    public NameComponent insert(int offset, Object obj) {
        this.component.insert(offset, obj);
        return this;
    }
    
    public NameComponent insert(int offset, String str) {
        this.component.insert(offset, str);
        return this;
    }
    
    public NameComponent insert(int offset, char[] str) {
        this.component.insert(offset, str);
        return this;
    }
    
    public NameComponent insert(int dstOffset, CharSequence s) {
        this.component.insert(dstOffset, s);
        return this;
    }
    
    public NameComponent insert(int dstOffset, CharSequence s, int start,
                                int end) {
        this.component.insert(dstOffset, s, start, end);
        return this;
    }
    
    // FIXME check other public insert methods using primitives
    
    public int indexOf(String str) {
        return this.component.indexOf(str);
    }
    
    public int indexOf(String str, int fromIndex) {
        return this.component.indexOf(str, fromIndex);
    }
    
    public int lastIndexOf(String str) {
        return this.component.lastIndexOf(str);
    }
    
    public int lastIndexOf(String str, int fromIndex) {
        return this.component.lastIndexOf(str, fromIndex);
    }
    
    public NameComponent reverse() {
        this.component = this.component.reverse();
        return this;
    }
    
    @Override
    public String toString() {
        return this.component.toString();
    }
    
    public int length() {
        return this.component.length();
    }
    
    public int capacity() {
        return this.component.capacity();
    }
    
    public void ensureCapacity(int minimumCapacity) {
        this.component.ensureCapacity(minimumCapacity);
    }
    
    public void trimToSize() {
        this.component.trimToSize();
    }
    
    public void setLength(int newLength) {
        this.component.setLength(newLength);
    }
    
    public char charAt(int index) {
        return this.component.charAt(index);
    }
    
    public int codePointAt(int index) {
        return this.component.codePointAt(index);
    }
    
    public int codePointBefore(int index) {
        return this.component.codePointBefore(index);
    }
    
    public int codePointCount(int beginIndex, int endIndex) {
        return this.component.codePointCount(beginIndex, endIndex);
    }
    
    public int offsetByCodePoints(int index, int codePointOffset) {
        return this.component.offsetByCodePoints(index, codePointOffset);
    }
    
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        this.component.getChars(srcBegin, srcEnd, dst, dstBegin);
    }
    
    public void setCharAt(int index, char ch) {
        this.component.setCharAt(index, ch);
    }
    
    public String substring(int start) {
        return this.component.substring(start);
    }
    
    public CharSequence subSequence(int start, int end) {
        return this.component.subSequence(start, end);
    }
    
    public String substring(int start, int end) {
        return this.component.substring(start, end);
    }
    
    public IntStream chars() {
        return this.component.chars();
    }
    
    public IntStream codePoints() {
        return this.component.codePoints();
    }
}
