package l;

/* JADX INFO: renamed from: l.ܳܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14567 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6807 f44600;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f44601;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f44602;

    public C14567(C6807 c6807) {
        this.f44600 = c6807;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m34822() {
        return this.f44601;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34821() {
        this.f44601 = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f44602) {
                return;
            }
            this.f44602 = true;
            C6807.m18461(this.f44600, this);
        }
    }
}
