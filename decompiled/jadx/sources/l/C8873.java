package l;

/* JADX INFO: renamed from: l.ۡ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8TF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8873 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f27011;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f27012;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f27013;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22926() {
        this.f27011 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22925(boolean z) {
        this.f27012 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22927(boolean z) {
        this.f27013 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15927 m22924() {
        if (!this.f27011 && (this.f27012 || this.f27013)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new C15927(this);
    }
}
