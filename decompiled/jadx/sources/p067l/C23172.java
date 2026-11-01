package p067l;

/* JADX INFO: renamed from: l.᩸᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6MU */
/* JADX INFO: loaded from: classes.dex */
public final class C23172 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public C16819 f72789;

    /* JADX INFO: renamed from: ۙ */
    public C15321 f72790;

    /* JADX INFO: renamed from: ۫ */
    public boolean f72791 = true;

    /* JADX INFO: renamed from: ۬ */
    public C23369 f72792;

    /* JADX INFO: renamed from: ᩶ */
    public Throwable f72793;

    /* JADX INFO: renamed from: ᩸ */
    public C23526 f72794;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f72795;

    @Override // java.lang.AutoCloseable
    public final void close() {
        C23526 c23526 = this.f72794;
        if (c23526 != null) {
            c23526.close();
        }
        this.f72794 = null;
        C15321 c15321 = this.f72790;
        if (c15321 != null) {
            c15321.m34874(this.f72792);
        } else {
            C23369 c23369 = this.f72792;
            if (c23369 != null) {
                c23369.close();
            }
        }
        this.f72790 = null;
        this.f72792 = null;
    }
}
