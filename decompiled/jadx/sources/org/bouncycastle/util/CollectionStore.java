package org.bouncycastle.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class CollectionStore implements Store, Iterable {
    public Collection _local;

    public CollectionStore(Collection collection) {
        this._local = new ArrayList(collection);
    }

    @Override // org.bouncycastle.util.Store
    public Collection getMatches(Selector selector) {
        if (selector == null) {
            return new ArrayList(this._local);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this._local) {
            if (selector.match(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator iterator() {
        return getMatches(null).iterator();
    }
}
