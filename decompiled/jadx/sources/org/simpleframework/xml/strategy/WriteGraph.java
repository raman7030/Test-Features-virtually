package org.simpleframework.xml.strategy;

import java.lang.reflect.Array;
import java.util.IdentityHashMap;
import org.simpleframework.xml.stream.NodeMap;

/* JADX INFO: loaded from: classes2.dex */
public class WriteGraph extends IdentityHashMap {
    public final String label;
    public final String length;
    public final String mark;
    public final String refer;

    public WriteGraph(Contract contract) {
        this.refer = contract.getReference();
        this.mark = contract.getIdentity();
        this.length = contract.getLength();
        this.label = contract.getLabel();
    }

    public boolean write(Type type, Object obj, NodeMap nodeMap) {
        Class<?> cls = obj.getClass();
        Class<?> type2 = type.getType();
        Class<?> clsWriteArray = cls.isArray() ? writeArray(cls, obj, nodeMap) : cls;
        if (cls != type2) {
            nodeMap.put(this.label, clsWriteArray.getName());
        }
        return writeReference(obj, nodeMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean writeReference(Object obj, NodeMap nodeMap) {
        String str = (String) get(obj);
        int size = size();
        if (str != null) {
            nodeMap.put(this.refer, str);
            return true;
        }
        String strValueOf = String.valueOf(size);
        nodeMap.put(this.mark, strValueOf);
        put(obj, strValueOf);
        return false;
    }

    private Class writeArray(Class cls, Object obj, NodeMap nodeMap) {
        int length = Array.getLength(obj);
        if (!containsKey(obj)) {
            nodeMap.put(this.length, String.valueOf(length));
        }
        return cls.getComponentType();
    }
}
