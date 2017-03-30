package org.eightyeight.zcw.domain.universe.lang;

/**
 * Created by rickjackson on 3/24/17.
 */
public class Element implements LanguageElement, CharSequence {
    private StringBuilder value;
    
    public Element() {
        this.value = new StringBuilder();
    }
    
    public Element(int capacity) {
        this.value = new StringBuilder(value);
    }
    
    public Element(String str) {
        this.value = new StringBuilder(str);
    }
    
    public Element(CharSequence seq) {
        this.value = new StringBuilder(seq);
    }
    
    public Element append(Object obj) {
        value.append(obj);
        return this;
    }
    
    public Element append(String str) {
        value.append(str);
        return this;
    }
    
    public Element append(StringBuffer sb) {
        value.append(sb);
        return this;
    }
    
    public Element append(CharSequence s) {
        value.append(s);
        return this;
    }
    
    public Element append(CharSequence s, int start, int end) {
        value.append(s, start, end);
        return this;
    }
    
    public Element append(char[] str) {
        value.append(str);
        return this;
    }
    
    public Element append(char[] str, int offset, int len) {
        value.append(str, offset, len);
        return this;
    }
    
    public Element append(boolean b) {
        value.append(b);
        return this;
    }
    
    public Element append(char c) {
        value.append(c);
        return this;
    }
    
    public Element append(int i) {
        value.append(i);
        return this;
    }
    
    public Element append(long lng) {
        value.append(lng);
        return this;
    }
    
    public Element append(float f) {
        value.append(f);
        return this;
    }
    
    public Element append(double d) {
        value.append(d);
        return this;
    }
    
    public Element appendCodePoint(int codePoint) {
        value.appendCodePoint(codePoint);
        return this;
    }
    
    public Element delete(int start, int end) {
        value.delete(start, end);
        return this;
    }
    
    public Element deleteCharAt(int index) {
        value.deleteCharAt(index);
        return this;
    }
    
    public Element replace(int start, int end, String str) {
        value.replace(start, end, str);
        return this;
    }
    
    public Element insert(int index, char[] str, int offset, int len) {
        value.insert(index, str, offset, len);
        return this;
    }
    
    public Element insert(int offset, Object obj) {
        value.insert(offset, obj);
        return this;
    }
    
    public Element insert(int offset, String str) {
        value.insert(offset, str);
        return this;
    }
    
    public Element insert(int offset, char[] str) {
        value.insert(offset, str);
        return this;
    }
    
    public Element insert(int dstOffset, CharSequence s) {
        value.insert(dstOffset, s);
        return this;
    }
    
    public Element insert(int dstOffset, CharSequence s, int start, int end) {
        value.insert(dstOffset, s, start, end);
        return this;
    }
    
    public Element insert(int offset, boolean b) {
        value.insert(offset, b);
        return this;
    }
    
    public Element insert(int offset, char c) {
        value.insert(offset, c);
        return this;
    }
    
    public Element insert(int offset, int i) {
        value.insert(offset, i);
        return this;
    }
    
    public Element insert(int offset, long l) {
        value.insert(offset, l);
        return this;
    }
    
    public Element insert(int offset, float f) {
        value.insert(offset, f);
        return this;
    }
    
    public Element insert(int offset, double d) {
        value.insert(offset, d);
        return this;
    }
    
    public int indexOf(String str) {
        return value.indexOf(str);
    }
    
    public int indexOf(String str, int fromIndex) {
        return value.indexOf(str, fromIndex);
    }
    
    public int lastIndexOf(String str) {
        return value.lastIndexOf(str);
    }
    
    public int lastIndexOf(String str, int fromIndex) {
        return value.lastIndexOf(str, fromIndex);
    }
    
    public Element reverse() {
        value.reverse();
        return this;
    }
    
    @Override
    public String toString() {
        return value.toString();
    }
    
    @Override
    public int length() {
        return value.length();
    }
    
    
    public int capacity() {
        return value.capacity();
    }
    
    public void ensureCapacity(int minimumCapacity) {
        value.ensureCapacity(minimumCapacity);
    }
    
    public void trimToSize() {
        value.trimToSize();
    }
    
    public void setLength(int newLength) {
        value.setLength(newLength);
    }
    
    @Override
    public char charAt(int index) {
        return value.charAt(index);
    }
    
    public int codePointAt(int index) {
        return value.codePointAt(index);
    }
    
    public int codePointBefore(int index) {
        return value.codePointBefore(index);
    }
    
    public int codePointCount(int beginIndex, int endIndex) {
        return value.codePointCount(beginIndex, endIndex);
    }
    
    public int offsetByCodePoints(int index, int codePointOffset) {
        return value.offsetByCodePoints(index, codePointOffset);
    }
    
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        value.getChars(srcBegin, srcEnd, dst, dstBegin);
    }
    
    public void setCharAt(int index, char ch) {
        value.setCharAt(index, ch);
    }
    
    public String substring(int start) {
        return value.substring(start);
    }
    
    public String substring(int start, int end) {
        return value.substring(start, end);
    }
    
    @Override
    public CharSequence subSequence(int start, int end) {
        return value.subSequence(start, end);
    }
}
