package l;

/* JADX INFO: renamed from: l.ܶۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15007 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12704 f45762;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2267 f45763;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f45764;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2309 f45765;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C5131 f45766;

    public C15007(C12704 c12704, C2267 c2267, C2309 c2309, C5131 c5131, long j) {
        this.f45762 = c12704;
        c2267.m7497();
        this.f45763 = c2267;
        this.f45764 = j;
        this.f45765 = c2309;
        this.f45766 = c5131;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C2267 c2267 = this.f45763;
        this.f45765 = null;
        this.f45766 = null;
        try {
            this.f45762.close();
        } finally {
            c2267.close();
        }
    }
}
