package l;

import android.content.Context;

/* JADX INFO: renamed from: l.ۡ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70U */
/* JADX INFO: loaded from: classes3.dex */
public final class C8740 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f26613;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile long f26614;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6807 f26615;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile C1868 f26616;

    public C8740(C6807 c6807) {
        this.f26615 = c6807;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22607() {
        C1868 c1868 = this.f26616;
        if (c1868 == null || !this.f26613) {
            return;
        }
        Context context = this.f26615.getContext();
        if (context instanceof AbstractActivityC3346) {
            AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) context;
            if (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
                return;
            }
        }
        if (this.f26615.f21109.m27396(c1868, this.f26614)) {
            this.f26615.invalidate();
            C6807 c6807 = this.f26615;
            c6807.m18483(c6807.f21109.m27418());
        }
    }
}
