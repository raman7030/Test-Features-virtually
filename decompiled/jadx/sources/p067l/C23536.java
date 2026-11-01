package p067l;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.᩹ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N8CI */
/* JADX INFO: loaded from: classes.dex */
public final class C23536 {

    /* JADX INFO: renamed from: ֫ */
    public final short[] f74977;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f74978;

    /* JADX INFO: renamed from: ܽ */
    public int f74979 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C21525 f74980;

    public C23536(C21525 c21525) {
        this.f74980 = c21525;
        int[] iArr = new int[32768];
        this.f74978 = iArr;
        Arrays.fill(iArr, -1);
        this.f74977 = new short[65536];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52326(int i, byte[] bArr) {
        while (true) {
            int i2 = this.f74979;
            if (i2 >= i) {
                return;
            }
            int iM19516 = (C8377.m19516(i2, bArr) * (-1640531535)) >>> 17;
            int[] iArr = this.f74978;
            int i3 = i2 - iArr[iM19516];
            if (i3 >= 65536) {
                i3 = 65535;
            }
            this.f74977[i2 & 65535] = (short) i3;
            iArr[iM19516] = i2;
            this.f74979++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m52328(byte[] bArr, int i, int i2, C14148 c14148) {
        int i3;
        int iM33847;
        int iM33848;
        c14148.f40343 = i;
        c14148.f40341 = 0;
        m52326(i, bArr);
        int iM19516 = (C8377.m19516(i, bArr) * (-1640531535)) >>> 17;
        int[] iArr = this.f74978;
        int i4 = iArr[iM19516];
        int i5 = i - 4;
        short[] sArr = this.f74977;
        if (i4 < i5 || i4 > i || i4 < 0) {
            i3 = 0;
            iM33847 = 0;
        } else {
            if (C14818.m33851(i4, i, bArr)) {
                i3 = i - i4;
                iM33847 = C14818.m33847(i4 + 4, bArr, i + 4, i2) + 4;
                c14148.f40341 = iM33847;
                c14148.f40342 = i4;
            } else {
                i3 = 0;
                iM33847 = 0;
            }
            i4 -= sArr[i4 & 65535] & HPKE.aead_EXPORT_ONLY;
        }
        for (int i6 = 0; i6 < this.f74980.f67911 && i4 >= Math.max(0, i - 65535) && i4 <= i; i6++) {
            if (C14818.m33851(i4, i, bArr) && (iM33848 = C14818.m33847(i4 + 4, bArr, i + 4, i2) + 4) > c14148.f40341) {
                c14148.f40342 = i4;
                c14148.f40341 = iM33848;
            }
            i4 -= sArr[i4 & 65535] & HPKE.aead_EXPORT_ONLY;
        }
        if (iM33847 != 0) {
            int i7 = (iM33847 + i) - 3;
            while (i < i7 - i3) {
                sArr[i & 65535] = (short) i3;
                i++;
            }
            do {
                sArr[i & 65535] = (short) i3;
                iArr[(C8377.m19516(i, bArr) * (-1640531535)) >>> 17] = i;
                i++;
            } while (i < i7);
            this.f74979 = i7;
        }
        return c14148.f40341 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m52327(byte[] bArr, int i, int i2, int i3, int i4, C14148 c14148) {
        c14148.f40341 = i4;
        m52326(i, bArr);
        int i5 = this.f74978[(C8377.m19516(i, bArr) * (-1640531535)) >>> 17];
        for (int i6 = 0; i6 < this.f74980.f67911 && i5 >= Math.max(0, i - 65535) && i5 <= i; i6++) {
            if (C14818.m33851(i5, i, bArr)) {
                int iM33847 = C14818.m33847(i5 + 4, bArr, i + 4, i3) + 4;
                int iM33853 = C14818.m33853(i5, bArr, i, i2);
                int i7 = iM33847 + iM33853;
                if (i7 > c14148.f40341) {
                    c14148.f40341 = i7;
                    c14148.f40342 = i5 - iM33853;
                    c14148.f40343 = i - iM33853;
                }
            }
            i5 -= 65535 & this.f74977[i5 & 65535];
        }
        return c14148.f40341 > i4;
    }
}
