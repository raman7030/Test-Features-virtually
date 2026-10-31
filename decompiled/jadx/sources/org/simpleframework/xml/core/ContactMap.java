package org.simpleframework.xml.core;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ContactMap extends LinkedHashMap implements Iterable {
    @Override // java.lang.Iterable
    public Iterator iterator() {
        return values().iterator();
    }
}
