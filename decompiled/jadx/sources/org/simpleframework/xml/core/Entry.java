package org.simpleframework.xml.core;

import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.strategy.Type;

/* JADX INFO: loaded from: classes2.dex */
public class Entry {
    public static final String DEFAULT_NAME = "entry";
    public boolean attribute;
    public Contact contact;
    public String entry;
    public String key;
    public Class keyType;
    public ElementMap label;
    public String value;
    public Class valueType;

    public Entry(Contact contact, ElementMap elementMap) {
        this.attribute = elementMap.attribute();
        this.entry = elementMap.entry();
        this.value = elementMap.value();
        this.key = elementMap.key();
        this.contact = contact;
        this.label = elementMap;
    }

    public Contact getContact() {
        return this.contact;
    }

    public boolean isAttribute() {
        return this.attribute;
    }

    public boolean isInline() {
        return isAttribute();
    }

    public Converter getKey(Context context) {
        Type keyType = getKeyType();
        if (context.isPrimitive(keyType)) {
            return new PrimitiveKey(context, this, keyType);
        }
        return new CompositeKey(context, this, keyType);
    }

    public Converter getValue(Context context) {
        Type valueType = getValueType();
        if (context.isPrimitive(valueType)) {
            return new PrimitiveValue(context, this, valueType);
        }
        return new CompositeValue(context, this, valueType);
    }

    public Type getKeyType() {
        if (this.keyType == null) {
            Class clsKeyType = this.label.keyType();
            this.keyType = clsKeyType;
            if (clsKeyType == Void.TYPE) {
                this.keyType = getDependent(0);
            }
        }
        return new ClassType(this.keyType);
    }

    public Type getValueType() {
        if (this.valueType == null) {
            Class clsValueType = this.label.valueType();
            this.valueType = clsValueType;
            if (clsValueType == Void.TYPE) {
                this.valueType = getDependent(1);
            }
        }
        return new ClassType(this.valueType);
    }

    private Class getDependent(int i) {
        Class[] dependents = this.contact.getDependents();
        return (dependents.length >= i && dependents.length != 0) ? dependents[i] : Object.class;
    }

    public String getKey() {
        String str = this.key;
        if (str == null) {
            return str;
        }
        if (isEmpty(str)) {
            this.key = null;
        }
        return this.key;
    }

    public String getValue() {
        String str = this.value;
        if (str == null) {
            return str;
        }
        if (isEmpty(str)) {
            this.value = null;
        }
        return this.value;
    }

    public String getEntry() {
        String str = this.entry;
        if (str == null) {
            return str;
        }
        if (isEmpty(str)) {
            this.entry = DEFAULT_NAME;
        }
        return this.entry;
    }

    private boolean isEmpty(String str) {
        return str.length() == 0;
    }

    public String toString() {
        return String.format("%s on %s", this.label, this.contact);
    }
}
