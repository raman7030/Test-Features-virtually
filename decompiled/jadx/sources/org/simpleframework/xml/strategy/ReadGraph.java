package org.simpleframework.xml.strategy;

import java.util.HashMap;
import org.simpleframework.xml.stream.Node;
import org.simpleframework.xml.stream.NodeMap;

/* JADX INFO: loaded from: classes2.dex */
public class ReadGraph extends HashMap {
    public final String label;
    public final String length;
    public final Loader loader;
    public final String mark;
    public final String refer;

    public ReadGraph(Contract contract, Loader loader) {
        this.refer = contract.getReference();
        this.mark = contract.getIdentity();
        this.length = contract.getLength();
        this.label = contract.getLabel();
        this.loader = loader;
    }

    public Value read(Type type, NodeMap nodeMap) {
        Node nodeRemove = nodeMap.remove(this.label);
        Class type2 = type.getType();
        if (type2.isArray()) {
            type2 = type2.getComponentType();
        }
        if (nodeRemove != null) {
            type2 = this.loader.load(nodeRemove.getValue());
        }
        return readInstance(type, type2, nodeMap);
    }

    private Value readInstance(Type type, Class cls, NodeMap nodeMap) throws CycleException {
        Node nodeRemove = nodeMap.remove(this.mark);
        if (nodeRemove == null) {
            return readReference(type, cls, nodeMap);
        }
        String value = nodeRemove.getValue();
        if (containsKey(value)) {
            throw new CycleException("Element '%s' already exists", value);
        }
        return readValue(type, cls, nodeMap, value);
    }

    private Value readReference(Type type, Class cls, NodeMap nodeMap) throws CycleException {
        Node nodeRemove = nodeMap.remove(this.refer);
        if (nodeRemove == null) {
            return readValue(type, cls, nodeMap);
        }
        String value = nodeRemove.getValue();
        V v = get(value);
        if (!containsKey(value)) {
            throw new CycleException("Invalid reference '%s' found", value);
        }
        return new Reference(v, cls);
    }

    private Value readValue(Type type, Class cls, NodeMap nodeMap) {
        if (type.getType().isArray()) {
            return readArray(type, cls, nodeMap);
        }
        return new ObjectValue(cls);
    }

    private Value readValue(Type type, Class cls, NodeMap nodeMap, String str) {
        Value value = readValue(type, cls, nodeMap);
        return str != null ? new Allocate(value, this, str) : value;
    }

    private Value readArray(Type type, Class cls, NodeMap nodeMap) {
        Node nodeRemove = nodeMap.remove(this.length);
        return new ArrayValue(cls, nodeRemove != null ? Integer.parseInt(nodeRemove.getValue()) : 0);
    }
}
