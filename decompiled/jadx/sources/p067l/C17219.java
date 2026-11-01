package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܺ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes4.dex */
public final class C17219 extends OutputStream {

    /* JADX INFO: renamed from: ֫֫ */
    public int f51246;

    /* JADX INFO: renamed from: ۗ */
    public int f51247;

    /* JADX INFO: renamed from: ۛ */
    public int f51249;

    /* JADX INFO: renamed from: ۟ */
    public final byte[] f51250;

    /* JADX INFO: renamed from: ۤ */
    public long f51251;

    /* JADX INFO: renamed from: ۨ */
    public final byte[] f51252;

    /* JADX INFO: renamed from: ۫ */
    public int f51253;

    /* JADX INFO: renamed from: ܰ */
    public long f51255;

    /* JADX INFO: renamed from: ᩶ */
    public final int f51256;

    /* JADX INFO: renamed from: ᩸ */
    public final C4221 f51257;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC18588 f51258;

    /* JADX INFO: renamed from: ᩺ */
    public final int[] f51259;

    /* JADX INFO: renamed from: ۬ */
    public final int[] f51254 = new int[1024];

    /* JADX INFO: renamed from: ۙ */
    public int f51248 = -1;

    public C17219(C4221 c4221, int i, byte[] bArr, byte[] bArr2, InterfaceC18588 interfaceC18588) {
        this.f51257 = c4221;
        this.f51256 = i;
        this.f51252 = bArr;
        this.f51250 = bArr2;
        this.f51258 = interfaceC18588;
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
        this.f51259 = iArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        while (i < i3) {
            if ((this.f51249 & 4095) == 0 && this.f51258.mo3924()) {
                throw new C5821();
            }
            m38993(bArr[i]);
            this.f51249++;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38993(byte b) throws IOException {
        int i;
        byte[] bArr;
        while (true) {
            i = this.f51253;
            bArr = this.f51252;
            if (i <= 0 || bArr[i] == b) {
                break;
            }
            this.f51253 = this.f51259[i - 1];
        }
        if (bArr[i] != b) {
            return;
        }
        int i2 = i + 1;
        this.f51253 = i2;
        if (i2 != bArr.length) {
            return;
        }
        int length = (this.f51249 - bArr.length) + 1;
        long j = this.f51251;
        long j2 = ((long) length) + j;
        long length2 = ((long) bArr.length) + j2;
        long j3 = ((long) this.f51256) + j;
        if (j2 < 0 || length2 > j3) {
            throw new IOException("Search result exceeds transaction length");
        }
        byte[] bArr2 = this.f51250;
        long length3 = (j3 + ((long) bArr2.length)) - ((long) bArr.length);
        if (length3 > 2147483647L) {
            throw new C9174();
        }
        int i3 = length >>> 16;
        int i4 = this.f51247;
        int[] iArr = this.f51254;
        C4221 c4221 = this.f51257;
        if (i4 != 0 && i3 != this.f51248 && i4 != 0) {
            c4221.m8576(i4, iArr);
            this.f51247 = 0;
        }
        this.f51248 = i3;
        int i5 = this.f51247;
        int i6 = i5 + 1;
        this.f51247 = i6;
        iArr[i5] = length;
        if (i6 == iArr.length && i6 != 0) {
            c4221.m8576(i6, iArr);
            this.f51247 = 0;
        }
        this.f51255++;
        this.f51251 = (((long) bArr2.length) - ((long) bArr.length)) + this.f51251;
        long length4 = j2 + ((long) bArr2.length);
        if (length4 < 0 || length4 > length3) {
            throw new IOException("Replacement offset exceeds transaction length");
        }
        this.f51246 = (int) length4;
        this.f51253 = 0;
    }

    public final C10515 finish() {
        int i = this.f51247;
        C4221 c4221 = this.f51257;
        if (i != 0) {
            c4221.m8576(i, this.f51254);
            this.f51247 = 0;
        }
        c4221.m8577(this.f51258);
        return new C10515(this.f51255, this.f51246, false);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.f51258.mo3924()) {
            m38993((byte) i);
            this.f51249++;
            return;
        }
        throw new C5821();
    }
}
