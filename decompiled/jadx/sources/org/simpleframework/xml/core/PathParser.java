package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.C22870;
import l.C23202;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.Style;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class PathParser implements Expression {
    public boolean attribute;
    public String cache;
    public int count;
    public char[] data;
    public String location;
    public int off;
    public String path;
    public int start;
    public Style style;
    public Type type;
    public Cache attributes = new ConcurrentCache();
    public Cache elements = new ConcurrentCache();
    public List indexes = new ArrayList();
    public List prefixes = new ArrayList();
    public List names = new ArrayList();
    public StringBuilder builder = new StringBuilder();

    private boolean isSpecial(char c) {
        return c == '_' || c == '-' || c == ':';
    }

    public PathParser(String str, Type type, Format format) throws PathException {
        this.style = format.getStyle();
        this.type = type;
        this.path = str;
        parse(str);
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isEmpty() {
        return isEmpty(this.location);
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isPath() {
        return this.names.size() > 1;
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isAttribute() {
        return this.attribute;
    }

    @Override // org.simpleframework.xml.core.Expression
    public int getIndex() {
        return ((Integer) this.indexes.get(0)).intValue();
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getPrefix() {
        return (String) this.prefixes.get(0);
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getFirst() {
        return (String) this.names.get(0);
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getLast() {
        return (String) this.names.get(this.names.size() - 1);
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getPath() {
        return this.location;
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getElement(String str) {
        if (!isEmpty(this.location)) {
            String elementPath = (String) this.elements.fetch(str);
            if (elementPath == null && (elementPath = getElementPath(this.location, str)) != null) {
                this.elements.cache(str, elementPath);
            }
            return elementPath;
        }
        return this.style.getElement(str);
    }

    public String getElementPath(String str, String str2) {
        String element = this.style.getElement(str2);
        if (isEmpty(element)) {
            return str;
        }
        if (isEmpty(str)) {
            return element;
        }
        return str + "/" + element + "[1]";
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getAttribute(String str) {
        if (!isEmpty(this.location)) {
            String attributePath = (String) this.attributes.fetch(str);
            if (attributePath == null && (attributePath = getAttributePath(this.location, str)) != null) {
                this.attributes.cache(str, attributePath);
            }
            return attributePath;
        }
        return this.style.getAttribute(str);
    }

    public String getAttributePath(String str, String str2) {
        String attribute = this.style.getAttribute(str2);
        return isEmpty(str) ? attribute : C22870.m50967(str, "/@", attribute);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.names.iterator();
    }

    @Override // org.simpleframework.xml.core.Expression
    public Expression getPath(int i) {
        return getPath(i, 0);
    }

    @Override // org.simpleframework.xml.core.Expression
    public Expression getPath(int i, int i2) {
        int size = (this.names.size() - 1) - i2;
        if (size >= i) {
            return new PathSection(i, size);
        }
        return new PathSection(i, i);
    }

    private void parse(String str) throws PathException {
        if (str != null) {
            int length = str.length();
            this.count = length;
            char[] cArr = new char[length];
            this.data = cArr;
            str.getChars(0, length, cArr, 0);
        }
        path();
    }

    private void path() throws PathException {
        char c = this.data[this.off];
        if (c == '/') {
            throw new PathException("Path '%s' in %s references document root", this.path, this.type);
        }
        if (c == '.') {
            skip();
        }
        while (this.off < this.count) {
            if (this.attribute) {
                throw new PathException("Path '%s' in %s references an invalid attribute", this.path, this.type);
            }
            segment();
        }
        truncate();
        build();
    }

    private void build() {
        int size = this.names.size();
        int i = size - 1;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) this.prefixes.get(i2);
            String str2 = (String) this.names.get(i2);
            int iIntValue = ((Integer) this.indexes.get(i2)).intValue();
            if (i2 > 0) {
                this.builder.append('/');
            }
            if (this.attribute && i2 == i) {
                this.builder.append('@');
                this.builder.append(str2);
            } else {
                if (str != null) {
                    this.builder.append(str);
                    this.builder.append(':');
                }
                this.builder.append(str2);
                this.builder.append('[');
                this.builder.append(iIntValue);
                this.builder.append(']');
            }
        }
        this.location = this.builder.toString();
    }

    private void skip() throws PathException {
        char[] cArr = this.data;
        if (cArr.length > 1) {
            int i = this.off;
            if (cArr[i + 1] != '/') {
                throw new PathException("Path '%s' in %s has an illegal syntax", this.path, this.type);
            }
            this.off = i + 1;
        }
        int i2 = this.off + 1;
        this.off = i2;
        this.start = i2;
    }

    private void segment() throws PathException {
        char c = this.data[this.off];
        if (c == '/') {
            throw new PathException("Invalid path expression '%s' in %s", this.path, this.type);
        }
        if (c == '@') {
            attribute();
        } else {
            element();
        }
        align();
    }

    private void element() throws PathException {
        int i = this.off;
        int i2 = 0;
        while (true) {
            int i3 = this.off;
            if (i3 >= this.count) {
                break;
            }
            char[] cArr = this.data;
            this.off = i3 + 1;
            char c = cArr[i3];
            if (!isValid(c)) {
                if (c != '@') {
                    if (c != '[') {
                        if (c == '/') {
                            break;
                        } else {
                            throw new PathException("Illegal character '%s' in element for '%s' in %s", Character.valueOf(c), this.path, this.type);
                        }
                    } else {
                        index();
                        break;
                    }
                }
                this.off--;
                break;
            }
            i2++;
        }
        element(i, i2);
    }

    private void attribute() throws PathException {
        char c;
        int i = this.off + 1;
        this.off = i;
        do {
            int i2 = this.off;
            if (i2 >= this.count) {
                if (i2 <= i) {
                    throw new PathException("Attribute reference in '%s' for %s is empty", this.path, this.type);
                }
                this.attribute = true;
                attribute(i, i2 - i);
                return;
            }
            char[] cArr = this.data;
            this.off = i2 + 1;
            c = cArr[i2];
        } while (isValid(c));
        throw new PathException("Illegal character '%s' in attribute for '%s' in %s", Character.valueOf(c), this.path, this.type);
    }

    private void index() throws PathException {
        int iM51496;
        if (this.data[this.off - 1] == '[') {
            iM51496 = 0;
            while (true) {
                int i = this.off;
                if (i >= this.count) {
                    break;
                }
                char[] cArr = this.data;
                this.off = i + 1;
                char c = cArr[i];
                if (!isDigit(c)) {
                    break;
                } else {
                    iM51496 = C23202.m51496(iM51496, 10, c, -48);
                }
            }
        } else {
            iM51496 = 0;
        }
        char[] cArr2 = this.data;
        int i2 = this.off;
        this.off = i2 + 1;
        if (cArr2[i2 - 1] != ']') {
            throw new PathException("Invalid index for path '%s' in %s", this.path, this.type);
        }
        this.indexes.add(Integer.valueOf(iM51496));
    }

    private void truncate() {
        int i = this.off;
        int i2 = i - 1;
        char[] cArr = this.data;
        if (i2 >= cArr.length) {
            this.off = i - 1;
        } else if (cArr[i - 1] == '/') {
            this.off = i - 1;
        }
    }

    private void align() {
        if (this.names.size() > this.indexes.size()) {
            this.indexes.add(1);
        }
    }

    private boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    private boolean isValid(char c) {
        return isLetter(c) || isSpecial(c);
    }

    private boolean isLetter(char c) {
        return Character.isLetterOrDigit(c);
    }

    private void element(int i, int i2) {
        String str = new String(this.data, i, i2);
        if (i2 > 0) {
            element(str);
        }
    }

    private void attribute(int i, int i2) {
        String str = new String(this.data, i, i2);
        if (i2 > 0) {
            attribute(str);
        }
    }

    private void element(String str) {
        String strSubstring;
        int iIndexOf = str.indexOf(58);
        if (iIndexOf > 0) {
            strSubstring = str.substring(0, iIndexOf);
            str = str.substring(iIndexOf + 1);
        } else {
            strSubstring = null;
        }
        String element = this.style.getElement(str);
        this.prefixes.add(strSubstring);
        this.names.add(element);
    }

    private void attribute(String str) {
        String attribute = this.style.getAttribute(str);
        this.prefixes.add(null);
        this.names.add(attribute);
    }

    @Override // org.simpleframework.xml.core.Expression
    public String toString() {
        int i = this.off;
        int i2 = this.start;
        int i3 = i - i2;
        if (this.cache == null) {
            this.cache = new String(this.data, i2, i3);
        }
        return this.cache;
    }

    public class PathSection implements Expression {
        public int begin;
        public List cache = new ArrayList();
        public int end;
        public String path;
        public String section;

        public PathSection(int i, int i2) {
            this.begin = i;
            this.end = i2;
        }

        @Override // org.simpleframework.xml.core.Expression
        public boolean isEmpty() {
            return this.begin == this.end;
        }

        @Override // org.simpleframework.xml.core.Expression
        public boolean isPath() {
            return this.end - this.begin >= 1;
        }

        @Override // org.simpleframework.xml.core.Expression
        public boolean isAttribute() {
            PathParser pathParser = PathParser.this;
            return pathParser.attribute && this.end >= pathParser.names.size() - 1;
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getPath() {
            if (this.section == null) {
                this.section = getCanonicalPath();
            }
            return this.section;
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getElement(String str) {
            String path = getPath();
            return path != null ? PathParser.this.getElementPath(path, str) : str;
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getAttribute(String str) {
            String path = getPath();
            return path != null ? PathParser.this.getAttributePath(path, str) : str;
        }

        @Override // org.simpleframework.xml.core.Expression
        public int getIndex() {
            return ((Integer) PathParser.this.indexes.get(this.begin)).intValue();
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getPrefix() {
            return (String) PathParser.this.prefixes.get(this.begin);
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getFirst() {
            return (String) PathParser.this.names.get(this.begin);
        }

        @Override // org.simpleframework.xml.core.Expression
        public String getLast() {
            return (String) PathParser.this.names.get(this.end);
        }

        @Override // org.simpleframework.xml.core.Expression
        public Expression getPath(int i) {
            return getPath(i, 0);
        }

        @Override // org.simpleframework.xml.core.Expression
        public Expression getPath(int i, int i2) {
            return PathParser.this.new PathSection(this.begin + i, this.end - i2);
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            if (this.cache.isEmpty()) {
                for (int i = this.begin; i <= this.end; i++) {
                    String str = (String) PathParser.this.names.get(i);
                    if (str != null) {
                        this.cache.add(str);
                    }
                }
            }
            return this.cache.iterator();
        }

        private String getCanonicalPath() {
            int i = 0;
            int iIndexOf = 0;
            while (i < this.begin) {
                iIndexOf = PathParser.this.location.indexOf(47, iIndexOf + 1);
                i++;
            }
            int iIndexOf2 = iIndexOf;
            while (i <= this.end) {
                iIndexOf2 = PathParser.this.location.indexOf(47, iIndexOf2 + 1);
                if (iIndexOf2 == -1) {
                    iIndexOf2 = PathParser.this.location.length();
                }
                i++;
            }
            return PathParser.this.location.substring(iIndexOf + 1, iIndexOf2);
        }

        private String getFragment() {
            int i = PathParser.this.start;
            int i2 = 0;
            int i3 = 0;
            while (i2 <= this.end) {
                PathParser pathParser = PathParser.this;
                if (i >= pathParser.count) {
                    i++;
                    break;
                }
                int i4 = i + 1;
                if (pathParser.data[i] == '/' && (i2 = i2 + 1) == this.begin) {
                    i = i4;
                    i3 = i;
                } else {
                    i = i4;
                }
            }
            return new String(PathParser.this.data, i3, (i - 1) - i3);
        }

        @Override // org.simpleframework.xml.core.Expression
        public String toString() {
            if (this.path == null) {
                this.path = getFragment();
            }
            return this.path;
        }
    }
}
