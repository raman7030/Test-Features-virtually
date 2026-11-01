package p067l;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8KP */
/* JADX INFO: loaded from: classes2.dex */
public final class C8048 {

    /* JADX INFO: renamed from: ֫ */
    public final int f21196;

    /* JADX INFO: renamed from: ۖ */
    public final C12072 f21197;

    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC20790 f21198;

    /* JADX INFO: renamed from: ۜ */
    public long f21199;

    /* JADX INFO: renamed from: ۡ */
    public int[] f21200;

    /* JADX INFO: renamed from: ۢ */
    public int f21201;

    /* JADX INFO: renamed from: ۧ */
    public int f21202;

    /* JADX INFO: renamed from: ܳ */
    public int f21203;

    /* JADX INFO: renamed from: ܺ */
    public long[] f21204;

    /* JADX INFO: renamed from: ܽ */
    public int f21205;

    /* JADX INFO: renamed from: ܿ */
    public int f21206;

    /* JADX INFO: renamed from: ᩳ */
    public final int f21207;

    /* JADX INFO: renamed from: ᩷ */
    public int f21208;

    /* JADX INFO: renamed from: ᩻ */
    public final long f21209;

    public C8048(int i, C12072 c12072, InterfaceC20790 interfaceC20790) {
        int i2 = c12072.f33629;
        this.f21197 = c12072;
        int iM27640 = c12072.m27640();
        boolean z = true;
        if (iM27640 != 1 && iM27640 != 2) {
            z = false;
        }
        C23877.m52957(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f21207 = (iM27640 == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) c12072.f33634) * 1000000;
        long j2 = c12072.f33630;
        String str = C5792.f14228;
        this.f21209 = C5792.m12993(i2, j, j2, RoundingMode.DOWN);
        this.f21198 = interfaceC20790;
        this.f21196 = iM27640 == 2 ? i3 | 1650720768 : -1;
        this.f21199 = -1L;
        this.f21204 = new long[512];
        this.f21200 = new int[512];
        this.f21205 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18689(long j, boolean z) {
        if (this.f21199 == -1) {
            this.f21199 = j;
        }
        if (z) {
            if (this.f21201 == this.f21200.length) {
                long[] jArr = this.f21204;
                this.f21204 = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f21200;
                this.f21200 = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f21204;
            int i = this.f21201;
            jArr2[i] = j;
            this.f21200[i] = this.f21208;
            this.f21201 = i + 1;
        }
        this.f21208++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18688() {
        int i;
        this.f21204 = Arrays.copyOf(this.f21204, this.f21201);
        this.f21200 = Arrays.copyOf(this.f21200, this.f21201);
        if ((this.f21207 & 1651965952) != 1651965952 || this.f21197.f33632 == 0 || (i = this.f21201) <= 0) {
            return;
        }
        this.f21205 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m18690(int i) {
        return this.f21207 == i || this.f21196 == i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18692(int i) {
        this.f21203 = i;
        this.f21202 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m18691(InterfaceC10375 interfaceC10375) {
        int i = this.f21202;
        int iMo10498 = i - this.f21198.mo10498((InterfaceC11649) interfaceC10375, i, false);
        this.f21202 = iMo10498;
        boolean z = iMo10498 == 0;
        if (z) {
            if (this.f21203 > 0) {
                int i2 = this.f21206;
                this.f21198.mo10502((this.f21209 * ((long) i2)) / ((long) this.f21205), Arrays.binarySearch(this.f21200, i2) >= 0 ? 1 : 0, this.f21203, 0, null);
            }
            this.f21206++;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18693(long j) {
        if (this.f21201 == 0) {
            this.f21206 = 0;
        } else {
            this.f21206 = this.f21200[C5792.m13012(this.f21204, j, true)];
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8719 m18687(long j) {
        if (this.f21201 == 0) {
            C10731 c10731 = new C10731(0L, this.f21199);
            return new C8719(c10731, c10731);
        }
        int i = (int) (j / ((this.f21209 * ((long) 1)) / ((long) this.f21205)));
        int iM12987 = C5792.m12987(this.f21200, i, true, true);
        if (this.f21200[iM12987] == i) {
            C10731 c10731M18686 = m18686(iM12987);
            return new C8719(c10731M18686, c10731M18686);
        }
        C10731 c10731M18687 = m18686(iM12987);
        int i2 = iM12987 + 1;
        if (i2 >= this.f21204.length) {
            return new C8719(c10731M18687, c10731M18687);
        }
        return new C8719(c10731M18687, m18686(i2));
    }

    /* JADX INFO: renamed from: ܽ */
    private C10731 m18686(int i) {
        return new C10731(((this.f21209 * ((long) 1)) / ((long) this.f21205)) * ((long) this.f21200[i]), this.f21204[i]);
    }
}
