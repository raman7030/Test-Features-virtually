package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9JB */
/* JADX INFO: loaded from: classes3.dex */
public final class C14648 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f41833 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m33517(C24864 c24864, C2460 c2460) {
        c2460.m28121(2);
        byte bM28120 = c2460.m28120();
        c2460.m28121(1);
        int iM28124 = c2460.m28124();
        if (bM28120 > 0) {
            for (int i = 0; i < bM28120; i++) {
                c2460.m28124();
                c2460.m28121(4);
                m33515(c24864, c2460);
            }
            return;
        }
        if (iM28124 > 0) {
            m33515(c24864, c2460);
        } else {
            if (iM28124 != 0 || c2460.m28117() <= 0) {
                return;
            }
            c2460.m28121(1);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m33515(C24864 c24864, C2460 c2460) {
        long jM54605 = c24864.m54605();
        long value = EnumC9460.STATUS_BUFFER_TOO_SMALL.getValue();
        ArrayList arrayList = this.f41833;
        if (jM54605 == value) {
            C21355 c21355 = new C21355();
            c2460.m28107();
            arrayList.add(c21355);
        } else if (jM54605 == EnumC9460.STATUS_STOPPED_ON_SYMLINK.getValue()) {
            C5261 c5261 = new C5261();
            C5261.m11339(c5261, c2460);
            arrayList.add(c5261);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m33516() {
        return this.f41833;
    }
}
