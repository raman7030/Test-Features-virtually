package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12452 extends FilterInputStream implements InterfaceC14905 {
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C12452(InputStream inputStream) {
        super(inputStream);
    }
}
