package p067l;

import java.io.IOException;
import java.io.PipedOutputStream;

/* JADX INFO: renamed from: l.ۘ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6425 extends C5084 {

    /* JADX INFO: renamed from: ᩶ */
    public PipedOutputStream f16628;

    @Override // java.io.PipedInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        PipedOutputStream pipedOutputStream = this.f16628;
        if (pipedOutputStream != null) {
            pipedOutputStream.close();
        }
        this.f16628 = null;
    }
}
