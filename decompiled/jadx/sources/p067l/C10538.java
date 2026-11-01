package p067l;

/* JADX INFO: renamed from: l.ۡۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes3.dex */
public final class C10538 {

    /* JADX INFO: renamed from: ֫ */
    public final C17242 f29166;

    /* JADX INFO: renamed from: ۧ */
    public final C16611 f29167;

    /* JADX INFO: renamed from: ܳ */
    public final C24320 f29168;

    /* JADX INFO: renamed from: ܽ */
    public boolean f29169;

    /* JADX INFO: renamed from: ܿ */
    public final C19926 f29170;

    /* JADX INFO: renamed from: ᩳ */
    public final long f29171;

    public C10538(C19926 c19926, long j, C24320 c24320, C17242 c17242, C16611 c16611) {
        this.f29170 = c19926;
        this.f29171 = j;
        this.f29168 = c24320;
        this.f29166 = c17242;
        this.f29167 = c16611;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24279(C10538 c10538, C19926 c19926, boolean z) {
        synchronized (c10538) {
            if (c10538.f29170 != c19926) {
                throw new IllegalArgumentException("Syntax request belongs to another session");
            }
            if (z != (c10538.f29166 != null)) {
                throw new IllegalArgumentException("Syntax request type does not match construction");
            }
            if (c10538.f29169) {
                throw new IllegalStateException("Syntax request was already constructed");
            }
            c10538.f29169 = true;
        }
    }
}
