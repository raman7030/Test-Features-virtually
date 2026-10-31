package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܺ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes4.dex */
public final class C15626 extends OutputStream {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f48107;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f48108;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f48110;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f48111;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f48112;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f48113;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f48114;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f48116;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f48117;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1949 f48118;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f48119;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int[] f48120;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] f48115 = new int[1024];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48109 = -1;

    public C15626(C1949 c1949, int i, byte[] bArr, byte[] bArr2, InterfaceC17066 interfaceC17066) {
        this.f48118 = c1949;
        this.f48117 = i;
        this.f48113 = bArr;
        this.f48111 = bArr2;
        this.f48119 = interfaceC17066;
        int[] iArr = new int[bArr.length];
        int i2 = 0;
        for (int i3 = 1; i3 < bArr.length; i3++) {
            while (i2 > 0 && bArr[i3] != bArr[i2]) {
                i2 = iArr[i2 - 1];
            }
            if (bArr[i3] == bArr[i2]) {
                i2++;
            }
            iArr[i3] = i2;
        }
        this.f48120 = iArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        while (i < i3) {
            if ((this.f48110 & 4095) == 0 && this.f48119.mo1526()) {
                throw new C3633();
            }
            m36827(bArr[i]);
            this.f48110++;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36827(byte b) throws IOException {
        int i;
        byte[] bArr;
        while (true) {
            i = this.f48114;
            bArr = this.f48113;
            if (i <= 0 || bArr[i] == b) {
                break;
            }
            this.f48114 = this.f48120[i - 1];
        }
        if (bArr[i] != b) {
            return;
        }
        int i2 = i + 1;
        this.f48114 = i2;
        if (i2 != bArr.length) {
            return;
        }
        int length = (this.f48110 - bArr.length) + 1;
        long j = this.f48112;
        long j2 = ((long) length) + j;
        long length2 = ((long) bArr.length) + j2;
        long j3 = ((long) this.f48117) + j;
        if (j2 < 0 || length2 > j3) {
            throw new IOException("Search result exceeds transaction length");
        }
        byte[] bArr2 = this.f48111;
        long length3 = (j3 + ((long) bArr2.length)) - ((long) bArr.length);
        if (length3 > 2147483647L) {
            throw new C7161();
        }
        int i3 = length >>> 16;
        int i4 = this.f48108;
        int[] iArr = this.f48115;
        C1949 c1949 = this.f48118;
        if (i4 != 0 && i3 != this.f48109 && i4 != 0) {
            c1949.m6419(i4, iArr);
            this.f48108 = 0;
        }
        this.f48109 = i3;
        int i5 = this.f48108;
        int i6 = i5 + 1;
        this.f48108 = i6;
        iArr[i5] = length;
        if (i6 == iArr.length && i6 != 0) {
            c1949.m6419(i6, iArr);
            this.f48108 = 0;
        }
        this.f48116++;
        this.f48112 = (((long) bArr2.length) - ((long) bArr.length)) + this.f48112;
        long length4 = j2 + ((long) bArr2.length);
        if (length4 < 0 || length4 > length3) {
            throw new IOException("Replacement offset exceeds transaction length");
        }
        this.f48107 = (int) length4;
        this.f48114 = 0;
    }

    public final C8572 finish() {
        int i = this.f48108;
        C1949 c1949 = this.f48118;
        if (i != 0) {
            c1949.m6419(i, this.f48115);
            this.f48108 = 0;
        }
        c1949.m6420(this.f48119);
        return new C8572(this.f48116, this.f48107, false);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.f48119.mo1526()) {
            m36827((byte) i);
            this.f48110++;
            return;
        }
        throw new C3633();
    }
}
