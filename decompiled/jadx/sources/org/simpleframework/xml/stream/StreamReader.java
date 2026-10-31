package org.simpleframework.xml.stream;

import java.util.Iterator;
import javax.xml.stream.Location;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/* JADX INFO: loaded from: classes2.dex */
public class StreamReader implements EventReader {
    public EventNode peek;
    public XMLEventReader reader;

    public StreamReader(XMLEventReader xMLEventReader) {
        this.reader = xMLEventReader;
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

    private EventNode read() {
        XMLEvent xMLEventNextEvent = this.reader.nextEvent();
        if (xMLEventNextEvent.isEndDocument()) {
            return null;
        }
        if (xMLEventNextEvent.isStartElement()) {
            return start(xMLEventNextEvent);
        }
        if (xMLEventNextEvent.isCharacters()) {
            return text(xMLEventNextEvent);
        }
        if (xMLEventNextEvent.isEndElement()) {
            return end();
        }
        return read();
    }

    private Start start(XMLEvent xMLEvent) {
        Start start = new Start(xMLEvent);
        return start.isEmpty() ? build(start) : start;
    }

    private Start build(Start start) {
        Iterator attributes = start.getAttributes();
        while (attributes.hasNext()) {
            Entry entryAttribute = attribute((javax.xml.stream.events.Attribute) attributes.next());
            if (!entryAttribute.isReserved()) {
                start.add(entryAttribute);
            }
        }
        return start;
    }

    private Entry attribute(javax.xml.stream.events.Attribute attribute) {
        return new Entry(attribute);
    }

    private Text text(XMLEvent xMLEvent) {
        return new Text(xMLEvent);
    }

    private End end() {
        return new End();
    }

    public class Entry extends EventAttribute {
        public final javax.xml.stream.events.Attribute entry;

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public boolean isReserved() {
            return false;
        }

        public Entry(javax.xml.stream.events.Attribute attribute) {
            this.entry = attribute;
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getName() {
            return this.entry.getName().getLocalPart();
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getPrefix() {
            return this.entry.getName().getPrefix();
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getReference() {
            return this.entry.getName().getNamespaceURI();
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getValue() {
            return this.entry.getValue();
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public Object getSource() {
            return this.entry;
        }
    }

    public class Start extends EventElement {
        public final StartElement element;
        public final Location location;

        public Start(XMLEvent xMLEvent) {
            this.element = xMLEvent.asStartElement();
            this.location = xMLEvent.getLocation();
        }

        @Override // org.simpleframework.xml.stream.EventElement, org.simpleframework.xml.stream.EventNode
        public int getLine() {
            return this.location.getLineNumber();
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getName() {
            return this.element.getName().getLocalPart();
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getPrefix() {
            return this.element.getName().getPrefix();
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getReference() {
            return this.element.getName().getNamespaceURI();
        }

        public Iterator getAttributes() {
            return this.element.getAttributes();
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return this.element;
        }
    }

    public class Text extends EventToken {
        public final Characters text;

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isText() {
            return true;
        }

        public Text(XMLEvent xMLEvent) {
            this.text = xMLEvent.asCharacters();
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public String getValue() {
            return this.text.getData();
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return this.text;
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
