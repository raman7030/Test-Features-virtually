package org.simpleframework.xml.stream;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

/* JADX INFO: loaded from: classes2.dex */
public class DocumentReader implements EventReader {
    public static final String RESERVED = "xml";
    public EventNode peek;
    public NodeExtractor queue;
    public NodeStack stack;

    public DocumentReader(Document document) {
        this.queue = new NodeExtractor(document);
        NodeStack nodeStack = new NodeStack();
        this.stack = nodeStack;
        nodeStack.push(document);
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
        org.w3c.dom.Node node = (org.w3c.dom.Node) this.queue.peek();
        if (node == null) {
            return end();
        }
        return read(node);
    }

    private EventNode read(org.w3c.dom.Node node) {
        org.w3c.dom.Node parentNode = node.getParentNode();
        org.w3c.dom.Node node2 = (org.w3c.dom.Node) this.stack.top();
        if (parentNode != node2) {
            if (node2 != null) {
                this.stack.pop();
            }
            return end();
        }
        this.queue.poll();
        return convert(node);
    }

    private EventNode convert(org.w3c.dom.Node node) {
        if (node.getNodeType() == 1) {
            this.stack.push(node);
            return start(node);
        }
        return text(node);
    }

    private Start start(org.w3c.dom.Node node) {
        Start start = new Start(node);
        return start.isEmpty() ? build(start) : start;
    }

    private Start build(Start start) {
        NamedNodeMap attributes = start.getAttributes();
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Entry entryAttribute = attribute(attributes.item(i));
            if (!entryAttribute.isReserved()) {
                start.add(entryAttribute);
            }
        }
        return start;
    }

    private Entry attribute(org.w3c.dom.Node node) {
        return new Entry(node);
    }

    private Text text(org.w3c.dom.Node node) {
        return new Text(node);
    }

    private End end() {
        return new End();
    }

    public class Entry extends EventAttribute {
        public final org.w3c.dom.Node node;

        public Entry(org.w3c.dom.Node node) {
            this.node = node;
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getName() {
            return this.node.getLocalName();
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getValue() {
            return this.node.getNodeValue();
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getPrefix() {
            return this.node.getPrefix();
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getReference() {
            return this.node.getNamespaceURI();
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public boolean isReserved() {
            String prefix = getPrefix();
            String name = getName();
            if (prefix != null) {
                return prefix.startsWith(DocumentReader.RESERVED);
            }
            return name.startsWith(DocumentReader.RESERVED);
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public Object getSource() {
            return this.node;
        }
    }

    public class Start extends EventElement {
        public final Element element;

        public Start(org.w3c.dom.Node node) {
            this.element = (Element) node;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getName() {
            return this.element.getLocalName();
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getPrefix() {
            return this.element.getPrefix();
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getReference() {
            return this.element.getNamespaceURI();
        }

        public NamedNodeMap getAttributes() {
            return this.element.getAttributes();
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return this.element;
        }
    }

    public class Text extends EventToken {
        public final org.w3c.dom.Node node;

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isText() {
            return true;
        }

        public Text(org.w3c.dom.Node node) {
            this.node = node;
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public String getValue() {
            return this.node.getNodeValue();
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return this.node;
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
