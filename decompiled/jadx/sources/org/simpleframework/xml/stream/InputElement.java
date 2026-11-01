package org.simpleframework.xml.stream;

import p067l.C21466;

/* JADX INFO: loaded from: classes2.dex */
public class InputElement implements InputNode {
    public final InputNodeMap map;
    public final EventNode node;
    public final InputNode parent;
    public final NodeReader reader;

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isElement() {
        return true;
    }

    public InputElement(InputNode inputNode, NodeReader nodeReader, EventNode eventNode) {
        this.map = new InputNodeMap(this, eventNode);
        this.reader = nodeReader;
        this.parent = inputNode;
        this.node = eventNode;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public Object getSource() {
        return this.node.getSource();
    }

    @Override // org.simpleframework.xml.stream.Node
    public InputNode getParent() {
        return this.parent;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public Position getPosition() {
        return new InputPosition(this.node);
    }

    @Override // org.simpleframework.xml.stream.Node
    public String getName() {
        return this.node.getName();
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public String getPrefix() {
        return this.node.getPrefix();
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public String getReference() {
        return this.node.getReference();
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isRoot() {
        return this.reader.isRoot(this);
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public InputNode getAttribute(String str) {
        return this.map.get(str);
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public NodeMap getAttributes() {
        return this.map;
    }

    @Override // org.simpleframework.xml.stream.Node
    public String getValue() {
        return this.reader.readValue(this);
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public InputNode getNext() {
        return this.reader.readElement(this);
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public InputNode getNext(String str) {
        return this.reader.readElement(this, str);
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public void skip() {
        this.reader.skipElement(this);
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isEmpty() {
        if (this.map.isEmpty()) {
            return this.reader.isEmpty(this);
        }
        return false;
    }

    public String toString() {
        return C21466.m48631("element ", getName());
    }
}
