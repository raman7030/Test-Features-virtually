package l;

/* JADX INFO: renamed from: l.ۡ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O7S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8747 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26657;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f26658;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f26659;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26660;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final char[] f26661;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f26662;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f26663 = new int[258];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22623() {
        char[] cArr;
        int[] iArr;
        int i;
        int i2;
        byte[] bArr = new byte[256];
        C3808 c3808 = new C3808();
        char c = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            if (this.f26662[i4]) {
                bArr[i4] = (byte) i3;
                i3++;
            }
        }
        int i5 = i3 + 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = this.f26660;
            cArr = this.f26661;
            iArr = this.f26663;
            if (i6 >= i11) {
                break;
            }
            int iM11491 = c3808.m11491(bArr[this.f26658[i6] & 255]);
            if (iM11491 == 0) {
                i7++;
            } else {
                if (i7 > 0) {
                    int i12 = i7 - 1;
                    while (true) {
                        if ((i12 & 1) == 0) {
                            i2 = i8 + 1;
                            cArr[i8] = c;
                            i9++;
                        } else {
                            i2 = i8 + 1;
                            cArr[i8] = 1;
                            i10++;
                        }
                        i8 = i2;
                        if (i12 <= 1) {
                            break;
                        } else {
                            i12 = (i12 - 2) >>> 1;
                        }
                    }
                    i7 = 0;
                }
                int i13 = iM11491 + 1;
                cArr[i8] = (char) i13;
                iArr[i13] = iArr[i13] + 1;
                i8++;
            }
            i6++;
            c = 0;
        }
        if (i7 > 0) {
            int i14 = i7 - 1;
            while (true) {
                if ((i14 & 1) == 0) {
                    i = i8 + 1;
                    cArr[i8] = 0;
                    i9++;
                } else {
                    i = i8 + 1;
                    cArr[i8] = 1;
                    i10++;
                }
                i8 = i;
                if (i14 <= 1) {
                    break;
                } else {
                    i14 = (i14 - 2) >>> 1;
                }
            }
        }
        cArr[i8] = (char) i5;
        iArr[i5] = iArr[i5] + 1;
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        this.f26659 = i8 + 1;
        this.f26657 = i3 + 2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char[] m22625() {
        return this.f26661;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m22627() {
        return this.f26659;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m22624() {
        return this.f26657;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] m22626() {
        return this.f26663;
    }

    public C8747(int[] iArr, int i, boolean[] zArr) {
        this.f26658 = iArr;
        this.f26660 = i;
        this.f26662 = zArr;
        this.f26661 = new char[i + 1];
    }
}
