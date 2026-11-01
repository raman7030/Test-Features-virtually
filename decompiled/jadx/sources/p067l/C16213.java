package p067l;

/* JADX INFO: renamed from: l.ܳܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16213 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final C8838 f47707;

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f47708;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f47709;

    public C16213(C8838 c8838) {
        this.f47707 = c8838;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m36971() {
        return this.f47708;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36970() {
        this.f47708 = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f47709) {
                return;
            }
            this.f47709 = true;
            C8838.m20410(this.f47707, this);
        }
    }
}
