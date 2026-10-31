package l;

/* JADX INFO: renamed from: l.᩸᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6MU */
/* JADX INFO: loaded from: classes.dex */
public final class C21889 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15205 f70077;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13629 f70078;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f70079 = true;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C22097 f70080;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Throwable f70081;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22262 f70082;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f70083;

    @Override // java.lang.AutoCloseable
    public final void close() {
        C22262 c22262 = this.f70082;
        if (c22262 != null) {
            c22262.close();
        }
        this.f70082 = null;
        C13629 c13629 = this.f70078;
        if (c13629 != null) {
            c13629.m32759(this.f70080);
        } else {
            C22097 c22097 = this.f70080;
            if (c22097 != null) {
                c22097.close();
            }
        }
        this.f70078 = null;
        this.f70080 = null;
    }
}
