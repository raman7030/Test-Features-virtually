package p067l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14203 extends FilterInputStream implements InterfaceC16534 {
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C14203(InputStream inputStream) {
        super(inputStream);
    }
}
