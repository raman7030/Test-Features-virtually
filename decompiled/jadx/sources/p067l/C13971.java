package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۫ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes4.dex */
public final class C13971 extends C14641 {

    /* JADX INFO: renamed from: ۬ */
    public final Comparator f39442;

    @Override // p067l.C14641
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9948 mo31747(int i, Object[] objArr) {
        C11755.m26983(objArr.length, 0, i);
        return new C23359(objArr, 0, i, this.f41790, this.f39442);
    }

    public C13971(InterfaceC16514 interfaceC16514, long j, Comparator comparator) {
        super(interfaceC16514, j, 85);
        this.f39442 = comparator;
    }

    @Override // p067l.C14641, p067l.InterfaceC16847
    public final Comparator getComparator() {
        return this.f39442;
    }
}
