package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5GB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15473 extends AbstractC0615 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f47349;

    public C15473(List list) {
        this.f47349 = list;
    }

    @Override // l.AbstractC0615, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return AbstractC21315.m48348(this.f47349).m48350(C20414.f65872).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47349.size();
    }
}
