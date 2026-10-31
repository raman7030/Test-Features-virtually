package l;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.᩹ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N8CI */
/* JADX INFO: loaded from: classes.dex */
public final class C22272 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final short[] f72253;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f72254;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f72255 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20156 f72256;

    public C22272(C20156 c20156) {
        this.f72256 = c20156;
        int[] iArr = new int[32768];
        this.f72254 = iArr;
        Arrays.fill(iArr, -1);
        this.f72253 = new short[65536];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49998(int i, byte[] bArr) {
        while (true) {
            int i2 = this.f72255;
            if (i2 >= i) {
                return;
            }
            int iM17576 = (C6322.m17576(i2, bArr) * (-1640531535)) >>> 17;
            int[] iArr = this.f72254;
            int i3 = i2 - iArr[iM17576];
            if (i3 >= 65536) {
                i3 = 65535;
            }
            this.f72253[i2 & 65535] = (short) i3;
            iArr[iM17576] = i2;
            this.f72255++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50000(byte[] bArr, int i, int i2, C12394 c12394) {
        int i3;
        int iM31757;
        int iM31758;
        c12394.f37326 = i;
        c12394.f37324 = 0;
        m49998(i, bArr);
        int iM17576 = (C6322.m17576(i, bArr) * (-1640531535)) >>> 17;
        int[] iArr = this.f72254;
        int i4 = iArr[iM17576];
        int i5 = i - 4;
        short[] sArr = this.f72253;
        if (i4 < i5 || i4 > i || i4 < 0) {
            i3 = 0;
            iM31757 = 0;
        } else {
            if (C13099.m31761(i4, i, bArr)) {
                i3 = i - i4;
                iM31757 = C13099.m31757(i4 + 4, bArr, i + 4, i2) + 4;
                c12394.f37324 = iM31757;
                c12394.f37325 = i4;
            } else {
                i3 = 0;
                iM31757 = 0;
            }
            i4 -= sArr[i4 & 65535] & HPKE.aead_EXPORT_ONLY;
        }
        for (int i6 = 0; i6 < this.f72256.f65268 && i4 >= Math.max(0, i - 65535) && i4 <= i; i6++) {
            if (C13099.m31761(i4, i, bArr) && (iM31758 = C13099.m31757(i4 + 4, bArr, i + 4, i2) + 4) > c12394.f37324) {
                c12394.f37325 = i4;
                c12394.f37324 = iM31758;
            }
            i4 -= sArr[i4 & 65535] & HPKE.aead_EXPORT_ONLY;
        }
        if (iM31757 != 0) {
            int i7 = (iM31757 + i) - 3;
            while (i < i7 - i3) {
                sArr[i & 65535] = (short) i3;
                i++;
            }
            do {
                sArr[i & 65535] = (short) i3;
                iArr[(C6322.m17576(i, bArr) * (-1640531535)) >>> 17] = i;
                i++;
            } while (i < i7);
            this.f72255 = i7;
        }
        return c12394.f37324 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m49999(byte[] bArr, int i, int i2, int i3, int i4, C12394 c12394) {
        c12394.f37324 = i4;
        m49998(i, bArr);
        int i5 = this.f72254[(C6322.m17576(i, bArr) * (-1640531535)) >>> 17];
        for (int i6 = 0; i6 < this.f72256.f65268 && i5 >= Math.max(0, i - 65535) && i5 <= i; i6++) {
            if (C13099.m31761(i5, i, bArr)) {
                int iM31757 = C13099.m31757(i5 + 4, bArr, i + 4, i3) + 4;
                int iM31763 = C13099.m31763(i5, bArr, i, i2);
                int i7 = iM31757 + iM31763;
                if (i7 > c12394.f37324) {
                    c12394.f37324 = i7;
                    c12394.f37325 = i5 - iM31763;
                    c12394.f37326 = i - iM31763;
                }
            }
            i5 -= 65535 & this.f72253[i5 & 65535];
        }
        return c12394.f37324 > i4;
    }
}
