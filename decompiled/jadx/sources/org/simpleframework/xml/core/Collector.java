package org.simpleframework.xml.core;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class Collector implements Criteria {
    public final Registry alias;
    public final Registry registry;

    public Collector() {
        this.registry = new Registry();
        this.alias = new Registry();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.simpleframework.xml.core.Criteria
    public Variable get(Object obj) {
        return (Variable) this.registry.get(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.simpleframework.xml.core.Criteria
    public Variable get(Label label) {
        if (label == null) {
            return null;
        }
        return (Variable) this.registry.get(label.getKey());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.simpleframework.xml.core.Criteria
    public Variable resolve(String str) {
        return (Variable) this.alias.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.simpleframework.xml.core.Criteria
    public Variable remove(Object obj) {
        return (Variable) this.registry.remove(obj);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.registry.iterator();
    }

    @Override // org.simpleframework.xml.core.Criteria
    public void set(Label label, Object obj) {
        Variable variable = new Variable(label, obj);
        if (label != null) {
            String[] paths = label.getPaths();
            Object key = label.getKey();
            for (String str : paths) {
                this.alias.put(str, variable);
            }
            this.registry.put(key, variable);
        }
    }

    @Override // org.simpleframework.xml.core.Criteria
    public void commit(Object obj) {
        for (V v : this.registry.values()) {
            v.getContact().set(obj, v.getValue());
        }
    }

    public class Registry extends LinkedHashMap {
        public Registry() {
        }

        public Iterator iterator() {
            return keySet().iterator();
        }
    }
}
