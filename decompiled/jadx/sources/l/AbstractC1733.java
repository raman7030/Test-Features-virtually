package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֫ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 58FP */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1733 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ByteBuffer f5980;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f5981;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f5982;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo5783(long j, ByteBuffer byteBuffer);

    public AbstractC1733(long j, long j2) {
        long j3 = j + j2;
        this.f5981 = j3;
        if (j3 >= j) {
            this.f5982 = j;
        } else {
            StringBuilder sbM31106 = C12803.m31106("Invalid length of stream at offset=", ", length=", j);
            sbM31106.append(j2);
            throw new IllegalArgumentException(sbM31106.toString());
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        if (this.f5982 >= this.f5981) {
            return -1;
        }
        ByteBuffer byteBuffer = this.f5980;
        if (byteBuffer == null) {
            this.f5980 = ByteBuffer.allocate(1);
        } else {
            byteBuffer.rewind();
        }
        if (mo5783(this.f5982, this.f5980) < 1) {
            return -1;
        }
        this.f5982++;
        return this.f5980.get() & 255;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        long j = this.f5982;
        long j2 = this.f5981;
        if (j >= j2) {
            return -1;
        }
        long jMin = Math.min(i2, j2 - j);
        if (jMin <= 0) {
            return 0;
        }
        if (i < 0 || i > bArr.length || jMin > bArr.length - i) {
            throw new IndexOutOfBoundsException("offset or len are out of bounds");
        }
        int iMo5783 = mo5783(this.f5982, ByteBuffer.wrap(bArr, i, (int) jMin));
        if (iMo5783 > 0) {
            this.f5982 += (long) iMo5783;
        }
        return iMo5783;
    }
}
