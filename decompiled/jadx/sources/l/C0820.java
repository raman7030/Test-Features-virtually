package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: renamed from: l.֨ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 131S */
/* JADX INFO: loaded from: classes2.dex */
public final class C0820 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Socket f2991;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C0820(Socket socket, InputStream inputStream) {
        super(inputStream);
        this.f2991 = socket;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f2991.close();
    }
}
