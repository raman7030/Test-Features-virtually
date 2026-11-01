package org.simpleframework.xml.stream;

import p067l.C21459;

/* JADX INFO: loaded from: classes2.dex */
public class InputAttribute implements InputNode {
    public String name;
    public InputNode parent;
    public String prefix;
    public String reference;
    public Object source;
    public String value;

    @Override // org.simpleframework.xml.stream.InputNode
    public InputNode getAttribute(String str) {
        return null;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public InputNode getNext() {
        return null;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public InputNode getNext(String str) {
        return null;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isElement() {
        return false;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isEmpty() {
        return false;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public boolean isRoot() {
        return false;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public void skip() {
    }

    public InputAttribute(InputNode inputNode, String str, String str2) {
        this.parent = inputNode;
        this.value = str2;
        this.name = str;
    }

    public InputAttribute(InputNode inputNode, Attribute attribute) {
        this.reference = attribute.getReference();
        this.prefix = attribute.getPrefix();
        this.source = attribute.getSource();
        this.value = attribute.getValue();
        this.name = attribute.getName();
        this.parent = inputNode;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public Object getSource() {
        return this.source;
    }

    @Override // org.simpleframework.xml.stream.Node
    public InputNode getParent() {
        return this.parent;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public Position getPosition() {
        return this.parent.getPosition();
    }

    @Override // org.simpleframework.xml.stream.Node
    public String getName() {
        return this.name;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public String getPrefix() {
        return this.prefix;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public String getReference() {
        return this.reference;
    }

    @Override // org.simpleframework.xml.stream.Node
    public String getValue() {
        return this.value;
    }

    @Override // org.simpleframework.xml.stream.InputNode
    public NodeMap getAttributes() {
        return new InputNodeMap(this);
    }

    public String toString() {
        return C21459.m48622("attribute ", this.name, "='", this.value, "'");
    }
}
