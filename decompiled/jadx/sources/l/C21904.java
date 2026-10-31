package l;

import java.io.FilterInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩸᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X1S4 */
/* JADX INFO: loaded from: classes.dex */
public class C21904 extends FilterInputStream implements InterfaceC14905 {
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }
}
