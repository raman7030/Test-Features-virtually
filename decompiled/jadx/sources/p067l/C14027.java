package p067l;

import android.content.Context;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14027 {

    /* JADX INFO: renamed from: ֫ */
    public final C8838 f39560;

    /* JADX INFO: renamed from: ۧ */
    public volatile C5310 f39561;

    /* JADX INFO: renamed from: ܽ */
    public final C14697 f39562;

    public C14027(C8838 c8838, C14697 c14697) {
        this.f39560 = c8838;
        this.f39562 = c14697;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31861() {
        C5310 c5310 = this.f39561;
        if (c5310 != null) {
            Context context = this.f39560.getContext();
            if (context instanceof AbstractActivityC5549) {
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) context;
                if (abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) {
                    return;
                }
            }
            boolean z = c5310.f12480;
            if (z) {
                if (this.f39562.m33624(this.f39560)) {
                    C22682.m50798(R.string.MT_Protector, 0).m50804();
                    return;
                }
                return;
            }
            C8838 c8838 = this.f39560;
            C14697 c14697 = this.f39562;
            if (z || !c8838.f23986.m29462(c14697.f41917, c5310.f12479, c14697.f41921, c14697.f41920, c5310.f12481)) {
                return;
            }
            this.f39560.invalidate();
            C8838 c8839 = this.f39560;
            c8839.m20432(c8839.f23986.m29480());
        }
    }
}
