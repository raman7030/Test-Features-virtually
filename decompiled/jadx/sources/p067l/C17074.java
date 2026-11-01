package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5GB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17074 extends AbstractC2953 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ List f50480;

    public C17074(List list) {
        this.f50480 = list;
    }

    @Override // p067l.AbstractC2953, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return AbstractC22626.m50683(this.f50480).m50685(C21770.f68548).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50480.size();
    }
}
