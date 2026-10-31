package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩹ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes2.dex */
public final class C22086 extends C21381 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Comparator f71740;

    public C22086(Object[] objArr, int i, int i2, int i3, Comparator comparator) {
        super(i, i2, i3 | 20, objArr);
        this.f71740 = comparator;
    }

    @Override // l.C21381
    /* JADX INFO: renamed from: ֫ */
    public final C21381 mo48470(int i, int i2) {
        return new C22086(this.f68875, i, i2, this.f68876, this.f71740);
    }

    @Override // l.C21381, l.InterfaceC15234
    public final Comparator getComparator() {
        return this.f71740;
    }
}
