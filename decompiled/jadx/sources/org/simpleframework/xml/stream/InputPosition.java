package org.simpleframework.xml.stream;

import l.C19370;

/* JADX INFO: loaded from: classes2.dex */
public class InputPosition implements Position {
    public EventNode source;

    public InputPosition(EventNode eventNode) {
        this.source = eventNode;
    }

    @Override // org.simpleframework.xml.stream.Position
    public int getLine() {
        return this.source.getLine();
    }

    @Override // org.simpleframework.xml.stream.Position
    public String toString() {
        return C19370.m44628(getLine(), "line ");
    }
}
