package l;

import java.math.RoundingMode;

/* JADX INFO: renamed from: l.᩸ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21375 implements InterfaceC15023 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21830 f68860;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19964 f68861;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8353 f68862;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f68863;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f68864;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f68865;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f68866;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f68867;

    public C21375(InterfaceC21830 interfaceC21830, InterfaceC19383 interfaceC19383, C19964 c19964, String str, int i) throws C9080 {
        this.f68860 = interfaceC21830;
        this.f68867 = interfaceC19383;
        this.f68861 = c19964;
        int i2 = c19964.f64652;
        int i3 = c19964.f64654;
        int i4 = (c19964.f64650 * i2) / 8;
        int i5 = c19964.f64651;
        if (i5 != i4) {
            throw C9080.m23440("Expected block size: " + i4 + "; got: " + i5, (Throwable) null);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.f68863 = iMax;
        C1297 c1297 = new C1297();
        c1297.m4462("audio/wav");
        c1297.m4465(str);
        c1297.m4468(i7);
        c1297.m4438(i7);
        c1297.m4451(iMax);
        c1297.m4472(i2);
        c1297.m4456(i3);
        c1297.m4475(i);
        this.f68862 = c1297.m4440();
    }

    @Override // l.InterfaceC15023
    /* JADX INFO: renamed from: ֫ */
    public final void mo21274(long j) {
        this.f68865 = j;
        this.f68866 = 0;
        this.f68864 = 0L;
    }

    @Override // l.InterfaceC15023
    /* JADX INFO: renamed from: ֫ */
    public final void mo21273(int i, long j) {
        C12907 c12907 = new C12907(this.f68861, 1, i, j);
        this.f68860.mo3430(c12907);
        C8353 c8353 = this.f68862;
        InterfaceC19383 interfaceC19383 = this.f68867;
        interfaceC19383.mo8456(c8353);
        interfaceC19383.mo8454(c12907.mo6827());
    }

    @Override // l.InterfaceC15023
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21275(InterfaceC8424 interfaceC8424, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f68866) < (i2 = this.f68863)) {
            int iMo8451 = this.f68867.mo8451((InterfaceC9765) interfaceC8424, (int) Math.min(i2 - i, j2), true);
            if (iMo8451 == -1) {
                j2 = 0;
            } else {
                this.f68866 += iMo8451;
                j2 -= (long) iMo8451;
            }
        }
        C19964 c19964 = this.f68861;
        int i3 = c19964.f64651;
        int i4 = this.f68866 / i3;
        if (i4 > 0) {
            long j3 = this.f68865;
            long j4 = this.f68864;
            long j5 = c19964.f64654;
            String str = C3603.f11424;
            long jM11017 = j3 + C3603.m11017(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.f68866 - i5;
            this.f68867.mo8455(jM11017, 1, i5, i6, null);
            this.f68864 += (long) i4;
            this.f68866 = i6;
        }
        return j2 <= 0;
    }
}
