package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes4.dex */
public final class C16589 extends AbstractC22626 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterable[] f48730;

    public C16589(Iterable[] iterableArr) {
        this.f48730 = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable[] iterableArr = this.f48730;
        return new C7457(new C9884(iterableArr.length, iterableArr));
    }
}
