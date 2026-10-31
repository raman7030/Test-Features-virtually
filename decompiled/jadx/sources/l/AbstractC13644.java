package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 61SM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13644 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f40691;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f40695;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f40696;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f40698;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f40699;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f40701;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f40694 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f40700 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f40697 = false;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f40693 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f40692 = 0;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo16472(C4265 c4265);

    /* JADX INFO: renamed from: ۧ */
    public abstract C2065 mo16473();

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo16474(int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32779(int i, int i2, int[] iArr) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            if (i4 <= i2) {
                iArr[i3] = 0;
            } else {
                iArr[i3] = i4 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC13644 m32778(int i, int i2, int i3, int i4, int i5, int i6, C4265 c4265) {
        if (i5 == 4) {
            return new C5884(i, i2, i3, i4, i6, c4265);
        }
        if (i5 == 20) {
            return new C10118(i, i2, i3, i4, i6, c4265);
        }
        throw new IllegalArgumentException();
    }

    public AbstractC13644(int i, int i2, int i3, int i4, C4265 c4265) {
        int i5 = i2 + i;
        int i6 = i3 + 273;
        int iMin = i5 + i6 + Math.min((i / 2) + 262144, 536870912);
        this.f40695 = iMin;
        this.f40691 = c4265.mo4956(iMin);
        this.f40698 = i5;
        this.f40699 = i6;
        this.f40696 = 273;
        this.f40701 = i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32785(int i, int i2, byte[] bArr) {
        int i3 = this.f40694;
        int i4 = this.f40695;
        int i5 = this.f40699;
        int i6 = i4 - i5;
        byte[] bArr2 = this.f40691;
        if (i3 >= i6) {
            int i7 = ((i3 + 1) - this.f40698) & (-16);
            System.arraycopy(bArr2, i7, bArr2, 0, this.f40693 - i7);
            this.f40694 -= i7;
            this.f40700 -= i7;
            this.f40693 -= i7;
        }
        int i8 = this.f40693;
        int i9 = i4 - i8;
        if (i2 > i9) {
            i2 = i9;
        }
        System.arraycopy(bArr, i, bArr2, i8, i2);
        int i10 = this.f40693 + i2;
        this.f40693 = i10;
        if (i10 >= i5) {
            this.f40700 = i10 - i5;
        }
        m32780();
        return i2;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m32780() {
        int i;
        int i2 = this.f40692;
        if (i2 <= 0 || (i = this.f40694) >= this.f40700) {
            return;
        }
        this.f40694 = i - i2;
        this.f40692 = 0;
        mo16474(i2);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m32793() {
        return this.f40694 != -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32789() {
        this.f40700 = this.f40693 - 1;
        m32780();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m32792() {
        this.f40700 = this.f40693 - 1;
        this.f40697 = true;
        m32780();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m32788(int i) {
        return this.f40694 - i < this.f40700;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32786(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f40691, (this.f40694 + 1) - i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32781() {
        return this.f40693 - this.f40694;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m32790() {
        return this.f40694;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32782(int i) {
        return this.f40691[this.f40694 - i] & 255;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32783(int i, int i2) {
        return this.f40691[(this.f40694 + i) - i2] & 255;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m32787(int i, int i2) {
        return C7295.m19544(this.f40691, this.f40694, i + 1, 0, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32784(int i, int i2, int i3) {
        return C7295.m19544(this.f40691, this.f40694 + i, i2 + 1, 0, i3);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m32791(int i) {
        int i2 = this.f40694 + 1;
        this.f40694 = i2;
        int i3 = this.f40693 - i2;
        if (i3 >= i || (i3 >= 4 && this.f40697)) {
            return i3;
        }
        this.f40692++;
        return 0;
    }
}
