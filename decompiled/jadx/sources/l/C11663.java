package l;

/* JADX INFO: renamed from: l.ۨۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C11663 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C7429 f34766;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16059 f34767;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18177 f34768;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f34769;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f34770;

    public C11663(C18177 c18177, long j, C7429 c7429, C16059 c16059) {
        this.f34768 = c18177;
        this.f34769 = j;
        this.f34766 = c7429;
        this.f34767 = c16059;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16059 m28553() {
        if (this.f34770) {
            throw new IllegalStateException("SaveHandle is not active");
        }
        return this.f34767;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f34768.m42383(this);
    }
}
