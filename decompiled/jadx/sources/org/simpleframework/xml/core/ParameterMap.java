package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ParameterMap extends LinkedHashMap implements Iterable {
    @Override // java.lang.Iterable
    public Iterator iterator() {
        return values().iterator();
    }

    public Parameter get(int i) {
        return (Parameter) getAll().get(i);
    }

    public List getAll() {
        Collection<V> collectionValues = values();
        if (!collectionValues.isEmpty()) {
            return new ArrayList(collectionValues);
        }
        return Collections.EMPTY_LIST;
    }
}
