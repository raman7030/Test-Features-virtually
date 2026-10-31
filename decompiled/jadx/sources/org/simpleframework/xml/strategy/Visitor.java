package org.simpleframework.xml.strategy;

import org.simpleframework.xml.stream.NodeMap;

/* JADX INFO: loaded from: classes2.dex */
public interface Visitor {
    void read(Type type, NodeMap nodeMap);

    void write(Type type, NodeMap nodeMap);
}
