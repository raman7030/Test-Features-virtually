package l;

import java.io.FilterInputStream;
import java.io.OutputStream;
import java.security.DigestInputStream;

/* JADX INFO: renamed from: l.۟֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C7135 extends FilterInputStream implements InterfaceC14905 {
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C7135(DigestInputStream digestInputStream) {
        super(digestInputStream);
    }
}
