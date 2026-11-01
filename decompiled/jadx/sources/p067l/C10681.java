package p067l;

/* JADX INFO: renamed from: l.ۡ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O7S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10681 {

    /* JADX INFO: renamed from: ֫ */
    public int f29583;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f29584;

    /* JADX INFO: renamed from: ܳ */
    public int f29585;

    /* JADX INFO: renamed from: ܽ */
    public int f29586;

    /* JADX INFO: renamed from: ܿ */
    public final char[] f29587;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean[] f29588;

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f29589 = new int[258];

    /* JADX INFO: renamed from: ֫ */
    public final void m24592() {
        char[] cArr;
        int[] iArr;
        int i;
        int i2;
        byte[] bArr = new byte[256];
        C5987 c5987 = new C5987();
        char c = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            if (this.f29588[i4]) {
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
            int i11 = this.f29586;
            cArr = this.f29587;
            iArr = this.f29589;
            if (i6 >= i11) {
                break;
            }
            int iM13427 = c5987.m13427(bArr[this.f29584[i6] & 255]);
            if (iM13427 == 0) {
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
                int i13 = iM13427 + 1;
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
        this.f29585 = i8 + 1;
        this.f29583 = i3 + 2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final char[] m24594() {
        return this.f29587;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m24596() {
        return this.f29585;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m24593() {
        return this.f29583;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int[] m24595() {
        return this.f29589;
    }

    public C10681(int[] iArr, int i, boolean[] zArr) {
        this.f29584 = iArr;
        this.f29586 = i;
        this.f29588 = zArr;
        this.f29587 = new char[i + 1];
    }
}
