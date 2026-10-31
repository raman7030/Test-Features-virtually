package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes2.dex */
public final class C0383 extends AbstractC0615 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13788 f1811;

    public C0383(C13788 c13788) {
        this.f1811 = c13788;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1811.f41105.m49972();
    }

    @Override // l.AbstractC0615, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1089(this.f1811);
    }
}
