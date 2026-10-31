package l;

import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ᩳ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75U0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18276 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f56818 = new byte[64];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f56819;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42609(int i) {
        int i2 = this.f56819;
        int i3 = i2 + 1;
        if (i3 > this.f56818.length) {
            m42608(1);
        }
        this.f56818[i2] = (byte) i;
        this.f56819 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42610(int i, int i2) {
        int i3 = this.f56819;
        int i4 = i3 + 2;
        if (i4 > this.f56818.length) {
            m42608(2);
        }
        byte[] bArr = this.f56818;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) i2;
        this.f56819 = i4;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m42618(int i) {
        int i2 = this.f56819;
        int i3 = i2 + 2;
        if (i3 > this.f56818.length) {
            m42608(2);
        }
        byte[] bArr = this.f56818;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        this.f56819 = i3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m42619(int i, int i2) {
        int i3 = this.f56819;
        int i4 = i3 + 3;
        if (i4 > this.f56818.length) {
            m42608(3);
        }
        byte[] bArr = this.f56818;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) i2;
        this.f56819 = i4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42617(int i, int i2) {
        int i3 = this.f56819;
        int i4 = i3 + 4;
        if (i4 > this.f56818.length) {
            m42608(4);
        }
        byte[] bArr = this.f56818;
        bArr[i3] = (byte) 15;
        bArr[i3 + 1] = (byte) i;
        bArr[i3 + 2] = (byte) (i2 >>> 8);
        bArr[i3 + 3] = (byte) i2;
        this.f56819 = i4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42616(int i) {
        int i2 = this.f56819;
        int i3 = i2 + 4;
        if (i3 > this.f56818.length) {
            m42608(4);
        }
        byte[] bArr = this.f56818;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        this.f56819 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42611(int i, int i2, int i3) {
        int i4 = this.f56819;
        int i5 = i4 + 5;
        if (i5 > this.f56818.length) {
            m42608(5);
        }
        byte[] bArr = this.f56818;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) (i2 >>> 8);
        bArr[i4 + 2] = (byte) i2;
        bArr[i4 + 3] = (byte) (i3 >>> 8);
        bArr[i4 + 4] = (byte) i3;
        this.f56819 = i5;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42614(long j) {
        int i = this.f56819;
        int i2 = i + 8;
        if (i2 > this.f56818.length) {
            m42608(8);
        }
        byte[] bArr = this.f56818;
        int i3 = (int) (j >>> 32);
        bArr[i] = (byte) (i3 >>> 24);
        bArr[i + 1] = (byte) (i3 >>> 16);
        bArr[i + 2] = (byte) (i3 >>> 8);
        bArr[i + 3] = (byte) i3;
        int i4 = (int) j;
        bArr[i + 4] = (byte) (i4 >>> 24);
        bArr[i + 5] = (byte) (i4 >>> 16);
        bArr[i + 6] = (byte) (i4 >>> 8);
        bArr[i + 7] = (byte) i4;
        this.f56819 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42615(String str) {
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException("UTF8 string too large");
        }
        int i = this.f56819;
        int i2 = i + 2;
        if (i2 + length > this.f56818.length) {
            m42608(length + 2);
        }
        byte[] bArr = this.f56818;
        bArr[i] = (byte) (length >>> 8);
        bArr[i + 1] = (byte) length;
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= 1 && cCharAt <= 127) {
                bArr[i2] = (byte) cCharAt;
                i3++;
                i2++;
            } else {
                this.f56819 = i2;
                m42612(i3, 65535, str);
                return;
            }
        }
        this.f56819 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42612(int i, int i2, String str) {
        int length = str.length();
        int i3 = i;
        int i4 = i3;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 1 || cCharAt > 127) {
                i4 = cCharAt <= 2047 ? i4 + 2 : i4 + 3;
            } else {
                i4++;
            }
            i3++;
        }
        if (i4 > i2) {
            throw new IllegalArgumentException("UTF8 string too large");
        }
        int i5 = this.f56819;
        int i6 = i5 - i;
        int i7 = i6 - 2;
        if (i7 >= 0) {
            byte[] bArr = this.f56818;
            bArr[i7] = (byte) (i4 >>> 8);
            bArr[i6 - 1] = (byte) i4;
        }
        if ((i5 + i4) - i > this.f56818.length) {
            m42608(i4 - i);
        }
        int i8 = this.f56819;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                this.f56818[i8] = (byte) cCharAt2;
                i8++;
            } else if (cCharAt2 <= 2047) {
                byte[] bArr2 = this.f56818;
                int i9 = i8 + 1;
                bArr2[i8] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                i8 += 2;
                bArr2[i9] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                byte[] bArr3 = this.f56818;
                bArr3[i8] = (byte) (((cCharAt2 >> '\f') & 15) | BERTags.FLAGS);
                int i10 = i8 + 2;
                bArr3[i8 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i8 += 3;
                bArr3[i10] = (byte) ((cCharAt2 & '?') | 128);
            }
            i++;
        }
        this.f56819 = i8;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42613(int i, int i2, byte[] bArr) {
        if (this.f56819 + i2 > this.f56818.length) {
            m42608(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.f56818, this.f56819, i2);
        }
        this.f56819 += i2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m42608(int i) {
        int i2 = this.f56819;
        byte[] bArr = this.f56818;
        if (i2 > bArr.length) {
            throw new AssertionError("Internal error");
        }
        int length = bArr.length * 2;
        int i3 = i + i2;
        if (length <= i3) {
            length = i3;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f56818 = bArr2;
    }
}
