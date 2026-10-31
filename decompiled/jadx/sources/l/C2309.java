package l;

/* JADX INFO: renamed from: l.ۖۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86TL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2309 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f7440;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9611 f7441;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f7442;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5089 f7443;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f7444;

    public C2309() {
        this(new C9611(), new C5089(-1, -1), 0L, 0L, 16777216L);
    }

    public C2309(C9611 c9611, C5089 c5089, long j, long j2, long j3) {
        if (j2 < 0 || j < 0 || j > j2 || j3 < 0) {
            throw new IllegalArgumentException("Invalid history state");
        }
        C11003.requireNonNull(c9611);
        this.f7441 = c9611;
        C11003.requireNonNull(c5089);
        this.f7443 = c5089;
        this.f7440 = j;
        this.f7444 = j2;
        this.f7442 = j3;
    }
}
