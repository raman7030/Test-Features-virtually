package p067l;

import android.os.Build;

/* JADX INFO: renamed from: l.۫ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13918 extends AbstractC1293 {

    /* JADX INFO: renamed from: ۧ */
    public int[] f39270 = null;

    /* JADX INFO: renamed from: ܽ */
    public C1560 f39271;

    /* JADX INFO: renamed from: ֫ */
    public final void m31636(int... iArr) {
        this.f39270 = iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31635(C1560 c1560) {
        this.f39271 = c1560;
    }

    @Override // p067l.AbstractC1293
    /* JADX INFO: renamed from: ֫ */
    public final void mo20826(InterfaceC1713 interfaceC1713) {
        if (Build.VERSION.SDK_INT >= 34) {
            C5201.m11160(interfaceC1713.mo23965(), C5201.m11159(C14588.m33380(C5201.m11158(), null, 0, null, Boolean.FALSE), this.f39270, this.f39271));
        } else {
            C5201.m11160(interfaceC1713.mo23965(), C5201.m11159(C5201.m11158(), this.f39270, this.f39271));
        }
    }
}
