package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۫ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes4.dex */
public final class C12208 extends C12913 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Comparator f36427;

    @Override // l.C12913
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7975 mo29685(int i, Object[] objArr) {
        C9876.m24968(objArr.length, 0, i);
        return new C22086(objArr, 0, i, this.f38748, this.f36427);
    }

    public C12208(InterfaceC14884 interfaceC14884, long j, Comparator comparator) {
        super(interfaceC14884, j, 85);
        this.f36427 = comparator;
    }

    @Override // l.C12913, l.InterfaceC15234
    public final Comparator getComparator() {
        return this.f36427;
    }
}
