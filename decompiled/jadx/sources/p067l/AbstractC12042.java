package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P2G3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12042 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final C19768 f33544;

    /* JADX INFO: renamed from: ᩹ */
    public final C7775 f33545;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public AbstractC12042(InputStream inputStream, C6677 c6677) {
        super(inputStream);
        this.f33545 = new C7775();
        this.f33544 = InterfaceC3324.f6497;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo11547(int i) {
        this.f33544.getClass();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                m27558(e);
                throw null;
            } catch (Exception e2) {
                m27558(new IOException(e2));
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27558(IOException iOException) throws IOException {
        this.f33545.getClass();
        throw iOException;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        try {
            int i = ((FilterInputStream) this).in.read();
            mo11547(i != -1 ? 1 : -1);
            return i;
        } catch (IOException e) {
            m27558(e);
            throw null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
            mo11547(i3);
            return i3;
        } catch (IOException e) {
            m27558(e);
            throw null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e) {
            m27558(e);
            throw null;
        }
    }
}
