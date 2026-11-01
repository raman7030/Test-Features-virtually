package p067l;

import java.io.FilterInputStream;
import java.io.OutputStream;
import java.security.DigestInputStream;

/* JADX INFO: renamed from: l.۟֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C9149 extends FilterInputStream implements InterfaceC16534 {
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C9149(DigestInputStream digestInputStream) {
        super(digestInputStream);
    }
}
