package p067l;

/* JADX INFO: renamed from: l.۟۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N75S */
/* JADX INFO: loaded from: classes2.dex */
public final class C9338 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final boolean f25442;

    /* JADX INFO: renamed from: ۙ */
    public final String f25443;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f25444;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC17043 f25445;

    /* JADX INFO: renamed from: ᩸ */
    public final long f25446;

    /* JADX INFO: renamed from: ᩹ */
    public final long f25447;

    public C9338(AbstractC17043 abstractC17043, long j, long j2, boolean z, boolean z2) {
        this.f25445 = abstractC17043;
        this.f25443 = abstractC17043.mo25495();
        this.f25447 = j;
        this.f25446 = j2;
        this.f25444 = z;
        this.f25442 = z2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f25444) {
            this.f25445.mo25503();
        }
    }
}
