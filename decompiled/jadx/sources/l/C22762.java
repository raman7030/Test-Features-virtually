package l;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22762 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f73494;

    public C22762(ArrayList arrayList) {
        this.f73494 = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f73494.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f73494.size();
    }
}
