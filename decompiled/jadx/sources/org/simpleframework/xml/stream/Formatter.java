package org.simpleframework.xml.stream;

import com.alipay.sdk.p010m.p041p.C0184a;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public class Formatter {
    public OutputBuffer buffer = new OutputBuffer();
    public Indenter indenter;
    public Tag last;
    public String prolog;
    public Writer result;
    public static final char[] NAMESPACE = {'x', 'm', 'l', 'n', 's'};
    public static final char[] LESS = {'&', 'l', 't', ';'};
    public static final char[] GREATER = {'&', 'g', 't', ';'};
    public static final char[] DOUBLE = {'&', 'q', 'u', 'o', 't', ';'};
    public static final char[] SINGLE = {'&', 'a', 'p', 'o', 's', ';'};
    public static final char[] AND = {'&', 'a', 'm', 'p', ';'};
    public static final char[] OPEN = {'<', '!', '-', '-', ' '};
    public static final char[] CLOSE = {' ', '-', '-', '>'};

    public enum Tag {
        COMMENT,
        START,
        TEXT,
        END
    }

    private boolean isText(char c) {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return true;
        }
        return c > ' ' && c <= '~' && c != 247;
    }

    public Formatter(Writer writer, Format format) {
        this.result = new BufferedWriter(writer, 1024);
        this.indenter = new Indenter(format);
        this.prolog = format.getProlog();
    }

    public void writeProlog() throws IOException {
        String str = this.prolog;
        if (str != null) {
            write(str);
            write("\n");
        }
    }

    public void writeComment(String str) {
        String pVar = this.indenter.top();
        if (this.last == Tag.START) {
            append('>');
        }
        if (pVar != null) {
            append(pVar);
            append(OPEN);
            append(str);
            append(CLOSE);
        }
        this.last = Tag.COMMENT;
    }

    public void writeStart(String str, String str2) throws IOException {
        String strPush = this.indenter.push();
        Tag tag = this.last;
        Tag tag2 = Tag.START;
        if (tag == tag2) {
            append('>');
        }
        flush();
        append(strPush);
        append('<');
        if (!isEmpty(str2)) {
            append(str2);
            append(':');
        }
        append(str);
        this.last = tag2;
    }

    public void writeAttribute(String str, String str2, String str3) throws NodeException, IOException {
        if (this.last != Tag.START) {
            throw new NodeException("Start element required");
        }
        write(' ');
        write(str, str3);
        write(C0184a.f880h);
        write('\"');
        escape(str2);
        write('\"');
    }

    public void writeNamespace(String str, String str2) throws NodeException, IOException {
        if (this.last != Tag.START) {
            throw new NodeException("Start element required");
        }
        write(' ');
        write(NAMESPACE);
        if (!isEmpty(str2)) {
            write(':');
            write(str2);
        }
        write(C0184a.f880h);
        write('\"');
        escape(str);
        write('\"');
    }

    public void writeText(String str) throws IOException {
        writeText(str, Mode.ESCAPE);
    }

    public void writeText(String str, Mode mode) throws IOException {
        if (this.last == Tag.START) {
            write('>');
        }
        if (mode == Mode.DATA) {
            data(str);
        } else {
            escape(str);
        }
        this.last = Tag.TEXT;
    }

    public void writeEnd(String str, String str2) throws IOException {
        String strPop = this.indenter.pop();
        Tag tag = this.last;
        Tag tag2 = Tag.START;
        if (tag == tag2) {
            write('/');
            write('>');
        } else {
            if (tag != Tag.TEXT) {
                write(strPop);
            }
            if (this.last != tag2) {
                write('<');
                write('/');
                write(str, str2);
                write('>');
            }
        }
        this.last = Tag.END;
    }

    private void write(char c) throws IOException {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(c);
    }

    private void write(char[] cArr) throws IOException {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(cArr);
    }

    private void write(String str) throws IOException {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(str);
    }

    private void write(String str, String str2) throws IOException {
        this.buffer.write(this.result);
        this.buffer.clear();
        if (!isEmpty(str2)) {
            this.result.write(str2);
            this.result.write(58);
        }
        this.result.write(str);
    }

    private void append(char c) {
        this.buffer.append(c);
    }

    private void append(char[] cArr) {
        this.buffer.append(cArr);
    }

    private void append(String str) {
        this.buffer.append(str);
    }

    private void data(String str) throws IOException {
        write("<![CDATA[");
        write(str);
        write("]]>");
    }

    private void escape(String str) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            escape(str.charAt(i));
        }
    }

    private void escape(char c) throws IOException {
        char[] cArrSymbol = symbol(c);
        if (cArrSymbol != null) {
            write(cArrSymbol);
        } else {
            write(c);
        }
    }

    public void flush() throws IOException {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.flush();
    }

    private String unicode(char c) {
        return Integer.toString(c);
    }

    private boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private char[] symbol(char c) {
        if (c == '\"') {
            return DOUBLE;
        }
        if (c == '<') {
            return LESS;
        }
        if (c == '>') {
            return GREATER;
        }
        if (c == '&') {
            return AND;
        }
        if (c != '\'') {
            return null;
        }
        return SINGLE;
    }
}
