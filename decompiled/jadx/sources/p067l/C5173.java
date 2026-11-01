package p067l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: HC85 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5173 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f12167;

    /* JADX INFO: renamed from: ᩹ */
    public int f12168;

    public C5173(OutputStream outputStream) {
        super(outputStream);
        this.f12167 = new byte[8192];
    }

    public C5173(byte[] bArr, OutputStream outputStream) {
        super(outputStream);
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Buffer size == 0");
        }
        this.f12167 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11052() throws IOException {
        int i = this.f12168;
        if (i > 0) {
            ((FilterOutputStream) this).out.write(this.f12167, 0, i);
            this.f12168 = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.f12168;
        byte[] bArr = this.f12167;
        if (i2 >= bArr.length) {
            m11052();
        }
        int i3 = this.f12168;
        this.f12168 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f12167;
        if (i2 >= bArr2.length) {
            m11052();
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } else {
            if (i2 > bArr2.length - this.f12168) {
                m11052();
            }
            System.arraycopy(bArr, i, bArr2, this.f12168, i2);
            this.f12168 += i2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m11052();
        ((FilterOutputStream) this).out.flush();
    }
}
