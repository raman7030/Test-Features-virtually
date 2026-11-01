package p067l;

/* JADX INFO: renamed from: l.ܰ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15714 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final C13704 f45531;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f45532;

    /* JADX INFO: renamed from: ᩹ */
    public final C3883 f45533;

    public C15714(C3883 c3883, C13704 c13704) {
        this.f45533 = c3883;
        this.f45531 = c13704;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m35772() {
        return this.f45531.f38666;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f45532) {
            return;
        }
        this.f45532 = true;
        C3883 c3883 = this.f45533;
        C13704 c13704 = this.f45531;
        synchronized (c3883) {
            int i = c13704.f38667;
            if (i <= 0) {
                throw new IllegalStateException("Preview page is not pinned");
            }
            c13704.f38667 = i - 1;
        }
    }
}
