package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V2FP */
/* JADX INFO: loaded from: classes3.dex */
public class C11090 extends FilterOutputStream {
    /* JADX INFO: renamed from: ֫ */
    public void mo19713(int i) {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = ((FilterOutputStream) this).out;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        byte[] bArr2 = C22194.f71991;
        mo19713(bArr == null ? 0 : bArr.length);
        ((FilterOutputStream) this).out.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        mo19713(i2);
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        mo19713(1);
        ((FilterOutputStream) this).out.write(i);
    }
}
