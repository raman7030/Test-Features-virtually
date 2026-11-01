package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: renamed from: l.֨ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 131S */
/* JADX INFO: loaded from: classes2.dex */
public final class C3147 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final Socket f5765;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C3147(Socket socket, InputStream inputStream) {
        super(inputStream);
        this.f5765 = socket;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f5765.close();
    }
}
