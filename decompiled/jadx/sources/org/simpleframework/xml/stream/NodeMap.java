package org.simpleframework.xml.stream;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public interface NodeMap extends Iterable {
    Node get(String str);

    String getName();

    Node getNode();

    @Override // java.lang.Iterable
    Iterator iterator();

    Node put(String str, String str2);

    Node remove(String str);
}
