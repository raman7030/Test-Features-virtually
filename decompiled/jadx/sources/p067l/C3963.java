package p067l;

import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

/* JADX INFO: renamed from: l.֫۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4GT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3963 extends DeflaterOutputStream {
    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        ((DeflaterOutputStream) this).def.end();
    }
}
