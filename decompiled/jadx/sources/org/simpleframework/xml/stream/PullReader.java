package org.simpleframework.xml.stream;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class PullReader implements EventReader {
    public XmlPullParser parser;
    public EventNode peek;

    public PullReader(XmlPullParser xmlPullParser) {
        this.parser = xmlPullParser;
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public EventNode peek() {
        if (this.peek == null) {
            this.peek = next();
        }
        return this.peek;
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public EventNode next() {
        EventNode eventNode = this.peek;
        if (eventNode == null) {
            return read();
        }
        this.peek = null;
        return eventNode;
    }

    private EventNode read() throws XmlPullParserException, IOException {
        int next = this.parser.next();
        if (next == 1) {
            return null;
        }
        if (next == 2) {
            return start();
        }
        if (next == 4) {
            return text();
        }
        if (next == 3) {
            return end();
        }
        return read();
    }

    private Text text() {
        return new Text(this.parser);
    }

    private Start start() {
        Start start = new Start(this.parser);
        return start.isEmpty() ? build(start) : start;
    }

    private Start build(Start start) {
        int attributeCount = this.parser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            Entry entryAttribute = attribute(i);
            if (!entryAttribute.isReserved()) {
                start.add(entryAttribute);
            }
        }
        return start;
    }

    private Entry attribute(int i) {
        return new Entry(this.parser, i);
    }

    private End end() {
        return new End();
    }

    public class Entry extends EventAttribute {
        public final String name;
        public final String prefix;
        public final String reference;
        public final XmlPullParser source;
        public final String value;

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public boolean isReserved() {
            return false;
        }

        public Entry(XmlPullParser xmlPullParser, int i) {
            this.reference = xmlPullParser.getAttributeNamespace(i);
            this.prefix = xmlPullParser.getAttributePrefix(i);
            this.value = xmlPullParser.getAttributeValue(i);
            this.name = xmlPullParser.getAttributeName(i);
            this.source = xmlPullParser;
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getName() {
            return this.name;
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getValue() {
            return this.value;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getReference() {
            return this.reference;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getPrefix() {
            return this.prefix;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public Object getSource() {
            return this.source;
        }
    }

    public class Start extends EventElement {
        public final int line;
        public final String name;
        public final String prefix;
        public final String reference;
        public final XmlPullParser source;

        public Start(XmlPullParser xmlPullParser) {
            this.reference = xmlPullParser.getNamespace();
            this.line = xmlPullParser.getLineNumber();
            this.prefix = xmlPullParser.getPrefix();
            this.name = xmlPullParser.getName();
            this.source = xmlPullParser;
        }

        @Override // org.simpleframework.xml.stream.EventElement, org.simpleframework.xml.stream.EventNode
        public int getLine() {
            return this.line;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getName() {
            return this.name;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getReference() {
            return this.reference;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getPrefix() {
            return this.prefix;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return this.source;
        }
    }

    public class Text extends EventToken {
        public final XmlPullParser source;
        public final String text;

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isText() {
            return true;
        }

        public Text(XmlPullParser xmlPullParser) {
            this.text = xmlPullParser.getText();
            this.source = xmlPullParser;
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public String getValue() {
            return this.text;
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return this.source;
        }
    }

    public class End extends EventToken {
        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isEnd() {
            return true;
        }

        public End() {
        }
    }
}
