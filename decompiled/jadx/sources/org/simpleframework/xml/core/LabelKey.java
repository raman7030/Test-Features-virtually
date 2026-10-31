package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public class LabelKey {
    public final Class label;
    public final String name;
    public final Class owner;
    public final Class type;

    public LabelKey(Contact contact, Annotation annotation) {
        this.owner = contact.getDeclaringClass();
        this.label = annotation.annotationType();
        this.name = contact.getName();
        this.type = contact.getType();
    }

    public int hashCode() {
        return this.name.hashCode() ^ this.owner.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof LabelKey) {
            return equals((LabelKey) obj);
        }
        return false;
    }

    private boolean equals(LabelKey labelKey) {
        if (labelKey == this) {
            return true;
        }
        if (labelKey.label == this.label && labelKey.owner == this.owner && labelKey.type == this.type) {
            return labelKey.name.equals(this.name);
        }
        return false;
    }

    public String toString() {
        return "key '" + this.name + "' for " + this.owner;
    }
}
