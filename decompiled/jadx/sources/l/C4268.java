package l;

import java.io.IOException;
import java.io.PipedOutputStream;

/* JADX INFO: renamed from: l.ۘ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4268 extends C2857 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public PipedOutputStream f13811;

    @Override // java.io.PipedInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        PipedOutputStream pipedOutputStream = this.f13811;
        if (pipedOutputStream != null) {
            pipedOutputStream.close();
        }
        this.f13811 = null;
    }
}
