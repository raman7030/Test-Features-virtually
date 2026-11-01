package p067l;

/* JADX INFO: renamed from: l.ۖۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86TL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4563 {

    /* JADX INFO: renamed from: ֫ */
    public final long f10226;

    /* JADX INFO: renamed from: ۧ */
    public final C11503 f10227;

    /* JADX INFO: renamed from: ܽ */
    public final long f10228;

    /* JADX INFO: renamed from: ܿ */
    public final C7205 f10229;

    /* JADX INFO: renamed from: ᩳ */
    public final long f10230;

    public C4563() {
        this(new C11503(), new C7205(-1, -1), 0L, 0L, 16777216L);
    }

    public C4563(C11503 c11503, C7205 c7205, long j, long j2, long j3) {
        if (j2 < 0 || j < 0 || j > j2 || j3 < 0) {
            throw new IllegalArgumentException("Invalid history state");
        }
        C12826.requireNonNull(c11503);
        this.f10227 = c11503;
        C12826.requireNonNull(c7205);
        this.f10229 = c7205;
        this.f10226 = j;
        this.f10230 = j2;
        this.f10228 = j3;
    }
}
