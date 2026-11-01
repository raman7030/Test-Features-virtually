package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩹ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes2.dex */
public final class C23359 extends C22689 {

    /* JADX INFO: renamed from: ۬ */
    public final Comparator f74460;

    public C23359(Object[] objArr, int i, int i2, int i3, Comparator comparator) {
        super(i, i2, i3 | 20, objArr);
        this.f74460 = comparator;
    }

    @Override // p067l.C22689
    /* JADX INFO: renamed from: ֫ */
    public final C22689 mo50806(int i, int i2) {
        return new C23359(this.f71570, i, i2, this.f71571, this.f74460);
    }

    @Override // p067l.C22689, p067l.InterfaceC16847
    public final Comparator getComparator() {
        return this.f74460;
    }
}
