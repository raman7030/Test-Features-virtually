package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayValue implements Value {
    public int size;
    public Class type;
    public Object value;

    @Override // org.simpleframework.xml.strategy.Value
    public boolean isReference() {
        return false;
    }

    public ArrayValue(Class cls, int i) {
        this.type = cls;
        this.size = i;
    }

    @Override // org.simpleframework.xml.strategy.Value
    public Object getValue() {
        return this.value;
    }

    @Override // org.simpleframework.xml.strategy.Value
    public void setValue(Object obj) {
        this.value = obj;
    }

    @Override // org.simpleframework.xml.strategy.Value
    public Class getType() {
        return this.type;
    }

    @Override // org.simpleframework.xml.strategy.Value
    public int getLength() {
        return this.size;
    }
}
