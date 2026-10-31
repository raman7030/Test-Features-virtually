package l;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8KP */
/* JADX INFO: loaded from: classes2.dex */
public final class C5976 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f18344;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10210 f18345;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f18346;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f18347;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f18348;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f18349;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f18350;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f18351;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long[] f18352;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f18353;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f18354;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f18355;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f18356;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f18357;

    public C5976(int i, C10210 c10210, InterfaceC19383 interfaceC19383) {
        int i2 = c10210.f30668;
        this.f18345 = c10210;
        int iM25618 = c10210.m25618();
        boolean z = true;
        if (iM25618 != 1 && iM25618 != 2) {
            z = false;
        }
        C22632.m50631(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f18355 = (iM25618 == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) c10210.f30673) * 1000000;
        long j2 = c10210.f30669;
        String str = C3603.f11424;
        this.f18357 = C3603.m11017(i2, j, j2, RoundingMode.DOWN);
        this.f18346 = interfaceC19383;
        this.f18344 = iM25618 == 2 ? i3 | 1650720768 : -1;
        this.f18347 = -1L;
        this.f18352 = new long[512];
        this.f18348 = new int[512];
        this.f18353 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16763(long j, boolean z) {
        if (this.f18347 == -1) {
            this.f18347 = j;
        }
        if (z) {
            if (this.f18349 == this.f18348.length) {
                long[] jArr = this.f18352;
                this.f18352 = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f18348;
                this.f18348 = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f18352;
            int i = this.f18349;
            jArr2[i] = j;
            this.f18348[i] = this.f18356;
            this.f18349 = i + 1;
        }
        this.f18356++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16762() {
        int i;
        this.f18352 = Arrays.copyOf(this.f18352, this.f18349);
        this.f18348 = Arrays.copyOf(this.f18348, this.f18349);
        if ((this.f18355 & 1651965952) != 1651965952 || this.f18345.f30671 == 0 || (i = this.f18349) <= 0) {
            return;
        }
        this.f18353 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16764(int i) {
        return this.f18355 == i || this.f18344 == i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16766(int i) {
        this.f18351 = i;
        this.f18350 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16765(InterfaceC8424 interfaceC8424) {
        int i = this.f18350;
        int iMo8451 = i - this.f18346.mo8451((InterfaceC9765) interfaceC8424, i, false);
        this.f18350 = iMo8451;
        boolean z = iMo8451 == 0;
        if (z) {
            if (this.f18351 > 0) {
                int i2 = this.f18354;
                this.f18346.mo8455((this.f18357 * ((long) i2)) / ((long) this.f18353), Arrays.binarySearch(this.f18348, i2) >= 0 ? 1 : 0, this.f18351, 0, null);
            }
            this.f18354++;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16767(long j) {
        if (this.f18349 == 0) {
            this.f18354 = 0;
        } else {
            this.f18354 = this.f18348[C3603.m11036(this.f18352, j, true)];
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6682 m16761(long j) {
        if (this.f18349 == 0) {
            C8799 c8799 = new C8799(0L, this.f18347);
            return new C6682(c8799, c8799);
        }
        int i = (int) (j / ((this.f18357 * ((long) 1)) / ((long) this.f18353)));
        int iM11011 = C3603.m11011(this.f18348, i, true, true);
        if (this.f18348[iM11011] == i) {
            C8799 c8799M16760 = m16760(iM11011);
            return new C6682(c8799M16760, c8799M16760);
        }
        C8799 c8799M16761 = m16760(iM11011);
        int i2 = iM11011 + 1;
        if (i2 >= this.f18352.length) {
            return new C6682(c8799M16761, c8799M16761);
        }
        return new C6682(c8799M16761, m16760(i2));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C8799 m16760(int i) {
        return new C8799(((this.f18357 * ((long) 1)) / ((long) this.f18353)) * ((long) this.f18348[i]), this.f18352[i]);
    }
}
