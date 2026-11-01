package p067l;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C24001 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ArrayList f76220;

    public C24001(ArrayList arrayList) {
        this.f76220 = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f76220.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f76220.size();
    }
}
