package l;

import android.content.Context;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12267 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6807 f36544;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C3095 f36545;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12972 f36546;

    public C12267(C6807 c6807, C12972 c12972) {
        this.f36544 = c6807;
        this.f36546 = c12972;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29799() {
        C3095 c3095 = this.f36545;
        if (c3095 != null) {
            Context context = this.f36544.getContext();
            if (context instanceof AbstractActivityC3346) {
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) context;
                if (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
                    return;
                }
            }
            boolean z = c3095.f9678;
            if (z) {
                if (this.f36546.m31539(this.f36544)) {
                    C21374.m48462(R.string.MT_Protector, 0).m48468();
                    return;
                }
                return;
            }
            C6807 c6807 = this.f36544;
            C12972 c12972 = this.f36546;
            if (z || !c6807.f21109.m27400(c12972.f38873, c3095.f9677, c12972.f38877, c12972.f38876, c3095.f9679)) {
                return;
            }
            this.f36544.invalidate();
            C6807 c6808 = this.f36544;
            c6808.m18483(c6808.f21109.m27418());
        }
    }
}
