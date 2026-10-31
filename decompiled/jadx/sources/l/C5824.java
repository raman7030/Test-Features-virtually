package l;

/* JADX INFO: renamed from: l.ۛۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5824 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f17878;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f17879;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f17880;

    public C5824() {
        this.f17879 = -9223372036854775807L;
        this.f17880 = -3.4028235E38f;
        this.f17878 = -9223372036854775807L;
    }

    public C5824(C11469 c11469) {
        this.f17879 = c11469.f34255;
        this.f17880 = c11469.f34256;
        this.f17878 = c11469.f34254;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16330(long j) {
        this.f17879 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16328(float f) {
        C22632.m50631(f > 0.0f || f == -3.4028235E38f);
        this.f17880 = f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16329(long j) {
        C22632.m50631(j >= 0 || j == -9223372036854775807L);
        this.f17878 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11469 m16327() {
        return new C11469(this);
    }
}
