package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S7S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18056 {

    /* JADX INFO: renamed from: ֫ */
    public final C12693 f53905;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f53907;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f53908;

    /* JADX INFO: renamed from: ᩳ */
    public final int f53911;

    /* JADX INFO: renamed from: ᩻ */
    public final C4646 f53913 = new C4646();

    /* JADX INFO: renamed from: ܽ */
    public int f53909 = 0;

    /* JADX INFO: renamed from: ܿ */
    public final boolean[] f53910 = new boolean[256];

    /* JADX INFO: renamed from: ۜ */
    public int f53906 = -1;

    /* JADX INFO: renamed from: ᩷ */
    public int f53912 = 0;

    /* JADX INFO: renamed from: ֫ */
    private void m41100(int i, int i2) {
        int i3 = this.f53909;
        boolean[] zArr = this.f53910;
        zArr[i] = true;
        this.f53913.m9836(i, i2);
        byte b = (byte) i;
        byte[] bArr = this.f53907;
        if (i2 == 1) {
            bArr[i3] = b;
            this.f53909 = i3 + 1;
            return;
        }
        if (i2 == 2) {
            bArr[i3] = b;
            bArr[i3 + 1] = b;
            this.f53909 = i3 + 2;
        } else {
            if (i2 == 3) {
                bArr[i3] = b;
                bArr[i3 + 1] = b;
                bArr[i3 + 2] = b;
                this.f53909 = i3 + 3;
                return;
            }
            int i4 = i2 - 4;
            zArr[i4] = true;
            bArr[i3] = b;
            bArr[i3 + 1] = b;
            bArr[i3 + 2] = b;
            bArr[i3 + 3] = b;
            bArr[i3 + 4] = (byte) i4;
            this.f53909 = i3 + 5;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41102(int i) {
        if (this.f53909 > this.f53911) {
            return false;
        }
        int i2 = this.f53906;
        int i3 = this.f53912;
        if (i3 == 0) {
            this.f53906 = i;
            this.f53912 = 1;
        } else if (i2 != i) {
            m41100(i2 & 255, i3);
            this.f53906 = i;
            this.f53912 = 1;
        } else if (i3 == 254) {
            m41100(i2 & 255, 255);
            this.f53912 = 0;
        } else {
            this.f53912 = i3 + 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41101() throws IOException {
        boolean[] zArr;
        int i = this.f53912;
        if (i > 0) {
            m41100(this.f53906 & 255, i);
        }
        int i2 = this.f53909;
        byte[] bArr = this.f53907;
        bArr[i2] = bArr[0];
        int[] iArr = this.f53908;
        int iM36515 = new C16044(bArr, i2, iArr).m36515();
        C12693 c12693 = this.f53905;
        c12693.m29211(24, 3227993);
        c12693.m29211(24, 2511705);
        int iM9834 = this.f53913.m9834();
        c12693.m29211(16, (iM9834 >>> 16) & 65535);
        c12693.m29211(16, iM9834 & 65535);
        c12693.m29212(false);
        c12693.m29211(24, iM36515);
        boolean[] zArr2 = new boolean[16];
        int i3 = 0;
        while (true) {
            zArr = this.f53910;
            if (i3 >= 16) {
                break;
            }
            int i4 = i3 << 4;
            int i5 = 0;
            while (i5 < 16) {
                if (zArr[i4]) {
                    zArr2[i3] = true;
                }
                i5++;
                i4++;
            }
            i3++;
        }
        for (int i6 = 0; i6 < 16; i6++) {
            c12693.m29212(zArr2[i6]);
        }
        for (int i7 = 0; i7 < 16; i7++) {
            if (zArr2[i7]) {
                int i8 = i7 * 16;
                int i9 = 0;
                while (i9 < 16) {
                    c12693.m29212(zArr[i8]);
                    i9++;
                    i8++;
                }
            }
        }
        C10681 c10681 = new C10681(iArr, this.f53909, zArr);
        c10681.m24592();
        new C22081(this.f53905, c10681.m24594(), c10681.m24596(), c10681.m24593(), c10681.m24595()).m49701();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m41104() {
        return this.f53909 == 0 && this.f53912 == 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m41103() {
        return this.f53913.m9834();
    }

    public C18056(C12693 c12693, int i) {
        this.f53905 = c12693;
        int i2 = i + 1;
        this.f53907 = new byte[i2];
        this.f53908 = new int[i2];
        this.f53911 = i - 6;
    }
}
