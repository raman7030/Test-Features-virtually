package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes2.dex */
public final class C2732 extends AbstractC2953 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C15472 f4588;

    public C2732(C15472 c15472) {
        this.f4588 = c15472;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4588.f44183.m52300();
    }

    @Override // p067l.AbstractC2953, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C3403(this.f4588);
    }
}
