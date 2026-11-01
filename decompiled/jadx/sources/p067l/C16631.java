package p067l;

/* JADX INFO: renamed from: l.ܶۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16631 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final C14443 f48875;

    /* JADX INFO: renamed from: ۙ */
    public final C4523 f48876;

    /* JADX INFO: renamed from: ᩶ */
    public final long f48877;

    /* JADX INFO: renamed from: ᩸ */
    public C4563 f48878;

    /* JADX INFO: renamed from: ᩹ */
    public C7245 f48879;

    public C16631(C14443 c14443, C4523 c4523, C4563 c4563, C7245 c7245, long j) {
        this.f48875 = c14443;
        c4523.m9579();
        this.f48876 = c4523;
        this.f48877 = j;
        this.f48878 = c4563;
        this.f48879 = c7245;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C4523 c4523 = this.f48876;
        this.f48878 = null;
        this.f48879 = null;
        try {
            this.f48875.close();
        } finally {
            c4523.close();
        }
    }
}
