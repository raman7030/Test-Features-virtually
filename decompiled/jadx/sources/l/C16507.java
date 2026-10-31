package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S7S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16507 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10864 f50726;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f50728;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f50729;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f50732;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C2397 f50734 = new C2397();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50730 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean[] f50731 = new boolean[256];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f50727 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f50733 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38874(int i, int i2) {
        int i3 = this.f50730;
        boolean[] zArr = this.f50731;
        zArr[i] = true;
        this.f50734.m7773(i, i2);
        byte b = (byte) i;
        byte[] bArr = this.f50728;
        if (i2 == 1) {
            bArr[i3] = b;
            this.f50730 = i3 + 1;
            return;
        }
        if (i2 == 2) {
            bArr[i3] = b;
            bArr[i3 + 1] = b;
            this.f50730 = i3 + 2;
        } else {
            if (i2 == 3) {
                bArr[i3] = b;
                bArr[i3 + 1] = b;
                bArr[i3 + 2] = b;
                this.f50730 = i3 + 3;
                return;
            }
            int i4 = i2 - 4;
            zArr[i4] = true;
            bArr[i3] = b;
            bArr[i3 + 1] = b;
            bArr[i3 + 2] = b;
            bArr[i3 + 3] = b;
            bArr[i3 + 4] = (byte) i4;
            this.f50730 = i3 + 5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38876(int i) {
        if (this.f50730 > this.f50732) {
            return false;
        }
        int i2 = this.f50727;
        int i3 = this.f50733;
        if (i3 == 0) {
            this.f50727 = i;
            this.f50733 = 1;
        } else if (i2 != i) {
            m38874(i2 & 255, i3);
            this.f50727 = i;
            this.f50733 = 1;
        } else if (i3 == 254) {
            m38874(i2 & 255, 255);
            this.f50733 = 0;
        } else {
            this.f50733 = i3 + 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38875() throws IOException {
        boolean[] zArr;
        int i = this.f50733;
        if (i > 0) {
            m38874(this.f50727 & 255, i);
        }
        int i2 = this.f50730;
        byte[] bArr = this.f50728;
        bArr[i2] = bArr[0];
        int[] iArr = this.f50729;
        int iM34381 = new C14390(bArr, i2, iArr).m34381();
        C10864 c10864 = this.f50726;
        c10864.m27166(24, 3227993);
        c10864.m27166(24, 2511705);
        int iM7771 = this.f50734.m7771();
        c10864.m27166(16, (iM7771 >>> 16) & 65535);
        c10864.m27166(16, iM7771 & 65535);
        c10864.m27167(false);
        c10864.m27166(24, iM34381);
        boolean[] zArr2 = new boolean[16];
        int i3 = 0;
        while (true) {
            zArr = this.f50731;
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
            c10864.m27167(zArr2[i6]);
        }
        for (int i7 = 0; i7 < 16; i7++) {
            if (zArr2[i7]) {
                int i8 = i7 * 16;
                int i9 = 0;
                while (i9 < 16) {
                    c10864.m27167(zArr[i8]);
                    i9++;
                    i8++;
                }
            }
        }
        C8747 c8747 = new C8747(iArr, this.f50730, zArr);
        c8747.m22623();
        new C20742(this.f50726, c8747.m22625(), c8747.m22627(), c8747.m22624(), c8747.m22626()).m47374();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m38878() {
        return this.f50730 == 0 && this.f50733 == 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m38877() {
        return this.f50734.m7771();
    }

    public C16507(C10864 c10864, int i) {
        this.f50726 = c10864;
        int i2 = i + 1;
        this.f50728 = new byte[i2];
        this.f50729 = new int[i2];
        this.f50732 = i - 6;
    }
}
