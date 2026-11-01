package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֫ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 58FP */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4015 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public ByteBuffer f8757;

    /* JADX INFO: renamed from: ᩸ */
    public final long f8758;

    /* JADX INFO: renamed from: ᩹ */
    public long f8759;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo7993(long j, ByteBuffer byteBuffer);

    public AbstractC4015(long j, long j2) {
        long j3 = j + j2;
        this.f8758 = j3;
        if (j3 >= j) {
            this.f8759 = j;
        } else {
            StringBuilder sbM33191 = C14536.m33191("Invalid length of stream at offset=", ", length=", j);
            sbM33191.append(j2);
            throw new IllegalArgumentException(sbM33191.toString());
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        if (this.f8759 >= this.f8758) {
            return -1;
        }
        ByteBuffer byteBuffer = this.f8757;
        if (byteBuffer == null) {
            this.f8757 = ByteBuffer.allocate(1);
        } else {
            byteBuffer.rewind();
        }
        if (mo7993(this.f8759, this.f8757) < 1) {
            return -1;
        }
        this.f8759++;
        return this.f8757.get() & 255;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        long j = this.f8759;
        long j2 = this.f8758;
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
        int iMo7993 = mo7993(this.f8759, ByteBuffer.wrap(bArr, i, (int) jMin));
        if (iMo7993 > 0) {
            this.f8759 += (long) iMo7993;
        }
        return iMo7993;
    }
}
