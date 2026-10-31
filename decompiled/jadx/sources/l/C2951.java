package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: HC85 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2951 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f9367;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9368;

    public C2951(OutputStream outputStream) {
        super(outputStream);
        this.f9367 = new byte[8192];
    }

    public C2951(byte[] bArr, OutputStream outputStream) {
        super(outputStream);
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Buffer size == 0");
        }
        this.f9367 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8984() throws IOException {
        int i = this.f9368;
        if (i > 0) {
            ((FilterOutputStream) this).out.write(this.f9367, 0, i);
            this.f9368 = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.f9368;
        byte[] bArr = this.f9367;
        if (i2 >= bArr.length) {
            m8984();
        }
        int i3 = this.f9368;
        this.f9368 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f9367;
        if (i2 >= bArr2.length) {
            m8984();
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } else {
            if (i2 > bArr2.length - this.f9368) {
                m8984();
            }
            System.arraycopy(bArr, i, bArr2, this.f9368, i2);
            this.f9368 += i2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m8984();
        ((FilterOutputStream) this).out.flush();
    }
}
