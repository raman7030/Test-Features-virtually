package org.simpleframework.xml.strategy;

import java.util.Map;
import org.simpleframework.xml.stream.NodeMap;

/* JADX INFO: loaded from: classes2.dex */
public interface Strategy {
    Value read(Type type, NodeMap nodeMap, Map map);

    boolean write(Type type, Object obj, NodeMap nodeMap, Map map);
}
