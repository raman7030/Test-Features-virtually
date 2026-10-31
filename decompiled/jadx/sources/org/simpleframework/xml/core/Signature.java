package org.simpleframework.xml.core;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Signature implements Iterable {
    public final Constructor factory;
    public final ParameterMap parameters;
    public final Class type;

    public Signature(Signature signature) {
        this(signature.factory, signature.type);
    }

    public Signature(Constructor constructor) {
        this(constructor, constructor.getDeclaringClass());
    }

    public Signature(Constructor constructor, Class cls) {
        this.parameters = new ParameterMap();
        this.factory = constructor;
        this.type = cls;
    }

    public int size() {
        return this.parameters.size();
    }

    public boolean isEmpty() {
        return this.parameters.isEmpty();
    }

    public boolean contains(Object obj) {
        return this.parameters.containsKey(obj);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.parameters.iterator();
    }

    public Parameter remove(Object obj) {
        return (Parameter) this.parameters.remove(obj);
    }

    public Parameter get(int i) {
        return this.parameters.get(i);
    }

    public Parameter get(Object obj) {
        return (Parameter) this.parameters.get(obj);
    }

    public List getAll() {
        return this.parameters.getAll();
    }

    public void add(Parameter parameter) {
        Object key = parameter.getKey();
        if (key != null) {
            this.parameters.put(key, parameter);
        }
    }

    public void set(Object obj, Parameter parameter) {
        this.parameters.put(obj, parameter);
    }

    public Object create() {
        if (!this.factory.isAccessible()) {
            this.factory.setAccessible(true);
        }
        return this.factory.newInstance(null);
    }

    public Object create(Object[] objArr) {
        if (!this.factory.isAccessible()) {
            this.factory.setAccessible(true);
        }
        return this.factory.newInstance(objArr);
    }

    public Signature copy() {
        Signature signature = new Signature(this);
        Iterator it = iterator();
        while (it.hasNext()) {
            signature.add((Parameter) it.next());
        }
        return signature;
    }

    public Class getType() {
        return this.type;
    }

    public String toString() {
        return this.factory.toString();
    }
}
