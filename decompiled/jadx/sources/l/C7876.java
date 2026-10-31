package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: renamed from: l.۠ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N399 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7876 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Socket f24418;

    public C7876(Socket socket, OutputStream outputStream) {
        super(outputStream);
        this.f24418 = socket;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f24418.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
