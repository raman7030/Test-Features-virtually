package p067l;

/* JADX INFO: renamed from: l.ۛۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KR */
/* JADX INFO: loaded from: classes2.dex */
public final class C7903 {

    /* JADX INFO: renamed from: ֫ */
    public long f20730;

    /* JADX INFO: renamed from: ۧ */
    public long f20731;

    /* JADX INFO: renamed from: ܽ */
    public float f20732;

    public C7903() {
        this.f20731 = -9223372036854775807L;
        this.f20732 = -3.4028235E38f;
        this.f20730 = -9223372036854775807L;
    }

    public C7903(C13268 c13268) {
        this.f20731 = c13268.f37251;
        this.f20732 = c13268.f37252;
        this.f20730 = c13268.f37250;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18255(long j) {
        this.f20731 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18253(float f) {
        C23877.m52957(f > 0.0f || f == -3.4028235E38f);
        this.f20732 = f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18254(long j) {
        C23877.m52957(j >= 0 || j == -9223372036854775807L);
        this.f20730 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13268 m18252() {
        return new C13268(this);
    }
}
