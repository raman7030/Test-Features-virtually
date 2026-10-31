package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15121 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21473 f46236;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f46237;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f46238;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C15121(C21473 c21473, int i) {
        this.f46236 = c21473;
        this.f46238 = i;
        this.f46237 = i;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f46238;
        C21473 c21473 = this.f46236;
        if (i >= c21473.f69096) {
            return -1;
        }
        byte[] bArr = c21473.f69095;
        int i2 = this.f46238;
        this.f46238 = i2 + 1;
        return bArr[i2];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int length = bArr.length;
        C21473 c21473 = this.f46236;
        int iMin = Math.min(length, c21473.f69096 - this.f46238);
        if (iMin <= 0) {
            return this.f46238 >= c21473.f69096 ? -1 : 0;
        }
        System.arraycopy(c21473.f69095, this.f46238, bArr, 0, iMin);
        this.f46238 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C21473 c21473 = this.f46236;
        int iMin = Math.min(i2, c21473.f69096 - this.f46238);
        if (iMin <= 0) {
            return this.f46238 >= c21473.f69096 ? -1 : 0;
        }
        System.arraycopy(c21473.f69095, this.f46238, bArr, i, iMin);
        this.f46238 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int iMax = (int) Math.max(0L, Math.min(j, this.f46236.f69096 - this.f46238));
        this.f46238 += iMax;
        return iMax;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.max(0, this.f46236.f69096 - this.f46238);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f46237 = this.f46238;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f46238 = this.f46237;
    }
}
