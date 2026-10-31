package l;

/* JADX INFO: renamed from: l.ᩳۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8IP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17971 implements InterfaceC9505 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f56047;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4433 f56048;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4433 f56049;

    public C17971(long j, long[] jArr, long[] jArr2) {
        C22632.m50631(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i = length + 1;
            C4433 c4433 = new C4433(i);
            this.f56048 = c4433;
            C4433 c4434 = new C4433(i);
            this.f56049 = c4434;
            c4433.m13156(0L);
            c4434.m13156(0L);
        } else {
            this.f56048 = new C4433(length);
            this.f56049 = new C4433(length);
        }
        this.f56048.m13157(jArr);
        this.f56049.m13157(jArr2);
        this.f56047 = j;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return this.f56049.m13154() > 0;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f56047;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        C4433 c4433 = this.f56049;
        if (c4433.m13154() != 0) {
            int iM11010 = C3603.m11010(c4433, j);
            long jM13155 = c4433.m13155(iM11010);
            C4433 c4434 = this.f56048;
            C8799 c8799 = new C8799(jM13155, c4434.m13155(iM11010));
            if (jM13155 == j || iM11010 == c4433.m13154() - 1) {
                return new C6682(c8799, c8799);
            }
            int i = iM11010 + 1;
            return new C6682(c8799, new C8799(c4433.m13155(i), c4434.m13155(i)));
        }
        C8799 c87910 = C8799.f26802;
        return new C6682(c87910, c87910);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41981(long j, long j2) {
        C4433 c4433 = this.f56049;
        int iM13154 = c4433.m13154();
        C4433 c4434 = this.f56048;
        if (iM13154 == 0 && j > 0) {
            c4434.m13156(0L);
            c4433.m13156(0L);
        }
        c4434.m13156(j2);
        c4433.m13156(j);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m41982(long j) {
        C4433 c4433 = this.f56049;
        if (c4433.m13154() == 0) {
            return -9223372036854775807L;
        }
        return c4433.m13155(C3603.m11010(this.f56048, j));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m41983(long j) {
        C4433 c4433 = this.f56049;
        return c4433.m13154() != 0 && j - c4433.m13155(c4433.m13154() - 1) < 100000;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m41984(long j) {
        this.f56047 = j;
    }
}
