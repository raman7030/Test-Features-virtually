package p067l;

import android.content.Context;

/* JADX INFO: renamed from: l.ۡ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70U */
/* JADX INFO: loaded from: classes3.dex */
public final class C10675 {

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f29538;

    /* JADX INFO: renamed from: ۧ */
    public volatile long f29539;

    /* JADX INFO: renamed from: ܽ */
    public final C8838 f29540;

    /* JADX INFO: renamed from: ᩳ */
    public volatile C4144 f29541;

    public C10675(C8838 c8838) {
        this.f29540 = c8838;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24576() {
        C4144 c4144 = this.f29541;
        if (c4144 == null || !this.f29538) {
            return;
        }
        Context context = this.f29540.getContext();
        if (context instanceof AbstractActivityC5549) {
            AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) context;
            if (abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) {
                return;
            }
        }
        if (this.f29540.f23986.m29458(c4144, this.f29539)) {
            this.f29540.invalidate();
            C8838 c8838 = this.f29540;
            c8838.m20432(c8838.f23986.m29480());
        }
    }
}
