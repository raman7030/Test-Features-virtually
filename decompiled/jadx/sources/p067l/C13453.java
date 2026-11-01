package p067l;

/* JADX INFO: renamed from: l.ۨۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C13453 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final C9429 f37765;

    /* JADX INFO: renamed from: ۙ */
    public final C17631 f37766;

    /* JADX INFO: renamed from: ᩶ */
    public final C19644 f37767;

    /* JADX INFO: renamed from: ᩸ */
    public final long f37768;

    /* JADX INFO: renamed from: ᩹ */
    public volatile boolean f37769;

    public C13453(C19644 c19644, long j, C9429 c9429, C17631 c17631) {
        this.f37767 = c19644;
        this.f37768 = j;
        this.f37765 = c9429;
        this.f37766 = c17631;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17631 m30601() {
        if (this.f37769) {
            throw new IllegalStateException("SaveHandle is not active");
        }
        return this.f37766;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f37767.m44644(this);
    }
}
