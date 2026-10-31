package l;

/* JADX INFO: renamed from: l.ܰ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14042 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11927 f42448;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f42449;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1594 f42450;

    public C14042(C1594 c1594, C11927 c11927) {
        this.f42450 = c1594;
        this.f42448 = c11927;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m33652() {
        return this.f42448.f35657;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f42449) {
            return;
        }
        this.f42449 = true;
        C1594 c1594 = this.f42450;
        C11927 c11927 = this.f42448;
        synchronized (c1594) {
            int i = c11927.f35658;
            if (i <= 0) {
                throw new IllegalStateException("Preview page is not pinned");
            }
            c11927.f35658 = i - 1;
        }
    }
}
